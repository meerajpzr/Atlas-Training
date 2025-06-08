import java.util.Scanner;
public class LoginValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String correctLoginId = "Meera";
        String correctPwd = "12345867";


        String loginid = "";
        String pwd = "";
        int count = 0;


        while (!(loginid.equals(correctLoginId) && pwd.equals(correctPwd))) {

            count++;


            System.out.println("Attempt " + count + ": Enter your login ID and password:");

            // Take user input for login id and password
            loginid = sc.nextLine();
            pwd = sc.nextLine();


            if (loginid.equals(correctLoginId) && pwd.equals(correctPwd)) {
                System.out.println("You have logged in successfully for the " + count + " time(s).");
            } else {

                System.out.println("Invalid login ID or password. Please try again.");
            }
        }


        sc.close();
    }
}
