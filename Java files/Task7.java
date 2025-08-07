import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {

    public static void main(String[] args) {

        // Create a list of 5 integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        // Use stream to calculate square of each number
        List<Integer> squareOfNums = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        // Display the squared numbers
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Squares: " + squareOfNums);
    }
}
