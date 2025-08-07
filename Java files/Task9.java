import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {

    public static void main(String[] args) {

        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(24);
        numbers.add(37);
        numbers.add(42);
        numbers.add(59);

        // Filter odd numbers using streams
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        // Display the original and filtered list
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
