public class Task007 {

    public static void main(String[] args) {
        try {
            int[] a = new int[2];
            int b = 0;
            int c = 1 / b; // Causes ArithmeticException
            System.out.println("Access element: " + a[3]); // Won’t run
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception thrown: " + e);
        }

        System.out.println("Out of the block");
    }
}

