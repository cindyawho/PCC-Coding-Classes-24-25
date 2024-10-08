// Count characters Lab
import java.util.Scanner; 

/* INSTRUCTIONS
 * Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string. The output should include the input character and use the plural form, n's, if the number of times the characters appears is not exactly 1.

Ex: If the input is:
n Monday
the output is:
1 n

Ex: If the input is:
z Today is Monday
the output is:
0 z's

Ex: If the input is:
n It's a sunny day
the output is:
2 n's
Case matters.

Ex: If the input is:
n Nobody
the output is:
0 n's
n is different than N.
 */

public class LabProgram16 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        Character userChar = scnr.next().charAt(0);
        String userString = scnr.nextLine();
        int count = 0;
        for(int i = 0; i < userString.length(); i++){
            if(userString.charAt(i) == userChar){
                count += 1;
            }
        }
        if(count == 1) {
            System.out.println(count + " " + userChar);
        } else{
            System.out.println(count + " " + userChar + "\'s");
        }
   }
}
