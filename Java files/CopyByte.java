import java.io.*;

class CopyByte {
    public static void main(String args[]) {
        try {
            byte b = 0;  // Declare a byte variable to store each byte read
            FileInputStream infile = new FileInputStream("NewFile01.txt");  // Input file stream
            FileOutputStream outfile = new FileOutputStream("NewFile05.txt");  // Output file stream

            // Read one byte at a time from input file and write it to output file
            while ((b = (byte) infile.read()) != -1) {  // Read byte by byte
                outfile.write(b);  // Write the byte to the output file
            }

            System.out.println("Byte Copied From NewFile01.txt to NewFile05.txt File");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");  // Handle file not found error
        } catch (IOException e) {
            System.out.println(e.getMessage());  // Handle IO exceptions
        }
    }
}
