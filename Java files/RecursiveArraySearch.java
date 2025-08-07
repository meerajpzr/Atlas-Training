public class RecursiveArraySearch {

    // Recursive method to search for an element in the array
    public static int search(int[] arr, int target, int index) {
        // Base case: if index reaches the end of the array
        if (index == arr.length) {
            return -1; // element not found
        }

        // If current element matches the target
        if (arr[index] == target) {
            return index; // return the position (0-based)
        }

        // Recursive call for next index
        return search(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] myArray = {10, 25, 30, 45, 50};
        int target = 45;

        int result = search(myArray, target, 0);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
