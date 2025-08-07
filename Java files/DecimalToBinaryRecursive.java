public class DecimalToBinaryRecursive {

    // Recursive method to convert decimal to binary
    public static void convertToBinary(int number) {
        if (number == 0) {
            return; // Base case
        }

        // Recursive call for higher bits
        convertToBinary(number / 2);

        // Print current bit (after recursive call to maintain order)
        System.out.print(number % 2);
    }

    public static void main(String[] args) {
        int decimal = 13;

        System.out.print("Binary of " + decimal + " is: ");
        if (decimal == 0) {
            System.out.print(0); // Special case for 0
        } else {
            convertToBinary(decimal);
        }
        System.out.println(); // for newline
    }
}

