import java.util.Scanner;
/*
 * Given main(), complete the FoodItem class (in file FoodItem.java) with constructors to initialize each food item. The default constructor should initialize the name to "Water" and all other fields to 0.0. The second constructor should have four parameters (food name, grams of fat, grams of carbohydrates, and grams of protein) and should assign each private field with the appropriate parameter value.

Ex: If the input is:

Water
the output is:

Nutritional information per serving of Water:
  Fat: 0.00 g
  Carbohydrates: 0.00 g
  Protein: 0.00 g
Number of calories for 1.00 serving(s): 0.00
Ex: If the input is:

M&M's
10.0
34.0
2.0
3.0
where M&M's is the food name, 10.0 is the grams of fat, 34.0 is the grams of carbohydrates, 2.0 is the grams of protein, and 3.0 is the number of servings, the output is:

Nutritional information per serving of M&M's:
  Fat: 10.00 g
  Carbohydrates: 34.00 g
  Protein: 2.00 g
Number of calories for 1.00 serving(s): 234.00
Number of calories for 3.00 serving(s): 702.00
Note: The program outputs the number of calories for one serving of a food and for the input number of servings as well. The program only outputs the calories for one serving of water.
 */
public class NutritionalInfo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      FoodItem foodItem;
      
      String itemName = scnr.next();
      if(itemName.equals("Water") || itemName.equals("water")) {
         foodItem = new FoodItem();
         
         foodItem.printInfo();
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0, 
                          foodItem.getCalories(1.0));
      }
      
      else {
         double amountFat = scnr.nextDouble();
         double amountCarbs = scnr.nextDouble();
         double amountProtein = scnr.nextDouble();
      
         foodItem = new FoodItem(itemName, amountFat, amountCarbs, amountProtein);
      
         double numServings = scnr.nextDouble();
                                                      
         foodItem.printInfo();
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", 1.0,
                             foodItem.getCalories(1.0));
                             
         System.out.printf("Number of calories for %.2f serving(s): %.2f\n", numServings,
                             foodItem.getCalories(numServings));
      }
   }
}