import java.io.*;

class FileRenameDemo {
    public static void main(String args[]) {
        // Check if correct number of arguments are passed
        if (args.length != 2) {
            System.out.println("Please provide the old and new filenames.");
            return;
        }

        // Create File objects for the old and new filenames
        File f1 = new File(args[0]);
        File f2 = new File(args[1]);

        // Check if the source file exists
        if (!f1.exists()) {
            System.out.println("The file " + f1 + " does not exist.");
            return;
        }

        // Attempt to rename the file
        if (f1.renameTo(f2)) {
            System.out.println("File renamed successfully: " + f1 + " to " + f2);
        } else {
            System.out.println("Failed to rename file " + f1 + " to " + f2);
        }
    }
}
