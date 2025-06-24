import java.util.stream.Stream;

public class StreamIterationExample {

    public static void main(String[] args) {


        Stream<Integer> nums = Stream.iterate(1, n -> n + 1)
                .limit(20);  // limit to 20 values

        // Now limit to the first 10 values and display them
        nums.limit(10)
                .forEach(System.out::println);  // This prints values 1 to 10
    }
}
