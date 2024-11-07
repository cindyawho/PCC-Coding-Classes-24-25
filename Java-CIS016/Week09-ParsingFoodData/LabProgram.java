import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        // VARIABLES
        String[] category = new String[50];
        String[] name = new String[50];
        String[] description = new String[50];
        String[] availability = new String[50];
        int count = 0;

        // SCANNER VARIABLES
        FileInputStream fileByteStream = null;      // File input stream
        Scanner inFS = null;                        // Scanner object
        Scanner inLine = null;                      // Scanner object
        String dataFileName = scnr.next();
        String inLineText;
        String[] inLineInfo;
        
        // READ FILE
        fileByteStream = new FileInputStream(dataFileName);
        inFS = new Scanner(fileByteStream);
        while (inFS.hasNextLine()) {
            inLine = new Scanner(inFS.nextLine());
            inLineText = inLine.nextLine();
            inLineInfo = inLineText.split("\t");
            category[count] = inLineInfo[0];
            name[count] = inLineInfo[1];
            description[count] = inLineInfo[2];
            availability[count] = inLineInfo[3];
            count += 1;
        }

        /* Type your code here. */
        for(int i = 0; i < count; i++){
            if(availability[i].equals("Available")){
                System.out.println(name[i] + " (" + category[i] + ") -- " + description[i]);
            }
        }
   }
}
