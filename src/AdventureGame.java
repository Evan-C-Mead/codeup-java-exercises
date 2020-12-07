import java.util.Scanner;
import java.util.Random;

public class AdventureGame {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static String playerName;
    static int playerHealth = 30;
    static int monsterHealth = 30;
    static int blobHealth = 20;
    static int dragonHealth = 60;

    public static void main(String[] args){
        System.out.println("This is a text based game. \nPlease follow text prompts, as they are specific to how you will need to enter commands.");
        System.out.println("Are you ready to start your adventure? - [Yes/No]");
        adventureTime();
    }

    public static void adventureTime() {

        String option = sc.nextLine();
        if (option.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your name: ");
            playerName = sc.nextLine();
            System.out.printf("%s, welcome to the start of your adventure!", playerName);
        } else {
            System.out.println("I see you are not ready for this adventure...Come back when you are!");
        }

    }

}
