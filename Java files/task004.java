public class task004 {

        public static void main(String args[]) {
            try {
                int a[] = new int[2];  // array of size 2: indices 0,1
                int b = 2;
                int c = 1/b;           // causes ArithmeticException (divide by zero)
                System.out.println("Access element three :" + a[3]); // would cause ArrayIndexOutOfBoundsException
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
            } catch (Exception e) {
                System.out.println("Exception thrown  :" + e);
            }
            System.out.println("Out of the block");
        }
    }
