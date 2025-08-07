import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {

    public static void main(String[] args) {

        // Create an ArrayList of friend names
        List<String> friends = new ArrayList<>();
        friends.add("Meera");
        friends.add("Anjali");
        friends.add("Ravi");
        friends.add("Zara");
        friends.add("Bhavna");

        System.out.println("Original List: " + friends);

        // Sort the names using stream
        List<String> sortedNames = friends.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted List: " + sortedNames);
    }
}
