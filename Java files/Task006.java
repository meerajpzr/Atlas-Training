public class Task006 {

    public static void main(String[] args) {
        try {
            int a[] = new int[2]; // array with indexes 0 and 1
            int b = 0;
            int c = 1 / b; // This will throw ArithmeticException (divide by zero)
            System.out.println("Access element three :" + a[3]); // This line won't execute
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException thrown  :" + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
        }
        catch (Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");
    }
}
