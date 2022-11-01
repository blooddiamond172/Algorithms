public class RecursiveLinearSearch {

    private static int recursiveLinearSearch(int[] array,
                                             int target,
                                             int start,
                                             int end) {
        if (start > end)
            return -1;
        if (array[start] == target)
            return start;
        if (array[end] == target)
            return end;
        return recursiveLinearSearch(array, target, start+1, end - 1);
    }

    private static void showResult(int n) {
        if ( n != -1 ){
            System.out.println("Index in array: " + n);
        } else {
            System.out.println("Not found in array");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 4, 3, 6, 8, 7, 9};
        showResult(recursiveLinearSearch(numbers, 8, 0, numbers.length - 1));
    }
}
