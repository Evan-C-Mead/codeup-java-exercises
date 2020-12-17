package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import util.Input;

public class GroceryListApplication {

//    ArrayList<String> meat = new ArrayList<>(Arrays.asList("Beef", "Chicken", "Pork"));
//    ArrayList<String> fruit = new ArrayList<>(Arrays.asList("Apple", "Pear", "Orange", "Banana"));
//    ArrayList<String> vegetables = new ArrayList<>(Arrays.asList("Carrot", "Radish", "Potato", "Cabbage"));
//    ArrayList<String> dairy = new ArrayList<>(Arrays.asList("Milk", "Butter", "Yogurt"));
//    ArrayList<String> dryGoods = new ArrayList<>(Arrays.asList("Cereal", "Coffee", "Sugar"));

    HashMap<ArrayList<String>, String> foods = new HashMap<>();

    public static void main(String[] args) {
        Input input = new Input();
        boolean userContinue = true;

        System.out.println("Would you like to create a grocery list?");
        userContinue = input.yesNo();
        if (userContinue) {
            System.out.println("Would you like to add a new item?");
            boolean proceedToCategory = input.yesNo();
            if (proceedToCategory) {
                chooseGroceryCategory();
            }
        }
    }

    public static void chooseGroceryCategory() {
        ArrayList<String> foodCategories = new ArrayList<>(Arrays.asList("Meat", "Fruit", "Vegetables", "Dairy", "Dry Goods"));
        int i = 1;

        System.out.println("What category would you like to browse?");
        for (String category : foodCategories) {
            System.out.println(i + " - " + category);
            i++;
        }
//        switch (foodCategories) {
//            case 1:
////                code
//                break;
//            case 2:
////                code
//                break;
//            case 3:
////                code
//                break;
//        }
    }

}

//                1) Given an orders list of groceries to choose from, select the category
//                      display pre-written list of categories
//                          What category?
//                              save user input for category, item, and quantity to insert to HashMap

//                2) Enter the name of the item
//                      what is the item?
//
//                3) Enter how many of the item
//                      what is the quantity?
//                          would yo like to add another item? - if no exit, if yes repeat step 1 - 3