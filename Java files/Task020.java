public class Task020 {
    public static void main(String[] args) {
        // Step 1: Initialize an array with your name (replace with your own name)
        char[] Name = {'M', 'e', 'e', 'r', 'a'};

        // Step 2: Print the array directly
        System.out.print("My name is: ");
        System.out.println(Name); // This prints the entire char array as a string

        // Step 3: Find the length of the array
        int n = Name.length;

        // Step 4: Print the number of letters in the name
        System.out.println("There are " + n + " letters in my name");

        // Step 5: Use for loop to display each letter with a space
        System.out.print("Letters in my name: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }

        System.out.println(); // For a clean newline at the end
    }
}
