import java.util.Scanner;

public class MileageTrackerLinkedList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // References for MileageTrackerNode objects
      MileageTrackerNode headNode;                                           
      MileageTrackerNode currNode;
      MileageTrackerNode lastNode;

      double miles;
      String date;
      int i;

      // Front of nodes list                                                                         
      headNode = new MileageTrackerNode();
      lastNode = headNode;

      // TODO: Scan the number of nodes
      int nodeNum = scnr.nextInt();
         
        // TODO: For the scanned number of nodes, scan
        //       in data and insert into the linked list
        for (i = 0; i < nodeNum; ++i) { // Append 20 rand nums
            double num = scnr.nextDouble();
            String dateIn = scnr.next();
            currNode = new MileageTrackerNode(num, dateIn);            
            lastNode.insertAfter(currNode); // Append curr
            lastNode = currNode;
        }

        // TODO: Call the printNodeData() method 
        //       to print the entire linked list
        currNode = headNode.getNext(); // Print the list
        while (currNode != null) {
            currNode.printNodeData();
            currNode = currNode.getNext();
        }     
    }
}