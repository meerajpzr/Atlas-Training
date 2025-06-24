import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumbersFilter {

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Filter odd numbers using stream() and filter()
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0) // Check if the number is odd
                .collect(Collectors.toList()); // Collect the result into a new list

        // Display the filtered odd numbers
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
