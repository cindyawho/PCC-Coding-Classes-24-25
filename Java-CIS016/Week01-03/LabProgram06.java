import java.util.Scanner;

// INSTRUCTIONS
// Write a program that reads integers userNum and divNum as input, and outputs userNum divided by divNum three times. 

public class LabProgram06 {
   public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            int userNum = scnr.nextInt();
            int divNum = scnr.nextInt();
            System.out.print(userNum/divNum + " " + (userNum/divNum)/divNum + " " + ((userNum/divNum)/divNum)/divNum);
        }
    }

}
