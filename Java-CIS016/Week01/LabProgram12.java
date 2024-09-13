import java.util.Scanner; 

public class LabProgram12 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int pennies = scnr.nextInt();
      int dollars, quarters, dimes, nickels;
      if (pennies == 0) {
        System.out.println("No change");
      } else {
        dollars = pennies / 100;
        if (dollars >= 1){
            if(dollars < 2){
                System.out.println("1 Dollar");
            } else {
                System.out.println(dollars + " Dollars");
            }
        }
        pennies -= dollars*100;
        quarters = pennies / 25;
        if (quarters >= 1){
            if(quarters < 2){
                System.out.println("1 Quarter");
            } else {
                System.out.println(quarters + " Quarters");
            }
        }
        pennies -= quarters*25;
        dimes = pennies / 10;
        if (dimes >= 1){
            if(dimes < 2){
                System.out.println("1 Dime");
            } else {
                System.out.println(dimes + " Dimes");
            }
        }
        pennies -= dimes*10;
        nickels = pennies / 5;
        if (nickels >= 1){
            if(nickels < 2){
                System.out.println("1 Nickel");
            } else {
                System.out.println(nickels + " Nickels");
            }
        }
        pennies -= nickels*5;
        if (pennies >= 1){
            if(pennies < 2){
                System.out.println("1 Penny");
            } else {
                System.out.println(pennies + " Pennies");
            }
        }
      }
   }
}
