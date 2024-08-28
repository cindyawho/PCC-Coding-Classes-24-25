import java.util.Scanner;

public class LabProgram03 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentPrice; 
      int lastMonthsPrice; 
      int change;
      double mortgageEst;
      
      currentPrice = scnr.nextInt(); 
      lastMonthsPrice = scnr.nextInt();
      change = currentPrice - lastMonthsPrice;
      mortgageEst = (currentPrice * 0.051)/12;
      
      System.out.println("This house is $" + currentPrice + ". The change is $" + change + " since last month.");
      System.out.println("The estimated monthly mortgage is $" + mortgageEst + ".");
   }
}