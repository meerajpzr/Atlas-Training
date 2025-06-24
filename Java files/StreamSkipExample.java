import java.util.stream.Stream;

public class StreamSkipExample {

    public static void main(String[] args) {

        // Create a Stream starting from 1, and incrementing by 1, limiting it to 20 values
        Stream<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(20);  // Generate numbers 1 to 20

        // Skip the first 15 numbers and display the remaining numbers
        Stream<Integer> skipNums = nums.skip(15);

        // Print the remaining numbers from 16 onwards using forEach
        skipNums.forEach(System.out::println);
    }
}
