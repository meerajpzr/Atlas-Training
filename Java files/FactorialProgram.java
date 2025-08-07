import java.util.Scanner;

public class FactorialProgram {

    // Recursive method to find factorial
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialRecursive(n - 1);
    }

    // Iterative method to find factorial
    public static long factorialIterative(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Recursive factorial of " + num + " is: " + factorialRecursive(num));
            System.out.println("Iterative factorial of " + num + " is: " + factorialIterative(num));
        }

        scanner.close();
    }
}
