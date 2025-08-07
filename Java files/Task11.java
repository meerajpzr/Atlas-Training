import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {

    public static void main(String[] args) {

        // Create an ArrayList with duplicate integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List with duplicates: " + numbers);

        // Remove duplicates using distinct()
        List<Integer> noDuplicates = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("List after removing duplicates: " + noDuplicates);
    }
}
