public class Test {
    // Driver method
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 5, 4 };

        // Passing array to method 'sum'
        sum(arr);
    }

    // Method to calculate the sum of array elements
    public static void sum(int[] arr) {
        int sum = 0;

        // Loop through array and add each element to sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Print the result
        System.out.println("Sum of array values: " + sum);
    }
}
