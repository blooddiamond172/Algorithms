public class BinarySearch {
    public static int binarySearch(int[] numbers, int target){
        int first = 0;
        int last = numbers.length - 1;
        while (first <= last){
            int middle = (first+last)/2;
            if (numbers[middle] < target){
                first = middle + 1;
            } else if (numbers[middle] > target) {
                last = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    private static void showResult(int n) {
        if ( n != -1 ){
            System.out.println("Index in array: " + n);
        } else {
            System.out.println("Not found in array");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        showResult(binarySearch(numbers,6));
    }
}
