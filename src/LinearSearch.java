public class LinearSearch {
    public static int linearSearch(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            if ( numbers[i] == target ) {
                return i;
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
        int[] numbers = {1,2,6,4,8,5,9,7};
        showResult(linearSearch(numbers,9));
    }
}
