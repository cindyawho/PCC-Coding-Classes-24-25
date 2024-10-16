import java.util.Scanner; 
// Lab Program 21
public class WordFrequencies {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] userList = new String[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        String currWord;
        int[] freq = new int[20];

        numElements = scnr.nextInt(); 

        for(int i = 0; i < numElements; i++){
            userList[i] = scnr.next();
        }
        for(int i = 0; i < numElements; i++){
            freq[i] = 0;
            currWord = userList[i];
            for(int j = 0; j < numElements; j++) {
                if(userList[j].equals(currWord)){
                    freq[i]++;
                }
            }
        }
        for(int i = 0; i < numElements; i++){
            System.out.println(userList[i] + " - " + freq[i]);
        }
    }
}
