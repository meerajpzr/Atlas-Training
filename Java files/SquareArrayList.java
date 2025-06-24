import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareArrayList {

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(8);


        List<Integer> squareofNums = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());


        System.out.println("Squares of the numbers:");
        squareofNums.forEach(System.out::println);
    }
}
