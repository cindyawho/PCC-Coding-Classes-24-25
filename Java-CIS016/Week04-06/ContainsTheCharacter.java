import java.util.Scanner;
// Lab Program 22
public class ContainsTheCharacter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] userList = new String[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        String currWord;
        int numValid = 0;

        numElements = scnr.nextInt();   // Input begins with number of integers that follow
        
        for(int i = 0; i < numElements; i++){
            userList[i] = scnr.next();
        }

        char character = scnr.next().charAt(0);

        for(int i = 0; i < numElements; i++){
            currWord = userList[i];
            for(int j = 0; j < currWord.length(); j++){
                if(character == currWord.charAt(j)){
                    System.out.print(currWord +",");
                    break;
                }
            }
        }
        System.out.println("");

    }
}
