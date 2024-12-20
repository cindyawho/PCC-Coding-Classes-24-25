import java.util.Scanner;
/* LAB PROGRAM 27
 * 
 * Define a method named getWordFrequency that takes an array of strings, the size of the array, and a search word as parameters. Method getWordFrequency() then returns the number of occurrences of the search word in the array parameter (case insensitive).

Then, write a main program that reads a list of words into an array, calls method getWordFrequency() repeatedly, and outputs the words in the arrays with their frequencies. The input begins with an integer indicating the number of words that follow. Assume that the list will always contain less than 20 words.

Ex: If the input is:
    5 hey Hi Mark hi mark
the output is:
    hey 1
    Hi 2
    Mark 2
    hi 2
    mark 2
Hint: Use the equalsIgnoreCase() method for comparing strings, ignoring case.

The program must define and call a method:
public static int getWordFrequency(String[] wordsList, int listSize, String currWord)
 */
public class WordFrequenciesMethod {

    public static int getWordFrequency(String[] wordsList, int listSize, String currWord){
        int freq = 0;
        for(int j = 0; j < listSize; j++) {
            if((wordsList[j].toLowerCase()).equals(currWord.toLowerCase())){
                freq++;
            }
        }
        return freq;
    }

   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numElements;                // Number of integers in user's list
        String currWord;

        numElements = scnr.nextInt(); 
        int[] freq = new int[numElements];
        String[] userList = new String[numElements];

        for(int i = 0; i < numElements; i++){
            userList[i] = scnr.next();
        }
        for(int i = 0; i < numElements; i++){
            freq[i] = getWordFrequency(userList, numElements, userList[i]);
        }
        for(int i = 0; i < numElements; i++){
            System.out.println(userList[i] + " " + freq[i]);
        }
   }
}
