

public class Task030 {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] intArray = { { 1, 2, 3 }, { 4, 5 } };

        // Clone the 2D array (shallow copy)
        int[][] cloneArray = intArray.clone();

        // Check if the original and cloned arrays are the same object
        System.out.println(intArray == cloneArray);  // Expected: false

        // Check if the sub-arrays are the same objects (shared in shallow copy)
        System.out.println(intArray[0] == cloneArray[0]);  // Expected: true
        System.out.println(intArray[1] == cloneArray[1]);  // Expected: true
    }
}
