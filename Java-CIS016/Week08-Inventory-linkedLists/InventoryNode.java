public class InventoryNode {
    private String item; 
    private int numberOfItems;
    private InventoryNode nextNodeRef; // Reference to the next node                                   
 
    public InventoryNode() {
       item = "";
       numberOfItems = 0;
       nextNodeRef = null;
    }
 
    // Constructor                                                                                     
    public InventoryNode(String itemInit, int numberOfItemsInit) {
       this.item = itemInit;
       this.numberOfItems = numberOfItemsInit;
       this.nextNodeRef = null;
    }
 
    // Constructor                                                                                     
    public InventoryNode(String itemInit, int numberOfItemsInit, InventoryNode nextLoc) {
       this.item = itemInit;
       this.numberOfItems = numberOfItemsInit;
       this.nextNodeRef = nextLoc;
    }
 
    // TODO: Define an insertAtFront() method that inserts a node at the 
    //        front of the linked list (after the dummy head node)
    public void insertAtFront(InventoryNode head, InventoryNode nodeLoc) {
       // Set the new node's next reference to point to the current first node
       nodeLoc.nextNodeRef = head.nextNodeRef;
 
       // Update the head node's next reference to point to the new node
       head.nextNodeRef = nodeLoc;
    }
 
    // Get location pointed by nextNodeRef                                                             
    public InventoryNode getNext() {
       return this.nextNodeRef;
    }
    
    // Print node data
    public void printNodeData() {
       System.out.println(this.numberOfItems + " " + this.item);
    }
 }