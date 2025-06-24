public class Task007 {

    public static void main(String[] args) {
        try {
            int a[] = new int[2];  // array with indexes 0 and 1
            int b = 0;
            int c = 1 / b;         // This line throws ArithmeticException
            System.out.println("Access element three :" + a[3]); // Won’t be executed
        }

        // Multi-catch block: handles both exceptions
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception thrown  :" + e);
        }

        System.out.println("Out of the block");
    }
}
