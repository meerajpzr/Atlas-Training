public class hello
import java.util.Scanner;  // Import Scanner for input

public class hello {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Compare and print the greatest number
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The first number (" + num1 + ") is the greatest.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The second number (" + num2 + ") is the greatest.");
        } else {
            System.out.println("The third number (" + num3 + ") is the greatest.");
        }

        // Close the scanner object
        scanner.close();
    }
}
