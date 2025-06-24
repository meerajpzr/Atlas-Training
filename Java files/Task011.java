import java.util.ArrayList;

public class Task011 {
    public static void main(String[] args) {

        // Create an ArrayList of Integer type
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add 10 elements using a for loop
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Display the ArrayList
        System.out.println("ArrayList with 10 elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
