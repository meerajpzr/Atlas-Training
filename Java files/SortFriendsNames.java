import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortFriendsNames {

    public static void main(String[] args) {

        // Create an ArrayList of friends' names
        List<String> friends = new ArrayList<>();
        friends.add("Alice");
        friends.add("Bob");
        friends.add("Charlie");
        friends.add("David");
        friends.add("Eva");
        friends.add("Frank");

        // Sort the names alphabetically using stream() and sorted()
        List<String> sortedNames = friends.stream()
                .sorted()  // Sorts names alphabetically
                .collect(Collectors.toList()); // Collect the sorted names into a new list

        // Display the sorted names
        System.out.println("Sorted friends' names: " + sortedNames);
    }
}
