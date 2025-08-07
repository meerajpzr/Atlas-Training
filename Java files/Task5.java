@FunctionalInterface
interface MyInterface {
    // Abstract method to reverse a string
    String reverse(String str);
}

public class Task5 {
    public static void main(String[] args) {

        // Lambda expression to reverse a string
        MyInterface ref = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        // Call the reverse method
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }
}
