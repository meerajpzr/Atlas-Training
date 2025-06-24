public class Task008 {

    public static void main(String[] args) {
        try {
            int a[] = new int[2];

            // Inner try-catch block for division
            try {
                int b = 0;
                int c = 1 / b;  // This will throw ArithmeticException
            } catch (Exception e) {
                System.out.println("Exception thrown: " + e);
            }

            // This line will still execute
            System.out.println("Access element three :" + a[3]); // This will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }

        System.out.println("Out of the block");
    }
}
