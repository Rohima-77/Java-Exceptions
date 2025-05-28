public class NullPointerExample {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.length());  // name is null
        } catch (NullPointerException e) {
            System.out.println("Try access to Null object: " + e.getMessage());
        }
    }
}
