// Task 28 - Java program to demonstrate
// return of array from a method

class Tests {
    public static void main(String[] args) {
        // Call method m1() and store the returned array
        int[] arr = m1();

        // Print each element of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method that returns an array of integers
    public static int[] m1() {
        // Return an array directly
        return new int[] { 1, 2, 3 };
    }
}

