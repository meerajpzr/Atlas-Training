import java.util.Stack;

class Ds_Stack_Pop {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        // Push elements to the stack
        names.push("Prasunamba");
        names.push("Meher");
        names.push(".MK");

        System.out.println("Before deletion:");
        System.out.println("Stack of names: " + names);

        // Pop element from the stack
        String dummy = names.pop();

        System.out.println("After deletion:");
        System.out.println("Stack of names: " + names);
        System.out.println("Deleted element is: " + dummy);
    }
}
