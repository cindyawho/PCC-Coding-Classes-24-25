import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
    public static char computeGrade(int studentTotal){
        double studentAverage = (double) studentTotal / 3.0;
        if(studentAverage >= 90) {
            return 'A';
        } else if(studentAverage >= 80) {
            return 'B';
        } else if(studentAverage >= 70) {
            return 'C';
        } else if(studentAverage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);

        /* TODO: Declare any necessary variables here. */
        String dataFileName;
        String currInfo;
        int currNumInfo;
        FileInputStream fileByteStream = null; // File input stream
        Scanner inFS = null;                   // Scanner object
        Scanner inLine = null;                   // Scanner object
        double mid1 = 0;
        double mid2 = 0;
        double finalExam = 0;
        int currStudent;
        int numStudents = 0;
        char letterGrade;
        
        /* TODO: Read a file name from the user and read the tsv file here. */
        dataFileName = scnr.next();
        // Try to open file
        fileByteStream = new FileInputStream(dataFileName);
        inFS = new Scanner(fileByteStream);
        // File output initialization
        FileOutputStream fileStream = new FileOutputStream("report.txt");
        PrintWriter outFS = new PrintWriter(fileStream);
        // Read Stream
        while (inFS.hasNextLine()) {
            numStudents += 1;
            currStudent = 0;
            inLine = new Scanner(inFS.nextLine());
            for(int i = 0; i < 2; i++){
                currInfo = inLine.next();
                outFS.print(currInfo + "\t");
            }
            for(int i = 0; i < 3; i++){
                currNumInfo = inLine.nextInt();
                outFS.print(currNumInfo + "\t");
                if(i == 0){
                    currStudent = currNumInfo;
                    mid1 += (double) currNumInfo;
                }
                else if(i == 1){ // MIDTERM 2
                    currStudent += currNumInfo;
                    mid2 += (double) currNumInfo;
                } else {
                    currStudent += currNumInfo;
                    finalExam += (double) currNumInfo;
                    letterGrade = computeGrade(currStudent);
                    outFS.print(letterGrade + "");
                }
            }
            outFS.println("");
        }
        
        /* TODO: Compute student grades and exam averages, then output results to a text file here. */
        
        outFS.println("");
        mid1 /= (double) numStudents;
        mid2 /= (double) numStudents;
        finalExam /= (double) numStudents;
        outFS.printf("Averages: Midterm1 %.2f", mid1);
        outFS.printf(", Midterm2 %.2f", mid2);
        outFS.printf(", Final %.2f\n", finalExam);
        outFS.close();
   }
}