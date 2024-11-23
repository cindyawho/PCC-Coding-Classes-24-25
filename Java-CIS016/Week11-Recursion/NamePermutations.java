// Write a program that lists all ways people can line up for a photo (all permutations of a list of Strings). The program will read a list of one word names into ArrayList nameList (until -1), and use a recursive method to create and output all possible orderings of those names separated by a comma, one ordering per line.

// When the input is:

    // Julia Lucas Mia -1

// then the output is (must match the below ordering):

    // Julia, Lucas, Mia 
    // Julia, Mia, Lucas
    // Lucas, Julia, Mia
    // Lucas, Mia, Julia
    // Mia, Julia, Lucas
    // Mia, Lucas, Julia

import java.util.Scanner;
import java.util.ArrayList;

public class NamePermutations {

    // TODO: Write method to create and output all permutations of the list of names.
    public static void printAllPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
        String tmpString;      // Temp list combinations
        int i;                 // Loop index

        if (nameList.size() == 0) { // Base case: All names used
            for(i = 0; i < permList.size(); i++){
                System.out.print(permList.get(i));
                if(i != permList.size() - 1){
                    System.out.print(", ");
                }
            }
            System.out.println("");
        } else {
            for (i = 0; i < nameList.size(); ++i) {
                // Move letter to scrambled letters
                tmpString = nameList.get(i);
                nameList.remove(i);
                permList.add(tmpString);

                printAllPermutations(permList, nameList);

                // Put letter back in remaining letters
                nameList.add(i, tmpString);
                permList.remove(permList.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> permList = new ArrayList<String>();
        String name;
        name = scnr.next();
        // TODO: Read a list of names into nameList; stop when -1 is read. Then call recursive method.
        while(!name.equals("-1")){
            nameList.add(name);
            name = scnr.next();
        }
        printAllPermutations(permList, nameList);
    }
}    