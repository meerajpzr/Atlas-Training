public class PalindromeRecursive {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: crossed pointers or single char
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive check for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word = "madam"; // Try other examples like "racecar", "hello", etc.

        // Normalize case and remove spaces if needed
        word = word.toLowerCase().replaceAll("\\s+", "");

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println("The string '" + word + "' is a palindrome.");
        } else {
            System.out.println("The string '" + word + "' is not a palindrome.");
        }
    }
}
