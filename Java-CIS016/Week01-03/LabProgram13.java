import java.util.Scanner; 

public class LabProgram13 {
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); 
        String fullName = scnr.nextLine();
        String firstName, middleName, lastName;
        if(fullName.indexOf(" ") == fullName.lastIndexOf(" ")) {
            firstName = fullName.substring(0, fullName.indexOf(" "));
            lastName = fullName.substring(fullName.indexOf(" ")+1, fullName.length());
            System.out.println(lastName + ", " + firstName.substring(0,1) +".");
        } 
        else {
            firstName = fullName.substring(0, fullName.indexOf(" "));
            middleName = fullName.substring(fullName.indexOf(" ")+1, fullName.lastIndexOf(" "));
            lastName = fullName.substring(fullName.lastIndexOf(" ")+1, fullName.length());

            System.out.println(lastName + ", " + firstName.substring(0,1) + "." + middleName.substring(0,1) + ".");
        }
    }
}
