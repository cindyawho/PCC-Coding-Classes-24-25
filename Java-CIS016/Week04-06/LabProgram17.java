// Output range with increment of 5 lab

/*
 * Write a program whose input is two integers, and whose output is the first integer and subsequent increments of 5 as long as the value is less than or equal to the second integer.

Ex: If the input is:
-15 10
the output is:
-15 -10 -5 0 5 10

Ex: If the second integer is less than the first as in:
20 5
the output is:
Second integer can't be less than the first.

For coding simplicity, output a space after every integer, including the last. End the output with a newline.
 */

import java.util.Scanner;

public class LabProgram17 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int firstInt = scnr.nextInt();
        int secondInt = scnr.nextInt();
        if(secondInt < firstInt) {
          System.out.println("Second integer can't be less than the first.");
        } else{
          for(int i = firstInt; i <= secondInt; i+=5){
              System.out.print(firstInt + " ");
              firstInt += 5;
          }
          System.out.println("");
        }
     }
}
