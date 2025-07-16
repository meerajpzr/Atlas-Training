import java.util.Scanner;

public class DigitByDigit1 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 1: Display the digits one by one
        // Extract and display each digit from right to left
        int unitsDigit = number % 10;               // Unit place
        int tensDigit = (number / 10) % 10;          // Tens place
        int hundredsDigit = (number / 100) % 10;     // Hundreds place
        int thousandsDigit = (number / 1000) % 10;   // Thousands place
        int tenThousandsDigit = (number / 10000) % 10; // Ten-thousands place

        // Display the digits (Works for a number with at most 5 digits)
        System.out.println("Units digit is: " + unitsDigit);
        System.out.println("Tens digit is: " + tensDigit);
        System.out.println("Hundreds digit is: " + hundredsDigit);
        System.out.println("Thousands digit is: " + thousandsDigit);
        System.out.println("Ten-thousands digit is: " + tenThousandsDigit);

        // Step 2: Display the number of digits
        // Calculate the number of digits in the number
        int digitCount = (int) Math.log10(number) + 1;

        // Display the number of digits
        System.out.println("This is a " + digitCount + " digit number.");
    }
}
