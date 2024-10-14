// Varied amount of input data lab

import java.util.Scanner; 

/*
 * Statistics are often calculated with varying amounts of input data. Write a program that takes any number of non-negative integers as input, and outputs the max and average. A negative integer ends the input and is not included in the statistics. Assume the input contains at least one non-negative integer.

Output the average with two digits after the decimal point followed by a newline, which can be achieved as follows:
System.out.printf("%.2f\n", average);
 */

public class LabProgram15 {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        int userInput = scnr.nextInt();
        int max = 0;
        int sum = 0;
        int count = 0;
        double average;
        while(userInput >= 0){
            count += 1;
            if(userInput > max){
                max = userInput;
            }
            sum += userInput;
            userInput = scnr.nextInt();
        }
        average = (double)sum/count * 1.0;
        System.out.print("" + max + " ");
        System.out.printf("%.2f\n", average);
   }
}
