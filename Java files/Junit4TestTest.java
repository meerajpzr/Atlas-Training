
import org.junit.jupiter.api.Test; // JUnit 5 Test annotation
import org.junit.jupiter.api.Assertions; // JUnit 5 Assertions
import org.example.Junit4Test; // Import the class you're testing (adjust package name if necessary)

public class Junit4TestCases {

    @Test
    public void testCompareWhenFirstNumberIsGreaterThanSecond() {
        Junit4Test obj = new Junit4Test(); // Create instance of Junit4Test
        int value = obj.compare(20, 10); // Call the method you want to test
        Assertions.assertEquals(1, value);  // Expected: 1, because 20 > 10
    }
}
