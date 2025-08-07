public class DigitOperations {

    // Recursive function to count digits
    public static int countDigits(int num) {
        // Base case: when num is 0
        if (num == 0)
            return 0;
        // Recursive case: strip last digit and count
        return 1 + countDigits(num / 10);
    }

    // Recursive function to sum digits
    public static int sumDigits(int num) {
        // Base case
        if (num == 0)
            return 0;
        // Recursive case: get last digit and sum recursively
        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {
        int number = 12345;

        int digitCount = countDigits(number);
        int digitSum = sumDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Total digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
    }
}
