// User-defined exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Task013 {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception");
        } catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
