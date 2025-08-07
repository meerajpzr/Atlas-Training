import java.util.stream.Stream;

public class Task14{

    public static void main(String[] args) {

        System.out.println("First 10 numbers from a stream of 20:");

        Stream<Integer> nums = Stream
                .iterate(1, n -> n + 1) // generates 1, 2, 3, ...
                .limit(20);             // limit to 20 elements

        nums
                .limit(10)                 // only take first 10
                .forEach(System.out::println); // print each
    }
}
