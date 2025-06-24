public class DivisionByZeroDemo {
    public static void main(String[] args) {

        // Step 3: Declare two numbers
        int n = 10;
        int m = 0;

        try {
            // Step 4: Attempt to divide
            int ans = n / m;

            // This line won't be reached if division fails
            System.out.println("Answer: " + ans);
        } catch (ArithmeticException e) {
            // Step 5: Catch the division by zero
            System.out.println("❌ Error: Division by zero is not allowed!");
        } finally {
            // Step 6: This block always runs
            System.out.println("✅ Program continues after handling the exception.");
        }
    }
}
