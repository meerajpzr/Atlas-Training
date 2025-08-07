import java.util.Stack;

class Ds_Stack_SearchPosition {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        // Pushing values into the stack
        names.push("Prasunamba");
        names.push("Meher");
        names.push(".MK");

        // Displaying stack
        System.out.println("Stack of names: " + names);

        // Value to search
        String val = "Meher";

        // Search the value in the stack
        int position = names.search(val);

        // Display result
        if (position == -1) {
            System.out.println("The value '" + val + "' was not found in the stack.");
        } else {
            System.out.println("The searched value '" + val + "' is at position " + position + " from the top of the stack.");
        }
    }
}
