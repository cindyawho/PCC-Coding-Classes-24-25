import java.util.Scanner;

// INSTRUCTIONS
/*
Write a program whose inputs are three integers, and whose output is the smallest of the three values.

Ex: If the input is:
7 15 3

the output is:
3
 */

public class LabProgram {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        num1 = scnr.nextInt();
        num2 = scnr.nextInt();
        num3 = scnr.nextInt();
        if(num1 < num2 && num1 < num3){
            System.out.println(num1);
        } else if(num2 < num3){
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
   }
}

