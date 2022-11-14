package sort;

public class MergeSort {

    public static void sort(int[] arr, int l, int r) {
        if (l<r) {
            int m = l + (r-l) / 2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, m, l, r);
        }
    }

    private static void merge(int[] arr, int m, int l, int r) {

        // Find size of two sub-array to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create two new array
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to two new array
        int sizeOfL = L.length;
        for (int i = 0; i < sizeOfL; i++) {
            L[i] = arr[l + i];
        }

        int sizeOfR = R.length;
        for (int j = 0; j < sizeOfR; j++) {
            R[j] = arr[m + 1 + j];
        }

        // Initial indexs of first and second sub-arrays
        int i = 0;
        int j = 0;

        // Initial index of merged array
        int k = l;
        while (i < n1 && i < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R array
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    private static void showArray(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i + ", ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Array before arrange: ");
        showArray(numbers);

        System.out.println("Array after arrange by merge sort:");
        sort(numbers, 0, numbers.length - 1);
        showArray(numbers);
    }

}
