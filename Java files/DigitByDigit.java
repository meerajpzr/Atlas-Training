import java.util.Scanner;

public class DigitByDigit {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a 5-digit number
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        // Validate if the input is a 5-digit number
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid 5-digit number.");
            return;
        }

        // Extract and display each digit from right to left
        int unitsDigit = number % 10;               // Unit place
        int tensDigit = (number / 10) % 10;          // Tens place
        int hundredsDigit = (number / 100) % 10;     // Hundreds place
        int thousandsDigit = (number / 1000) % 10;   // Thousands place
        int tenThousandsDigit = (number / 10000) % 10; // Ten-thousands place

        // Display the digits
        System.out.println("Units digit is: " + unitsDigit);
        System.out.println("Tens digit is: " + tensDigit);
        System.out.println("Hundreds digit is: " + hundredsDigit);
        System.out.println("Thousands digit is: " + thousandsDigit);
        System.out.println("Ten-thousands digit is: " + tenThousandsDigit);
    }
}
