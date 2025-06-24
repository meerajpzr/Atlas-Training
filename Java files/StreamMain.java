import java.util.ArrayList;
import java.util.List;

public class StreamMain {

    // Create an object of list using ArrayList
    static List<String> places = new ArrayList<>();

    // Preparing our data
    public static List getPlaces(){

        // Add places and countries to the list
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main( String[] args ) {

        // Get the places from the list
        List<String> myPlaces = getPlaces();

        // Print a header message
        System.out.println("Places from Nepal:");

        // Stream processing:
        // 1. Filter the places that start with "Nepal"
        // 2. Convert the filtered places to uppercase
        // 3. Sort the places in ascending order
        // 4. Print each place in the stream
        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal")) // Filter places that start with "Nepal"
                .map((p) -> p.toUpperCase())          // Convert to uppercase
                .sorted()                             // Sort alphabetically
                .forEach((p) -> System.out.println(p)); // Print each place
    }
}

