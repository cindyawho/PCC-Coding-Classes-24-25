import java.util.Scanner;
// Lab Program 18
public class OutputNumbersInReverse {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed
      int[] reverseList = new int[20]; 

      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
      for(int i = 0; i < numElements; i++){
        userList[i] = scnr.nextInt();
        reverseList[numElements - i - 1] = userList[i];
      }

      for(int i = 0; i < numElements; i++){
        System.out.print(reverseList[i] +",");
      }
      System.out.println("");
   }
}
