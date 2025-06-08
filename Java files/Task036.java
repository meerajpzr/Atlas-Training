public class Task036 {

    // Method with int first, then float
    void add(int x, float y) {
        System.out.println("Method add(int x, float y) called");
        System.out.println("x = " + x + ", y = " + y);
    }

    // Method with float first, then int
    void add(float x, int y) {
        System.out.println("Method add(float x, int y) called");
        System.out.println("x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Task036 obj = new Task036();

        obj.add(10.50f, 60);    // Calls add(float, int)
        obj.add(100, 80.80f);   // Calls add(int, float)
    }
}
