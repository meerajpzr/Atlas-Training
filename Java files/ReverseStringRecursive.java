public class ReverseStringRecursive {

    // Recursive helper method
    public static void reverse(char[] str, int start, int end) {
        if (start >= end) return;

        // Swap characters at start and end
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        // Recursive call
        reverse(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "hello";

        // Convert string to char array
        char[] chars = input.toCharArray();

        // Call recursive reverse
        reverse(chars, 0, chars.length - 1);

        // Print reversed string
        String reversed = new String(chars);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
