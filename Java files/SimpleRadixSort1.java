import java.util.Arrays;

public class SimpleRadixSort1 {

    // Function to perform counting sort based on the current digit
    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // Output array
        int[] count = new int[10]; // Count array to store frequency of digits (0-9)

        // Count occurrences of each digit
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] to store the actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array using the positions in count[]
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] contains sorted numbers
        System.arraycopy(output, 0, arr, 0, n);
    }

    // Main function to implement Radix Sort
    public static void radixSort(int[] arr) {
        // Find the maximum number to determine the number of digits
        int max = Arrays.stream(arr).max().getAsInt();

        // Perform counting sort for every digit (units, tens, hundreds, etc.)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp); // Sort based on each digit
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66}; // Example array

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Apply Radix Sort
        radixSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
