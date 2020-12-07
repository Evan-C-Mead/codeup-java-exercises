import java.util.Scanner;
import java.util.Random;

public class HighLow {

    public static void main(String[] args) {
        guess();
    }

    public static void guess() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int guessCount = 0;

        System.out.println("Guess a number between 1 and 100...");
        do {
            Scanner sc = new Scanner(System.in);
            int userGuess = sc.nextInt();
            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
                guessCount++;
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
                guessCount++;
            } else if (userGuess == randomNumber) {
                System.out.println("GOOD GUESS!");
                System.out.printf("It took you %d guesses.", guessCount);
                break;
            }
        } while (true);
    }

}
