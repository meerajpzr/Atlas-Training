import java.io.*;

public class ReadChar {
    public static void main(String args[]) {
        FileReader fr = null;
        try {
            fr = new FileReader("FileName03.txt"); // Open the file for reading
            int ch; // To store the character read
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch); // Print the character read
            }
            System.out.println("\nReading complete"); // Indicate reading is done
            fr.close(); // Close the file reader
        }
        catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
        catch (IOException e) {
            System.out.println(e.getMessage()); // Print error message if IO exception occurs
        }
    }
}
