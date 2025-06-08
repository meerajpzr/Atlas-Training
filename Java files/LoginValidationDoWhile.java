import java.util.Scanner;  // Import Scanner to take input from the user

public class LoginValidationDoWhile {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Define the correct login credentials
        String correctLoginId = "Meera";
        String correctPwd = "12345867";

        // Declare variables to store the user input and login attempt counter
        String loginid = "";
        String pwd = "";
        int count = 0;

        // Start the do-while loop to check the login credentials
        do {
            // Increment the attempt count
            count++;

            // Display the login attempt number
            System.out.println("Attempt " + count + ": Enter your login ID and password:");

            // Take user input for login id and password
            loginid = sc.nextLine();
            pwd = sc.nextLine();

            if (loginid.equals(correctLoginId) && pwd.equals(correctPwd)) {
                System.out.println("You have logged in successfully for the " + count + " time(s).");
            } else {

                System.out.println("Invalid login ID or password. Please try again.");
            }

        } while (!(loginid.equals(correctLoginId) && pwd.equals(correctPwd)));
        sc.close();
    }
}

