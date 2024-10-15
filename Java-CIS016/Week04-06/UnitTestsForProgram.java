import java.util.Scanner;
// Lab Program 23
public class UnitTestsForProgram {
   
   public static double kiloToPounds(double kilos) {
      // This statement intentionally has an error. 
      return (kilos * 2.204);
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double kilos;
      double pounds;
      
      kilos = scnr.nextDouble();
      
      pounds = kiloToPounds(kilos);
      System.out.println(pounds + " lbs");
   }
}