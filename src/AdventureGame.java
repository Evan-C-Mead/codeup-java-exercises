import java.util.Scanner;
import java.util.Random;

public class AdventureGame {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static String playerName;
    static int playerHealth = 30;
    static int monsterHealth = 15;
    static int blobHealth = 8;
    static int dragonHealth = 25;

    public static void main(String[] args){
        System.out.println("This is a text based game. \nPlease follow text prompts, as they are specific to how you will need to enter commands.");
        System.out.println("Are you ready to start your adventure? - [Yes/No]");
        adventureTime();
    }

    public static void adventureTime() {
        String option = sc.nextLine();
        if (option.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your name: ");
            playerName = sc.nextLine().toUpperCase();
            System.out.printf("%s, welcome to the start of your adventure!\n", playerName);
            scenario();
        }
    }

    public static void scenario() {
        System.out.printf("%s, What would you like to do?\n", playerName);
        System.out.println("A: Fight a blob.");
        System.out.println("B: Fight a monster.");
        System.out.println("C: Fight a dragon.");
        System.out.println("D: Run.");
        String scenarioInput = sc.nextLine();
        if (scenarioInput.equalsIgnoreCase("a")) {
            blobHealth -= 5;
            playerHealth -= 1;
            System.out.println("The blob tried to swallow you whole!");
            System.out.println("You kicked the blob away!");
            System.out.printf("%s your heath is: %d. The blob's health is: %d\n", playerName, playerHealth, blobHealth);
            System.out.println("Press any key to continue.");
            blob();
            scenario();
        } else if (scenarioInput.equalsIgnoreCase("b")) {
            monsterHealth -= 3;
            playerHealth -= 3;
            System.out.println("The monster clubbed you in the head");
            System.out.println("You bashed the monster back!");
            System.out.printf("%s your heath is: %d. The monster's health is: %d\n", playerName, playerHealth, monsterHealth);
            System.out.println("Press any key to continue.");
            monster();
            scenario();
        } else if (scenarioInput.equalsIgnoreCase("c")) {
            dragonHealth -= 1;
            playerHealth -= 15;
            System.out.println("The dragon is too strong for you...");
            System.out.println("You won't last, you should run away!");
            System.out.printf("%s your heath is: %d. The monster's health is: %d\n", playerName, playerHealth, dragonHealth);
            System.out.println("Press any key to continue.");
            dragon();
            scenario();
        } else if (scenarioInput.equalsIgnoreCase("d")) {
            System.out.println("I guess you weren't ready after all...");
        } else {
            scenario();
        }
    }

    // SWITCH / CASE --> is there a way to equalsIgnoreCase?
//    public static void scenario() {
//        System.out.printf("%s, What would you like to do?\n", playerName);
//        System.out.println("A: Fight a blob.");
//        System.out.println("B: Fight a monster.");
//        System.out.println("C: Fight a dragon.");
//        System.out.println("D: Run.");
//        String scenarioInput = sc.nextLine();
//        switch (scenarioInput) {
//            case ("A"):
//                blobHealth -= 5;
//                playerHealth -= 1;
//                System.out.println("The blob tried to swallow you whole!");
//                System.out.println("You kicked the blob away!");
//                System.out.printf("%s your heath is: %d. The blob's health is: %d", playerName, playerHealth, blobHealth);
//                blob();
//                scenario();
//                break;
//            case ("B"):
//                monsterHealth -= 3;
//                playerHealth -= 3;
//                System.out.println("The monster clubbed you in the head");
//                System.out.println("You bashed the monster back!");
//                System.out.printf("%s your heath is: %d. The monster's health is: %d", playerName, playerHealth, monsterHealth);
//                monster();
//                scenario();
//                break;
//            case ("C"):
//                dragonHealth -= 1;
//                playerHealth -= 15;
//                System.out.println("The dragon is too strong for you...");
//                System.out.println("You won't last, you should run away!");
//                System.out.printf("%s your heath is: %d. The monster's health is: %d", playerName, playerHealth, dragonHealth);
//                dragon();
//                scenario();
//                break;
//            case ("D"):
//                System.out.println("I guess you weren't ready after all...");
//                break;
//            default:
//                scenario();
//        }
//    }

    public static void blob() {
        if (playerHealth <= 0) {
            System.out.println("The blob ate you...");
            System.out.println("Game over!");
            return;
        } else if (playerHealth <= 10) {
            System.out.println("Drink a health potion? [Y/N]");
            String drinkPotion = sc.next();
            if (drinkPotion.equalsIgnoreCase("y")) {
                playerHealth += 10;
                System.out.printf("%s, your health is: %d.\n", playerName, playerHealth);
            } else {
                System.out.println("Why wouldn't you drink it?!");
                System.out.println("You decide to drink it anyway.");
                playerHealth += 10;
                System.out.printf("%s, your health is: %d.\n", playerName, playerHealth);
            }
        } else if (blobHealth <= 0) {
            System.out.println("You defeated the blob!");
            System.out.println("The mage will grant you bonus health now!");
            playerHealth += 10;
            System.out.printf("%s, your health is: %d.\n", playerName, playerHealth);
            return;
        }
        adventureTime();
    }

    public static void monster() {
        if (playerHealth <= 0) {
            System.out.println("The monster defeated you and will now eat you...");
            System.out.println("Game over!");
            return;
        } else if (playerHealth <= 10) {
            System.out.println("Drink a health potion? [Y/N]");
            String drinkPotion = sc.next();
            if (drinkPotion.equalsIgnoreCase("y")) {
                playerHealth += 10;
                System.out.printf("%s, your health is: %d.\n", playerName, playerHealth);
            } else {
                System.out.println("Why wouldn't you drink it?!");
                System.out.println("You decide to drink it anyway.");
                playerHealth += 10;
                System.out.printf("%s, your health is: %d.\n", playerName, playerHealth);
            }
        } else if (monsterHealth <= 0) {
            System.out.println("You defeated the monster!");
            System.out.println("The mage will grant you bonus health now!");
            playerHealth += 10;
            System.out.printf("%s, your health is: %d.\n", playerName, playerHealth);
            return;
        }
        adventureTime();
    }

    public static void dragon() {
        if (playerHealth <= 0) {
            System.out.println("The dragon defeated cooked you with fire!!");
            System.out.println("Game over!");
            return;
        } else if (playerHealth <= 10) {
            System.out.println("Drink a health potion? [Y/N]");
            String drinkPotion = sc.next();
            if (drinkPotion.equalsIgnoreCase("y")) {
                playerHealth += 5;
                System.out.printf("%s, your health is: %d.\n", playerName, playerHealth);
            } else {
                System.out.println("Why wouldn't you drink it?!");
                System.out.println("You decide to drink it anyway.");
                playerHealth += 5;
                System.out.printf("%s, your health is: %d.\n", playerName, playerHealth);
            }
        } else if (dragonHealth <= 0) {
            System.out.println("You defeated the dragon!");
            System.out.println("The mage will grant you bonus health now!");
            playerHealth += 10;
            System.out.printf("%s, your health is: %d.\n", playerName, playerHealth);
            return;
        }
        adventureTime();
    }

}
