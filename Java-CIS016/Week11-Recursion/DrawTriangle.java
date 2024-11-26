// Write a recursive method called drawTriangle() that outputs lines of '*' to form a right side up isosceles triangle. Method drawTriangle() has one parameter, an integer representing the base length of the triangle. Assume the base length is always odd and less than 20. Output 9 spaces before the first '*' on the first line for correct formatting.

// Hint: The number of '*' increases by 2 for every line drawn.

// Ex: If the input of the program is:

// 3
// the method drawTriangle() outputs:

//          *
//         ***
// Ex: If the input of the program is:

// 19
// the method drawTriangle() outputs:

//          *
//         ***
//        *****
//       *******
//      *********
//     ***********
//    *************
//   ***************
//  *****************
// *******************
// Note: No space is output before the first '*' on the last line when the base length is 19.

import java.util.Scanner;

public class DrawTriangle {
   
    /* TODO: Write recursive drawTriangle() method here. */
    public static void drawTriangle(int base){
        if(base > 0){
            drawTriangle(base-2);
            int spaces = (20 - base)/2;
            for(int i = 0; i < spaces; i++){
                System.out.print(" ");
            }
            for(int i = 0; i < base; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
        
        
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int baseLength;
        
        baseLength = scnr.nextInt();
        drawTriangle(baseLength);
    }
}