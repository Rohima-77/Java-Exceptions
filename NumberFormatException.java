public class NumberFormatExample {
    public static void main(String[] args) {
        String input = "abc";
        try {
            int number = Integer.parseInt(input);  // "abc" is not number
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e.getMessage());
        }
    }
}
