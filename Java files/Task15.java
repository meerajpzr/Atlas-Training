import java.util.stream.Stream;

public class Task15 {

    public static void main(String[] args) {

        System.out.println("Numbers after skipping the first 15:");

        // Generate stream from 1 to 20
        Stream<Integer> nums = Stream
                .iterate(1, n -> n + 1)
                .limit(20);

        // Skip first 15 numbers
        Stream<Integer> skipNums = nums.skip(15);

        // Print remaining numbers
        skipNums.forEach(System.out::println);
    }
}
