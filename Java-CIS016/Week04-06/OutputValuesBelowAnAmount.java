import java.util.Scanner; 
// Lab Program 19
public class OutputValuesBelowAnAmount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input

      int numElements = scnr.nextInt();

      for(int i = 0; i < numElements; i++){
        userValues[i] = scnr.nextInt();
      }

      int threshold = scnr.nextInt();

    for(int i = 0; i < numElements; i++){
        if(userValues[i] < threshold){
            System.out.print(userValues[i] + ",");
        }
    }
    System.out.println("");
      
   }
}