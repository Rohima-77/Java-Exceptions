public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]);  // index 5 is not found
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is fault: " + e.getMessage());
        }
    }
}
