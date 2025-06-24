class OuterClass {
    int x = 50;  // Outer class variable

    class InnerClass {
        public int innerMethod() {
            return x;  // Access outer class variable directly
        }
    }
}

public class DriverClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();                   // Create outer class object
        OuterClass.InnerClass myInner = myOuter.new InnerClass(); // Create inner class object

        System.out.println(myInner.innerMethod());  // Prints 50
    }
}
