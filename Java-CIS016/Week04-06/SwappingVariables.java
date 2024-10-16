import java.util.Scanner;
// Lab Program 24
public class SwappingVariables {
   
   public static void swapValues(int[] values){
        int temp = values[0];
        values[0] = values[1];
        values[1] = temp;

        temp = values[2];
        values[2] = values[3];
        values[3] = temp;

        for(int i = 0; i < values.length; i++){
            System.out.print(values[i]);
            if(i < values.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println("");
   }
   
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] values = new int[4];
        for(int i = 0; i < 4; i++){
            values[i] = scnr.nextInt();
        }

        swapValues(values);

   }
}
