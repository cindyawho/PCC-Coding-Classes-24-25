import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String dataFileName = scnr.next();
        String currLine;

        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object

        // Try to open file
        fileByteStream = new FileInputStream(dataFileName);
        inFS = new Scanner(fileByteStream);

        while (inFS.hasNext()) {
            currLine = inFS.next();
            currLine = currLine.replace("_photo.jpg", "_info.txt");
            System.out.println(currLine);
        }

        // Done with file, so try to close it
        fileByteStream.close(); // close() may throw IOException if fails
   }
}