import java.util.Scanner;

/*
Given class Triangle (in file Triangle.java), complete main() to read and set the base and height of triangle1 and of triangle2, determine which triangle's area is smaller, and output that triangle's info, making use of Triangle's relevant methods.

Ex: If the input is:
    3.0 4.0
    4.0 5.0

where 3.0 is triangle1's base, 4.0 is triangle1's height, 4.0 is triangle2's base, and 5.0 is triangle2's height, the output is:
    Triangle with smaller area:
    Base: 3.00
    Height: 4.00
    Area: 6.00 

*/  

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      triangle1.setBase(scnr.nextDouble());
      triangle1.setHeight(scnr.nextDouble());
      
      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
      triangle2.setBase(scnr.nextDouble());
      triangle2.setHeight(scnr.nextDouble());
      
      System.out.println("Triangle with smaller area:");
      
      // TODO: Determine smaller triangle (use getArea())
      //       and output smaller triangle's info (use printInfo())
      if(triangle1.getArea() < triangle2.getArea()){
        triangle1.printInfo();
      } else{
        triangle2.printInfo();
      }
      
   }
}
