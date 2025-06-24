import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        File file = new File("C://Users//YourName//Desktop//file.txt");

        try {
            FileReader fr = new FileReader(file);
            System.out.println("✅ File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("❌ File not found: " + file.getAbsolutePath());
            e.printStackTrace();

        }
    }
}
