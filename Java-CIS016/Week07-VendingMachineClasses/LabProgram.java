import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int p = scnr.nextInt();
      int r = scnr.nextInt();

      VendingMachine newVen = new VendingMachine();
      newVen.purchase(p);
      newVen.restock(r);
      newVen.report();
      
   }
}