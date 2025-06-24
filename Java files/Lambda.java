
import java.lang.FunctionalInterface;

// Define the functional interface
@FunctionalInterface
interface PiCalculator {
    // Abstract method to return Pi value
    double getPiValue();
}

public class Lambda {

    public static void main(String[] args) {

        // Lambda expression to provide implementation for the getPiValue method
        PiCalculator piRef = () -> 3.1415;

        // Print the value of Pi by calling the lambda method
        System.out.println("Value of Pi = " + piRef.getPiValue());
    }
}
