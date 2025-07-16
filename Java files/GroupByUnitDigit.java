import java.util.ArrayList;
import java.util.Scanner;

public class GroupByUnitDigit {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input the numbers as a space-separated string
        System.out.print("Enter numbers separated by commas: ");
        String input = scanner.nextLine();

        // Split the input string into an array of numbers (as strings)
        String[] numStr = input.split(",");

        // Create an ArrayList of ArrayLists to hold numbers based on unit digit
        ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

        // Initialize 10 groups for digits 0 through 9
        for (int i = 0; i < 10; i++) {
            groups.add(new ArrayList<>());
        }

        // Process each number
        for (String num : numStr) {
            int number = Integer.parseInt(num.trim());  // Parse the number

            // Get the unit digit using modulo 10
            int unitDigit = number % 10;

            // Add the number to the correct group based on its unit digit
            groups.get(unitDigit).add(number);
        }

        // Display the groups with non-empty lists
        for (int i = 0; i < 10; i++) {
            if (!groups.get(i).isEmpty()) {
                System.out.println("Array " + (i + 1) + " has: " + groups.get(i));
            }
        }

        scanner.close(); // Close the scanner
    }
}
