class OuterClass {
    int x = 10;

    // 🔹 Static inner class
    static class InnerClass {
        int y = 5;
    }
}

public class Task017{
    public static void main(String[] args) {
        // You DO NOT need an OuterClass object to create a static inner class object
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();

        // Outer class object is still needed to access non-static variable x
        OuterClass myOuter = new OuterClass();

        System.out.println(myInner.y + myOuter.x);  // Output: 15
    }
}
