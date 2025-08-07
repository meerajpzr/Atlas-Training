public class RecursiveArrayCopy {

    // Recursive function to copy array elements
    public static void copyArray(int[] source, int[] destination, int index) {
        // Base case: when index reaches array length
        if (index == source.length) {
            return;
        }

        // Copy current element
        destination[index] = source[index];

        // Recursive call for next index
        copyArray(source, destination, index + 1);
    }

    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int[source.length];

        copyArray(source, destination, 0);

        // Display copied array
        System.out.print("Copied array: ");
        for (int val : destination) {
            System.out.print(val + " ");
        }
    }
}
