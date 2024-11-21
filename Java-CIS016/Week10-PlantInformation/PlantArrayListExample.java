import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                                                       
   public static void printArrayList(ArrayList<Plant> objList) {
        int i;

        for (i = 0; i < objList.size(); ++i) {
            int num = i+1;
            System.out.println("Plant " + num + " Information: ");
            objList.get(i).printInfo();
            System.out.println("");
        }
   }
   
   public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Plant> myGarden = new ArrayList<Plant>();

        // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
        String plantName;
        String plantCost;
        String flowerName;
        String flowerCost;
        String colorOfFlowers;
        boolean isAnnual;
        
        input = scnr.next();
        while(!input.equals("-1")){
            plantName = scnr.next();
            plantCost = scnr.next();
            // TODO: Check if input is a plant or flower
            //       Store as a plant object or flower object
            //       Add to the ArrayList myGarden
            if(input.equals("plant")){
                Plant myPlant = new Plant();
                myPlant.setPlantName(plantName);
                myPlant.setPlantCost(plantCost);
                myGarden.add(myPlant);
            } else{
                Flower myFlower = new Flower();
                myFlower.setPlantName(plantName);
                myFlower.setPlantCost(plantCost);
                myFlower.setPlantType(scnr.nextBoolean());
                myFlower.setColorOfFlowers(scnr.next());
                myGarden.add(myFlower);
            }
        
            input = scnr.next();
        }
        
        // TODO: Call the method printArrayList to print myGarden
        printArrayList(myGarden);
      
   }
}
