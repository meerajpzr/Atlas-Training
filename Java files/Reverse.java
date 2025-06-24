
@FunctionalInterface
interface StringReverser {

    // Abstract method to reverse a string
    String reverse(String n);
}

public class Reverse {

    public static void main(String[] args) {

        // Declare a reference to StringReverser interface
        // Assign a lambda expression to the reference
        StringReverser ref = (str) -> {

            String result = "";
            // Loop through the string in reverse order and build the reversed string
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result; // Return the reversed string
        };

        // Call the reverse method of the interface and print the result
        System.out.println("Lambda reversed = " + ref.reverse("Lambda"));
    }
}
