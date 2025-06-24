import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // Create an ArrayList to store numbers with duplicates
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);

        // Remove duplicates using stream() and distinct()
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()  // Remove duplicates
                .collect(Collectors.toList()); // Collect results into a new list

        // Display the list without duplicates
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}
