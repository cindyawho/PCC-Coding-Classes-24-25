import java.util.Scanner; 
// Lab Program 20

public class AdjustListByNormalizing {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double[] userList = new double[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list

        numElements = scnr.nextInt(); 

        double maxNum = userList[0];

        for(int i = 0; i < numElements; i++){
            userList[i] = scnr.nextDouble();
            if(userList[i] >= maxNum){
                maxNum = userList[i];
            }
        }

        for(int i = 0; i < numElements; i++){
            userList[i] = userList[i]/maxNum;
            System.out.printf("%.2f", userList[i]);
            System.out.print(" ");
        }
        System.out.println("");
   }
}
