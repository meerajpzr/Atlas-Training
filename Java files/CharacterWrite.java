import java.io.*;

public class CharacterWrite {
    public static void main(String args[]) {
        File f1 = new File("FileName03.txt");
        FileWriter fw = null;

        try {
            // Create a FileWriter object to write to the file
            fw = new FileWriter(f1);

            // Write data to the file
            fw.write("Meera \n");
            fw.write("J \n");

            // Close the FileWriter to release resources
            fw.close();
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            // Handle IO exception
            System.out.println(e.getMessage());
        }

        // Confirm successful write operation
        System.out.println("Write operation done!!");
    }
}
