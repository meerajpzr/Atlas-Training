

public class Task026 {
    public static void main(String[] args) {
        // Declaring and initializing a 2D array (3x3)
        int[][] arr = {
                { 2, 7, 9 },
                { 3, 6, 1 },
                { 7, 4, 2 }
        };

        // Traversing and printing the 2D array
        for (int i = 0; i < 3; i++) {         // Outer loop for rows
            for (int j = 0; j < 3; j++) {     // Inner loop for columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();             // Move to the next line after each row
        }
    }
}
