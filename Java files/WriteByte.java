import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByte {
    public static void main(String args[]) {
        File f1 = new File("FileName01.txt"); // Create a new file
        FileOutputStream outfile = null;

        // Correct byte array for "I LOVE INDIA"
        byte[] Text = {'I', ' ', 'L', 'I', 'K', 'E', ' ', 'I', 'N', 'D', 'I', 'A'};

        try {
            outfile = new FileOutputStream(f1); // Create and open file
            outfile.write(Text);                // Write bytes
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                if (outfile != null)
                    outfile.close(); // Close the stream
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        System.out.println("Write Byte");
        System.out.println("Thank You...!!!");
    }
}
