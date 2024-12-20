import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Scanner inSS;

      // TODO: Read dates from input, parse the dates to find the ones
      //       in the correct format, and output in m-d-yyyy format
      String date = scnr.nextLine();
      while(!date.equals("-1")){
        inSS = new Scanner(date);
        int size = date.length();
        if(size <= 6){
            date = scnr.nextLine();
            continue;
        }
        char check = date.charAt(size-6);
        String month = inSS.next();
        if(getMonthAsInt(month) != 0 && check == ','){
            int monthNum = getMonthAsInt(month);
            String day = inSS.next();
            day = day.substring(0, day.length()-1);
            String year = inSS.next();
            System.out.println(monthNum+"-"+day+"-"+year);
        }
        date = scnr.nextLine();
      }
     
   }
}