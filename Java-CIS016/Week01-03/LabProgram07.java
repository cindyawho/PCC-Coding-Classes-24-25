import java.util.Scanner;
// INSTRUCTIONS
/* 
The following equation estimates the average calories burned for a person when exercising, which is based on a scientific journal article:
https://www.tandfonline.com/doi/abs/10.1080/02640410470001730089
Write a program using inputs age (years), weight (pounds), heart rate (beats per minute), and time (minutes), respectively. Output the average calories burned for a person.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

Ex: If the input is:

49 155 148 60
the output is:

Calories: 736.21 calories
*/
public class LabProgram07 {   
    public static void main(String[] args) {
        try (Scanner scnr = new Scanner(System.in)) {
            double age, weight, heartRate, time, calories;
            age = scnr.nextInt();
            weight = scnr.nextInt();
            heartRate = scnr.nextInt();
            time = scnr.nextInt();
            calories = ((age * 0.2757 + weight * 0.03295 + heartRate * 1.0781 - 75.4991) * time) / 8.368;
        
            System.out.print("Calories: ");
            System.out.printf("%.2f", calories);
            System.out.println(" calories");
        }
   }

}
