package search;

public class LinearSearchUsingRecursive {

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 3, 6, 2, 8, 7};

        int index = getIndex(arr, arr.length, 8);

        System.out.println(index);
    }

    private static int getIndex(int[] arr, int sizeOfArray, int value) {
        return recursiveLinearSearch(arr, sizeOfArray, value);
    }

    private static int recursiveLinearSearch(int[] arr, int sizeOfArray, int value) {
        if (sizeOfArray <= 0) {
            return -1;
        } else {
            if (arr[sizeOfArray - 1] == value) {
                return sizeOfArray;
            }
        }
        return recursiveLinearSearch(arr, (sizeOfArray - 1), value);
    }

}
