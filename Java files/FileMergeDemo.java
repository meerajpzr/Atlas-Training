import java.io.*;

class FileMergeDemo {
    public static void main(String args[]) {
        try {

            FileInputStream file1 = new FileInputStream("NewFile01.txt");
            FileInputStream file2 = new FileInputStream("NewFile02.txt");


            SequenceInputStream file3 = new SequenceInputStream(file1, file2);


            BufferedInputStream br1 = new BufferedInputStream(file3);


            FileOutputStream fileOut = new FileOutputStream("MergedFile.txt");

            // Create BufferedOutputStream for efficient writing to the file
            BufferedOutputStream br2 = new BufferedOutputStream(fileOut);

            int ch;
            // Read content from br1 (merged input streams) and write it to the new file
            while ((ch = br1.read()) != -1) {
                br2.write(ch);
            }

            // Close all streams to release resources
            br1.close();
            br2.close();
            file1.close();
            file2.close();
            fileOut.close();

            // Print success message
            System.out.println("Files Merged Successfully into 'MergedFile.txt'");
        } catch (IOException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        }
    }
}
