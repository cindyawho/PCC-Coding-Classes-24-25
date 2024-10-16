import java.util.Scanner;

/* LAB PROGRAM 26

 * Define a method named sortArray that takes an array of integers as a parameter. Method sortArray() modifies the array parameter by sorting the elements in descending order (highest to lowest). Then write a main program that reads a list of integers from input, stores the integers (starting from the second input) in an array, calls sortArray(), and outputs the sorted array. The first input integer indicates how many numbers are in the list. Assume that the list will always contain less than 20 integers.

Ex: If the input is:
    5 10 4 39 12 2
the output is:
    39,12,10,4,2,

For coding simplicity, follow every output value by a comma, including the last one.

Your program must define and call the following method:
public static void sortArray(int[] myArr)

Hint: Sorting an array can be done in many ways. You are welcome to look up and use any existing algorithm. Some believe the simplest to code is bubble sort: Bubble sort Wikipedia article, but you are welcome to try others: Sorting algorithm Wikipedia article.
 */
public class SortArray {

    public static void sortArray(int[] myArr){
        int temp;
        for(int i = 0; i < myArr.length; i++){
            int max = myArr[i];
            int change = i;
            for(int j = 1+i; j < myArr.length; j++){
                if(myArr[j] > max){
                    max = myArr[j];
                    change = j;
                }
            }
            temp = myArr[i];
            myArr[i] = myArr[change];
            myArr[change] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userIn = scnr.nextInt();
        int[] arr = new int[userIn];
        for(int i = 0; i < userIn; i++){
            arr[i] = scnr.nextInt();
        }
        sortArray(arr);
        for(int i = 0; i < userIn; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println("");
    }
}
