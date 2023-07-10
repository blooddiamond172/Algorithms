package search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 3, 6, 2, 8, 7};

        int index = getIndex(arr, 8);

        System.out.println(index + 1);
    }

    private static int getIndex(int[] arr, int value) {
        return linearSearch(arr, value);
    }

    private static int linearSearch(int[] arr, int value) {
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
