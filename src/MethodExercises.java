import java.util.Scanner;
import java.util.Random;

public class MethodExercises {

    public static void main(String[] args) {

        // Exercise #1
//        System.out.println(addition(2, 3));
//        System.out.println(subtraction(8, 7));
//        System.out.println(multiplication(3, 9));
//        System.out.println(division(16, 4));
//        System.out.println(modulus(30, 4));

        // Exercise #2
//        getInteger(1, 10);

        // Exercise #3
//        factorial();

        // Exercise #4
        diceRoll();
    }

    public static double addition(double x, double y) {

        return x + y;
    }

    public static double subtraction(double x, double y) {

        return x - y;
    }

    public static double multiplication(double x, double y) {

        return x * y;
    }

    public static double division(double x, double y) {

        return x / y;
    }

    public static double modulus(double x, double y) {

        return x % y;
    }

    public static void getInteger(int min, int max) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 10: \n");
            int userInput = sc.nextInt();
            if (userInput > min & userInput < max) {
                System.out.printf("Your number was: %d\n", userInput);
                break;
            }
        } while (true);
    }

    public static void factorial() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10: ");
            int userNumber = sc.nextInt();
            int sum = 1;
            for (int i = 1; i <= userNumber; i++) {
                sum *= i;
            }
            System.out.printf("The factorial of %d is: %d \n", userNumber, sum);
            System.out.println("Do you want to continue? [y/n] ");
            String option = sc.next();
            if (!option.equalsIgnoreCase("y")) {
                System.out.println("Program terminated");
                break;
            }
        } while (true);
    }

    public static void diceRoll() {
        System.out.println("Enter the total number of sides for a pair of dice:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rand = new Random();
        do {
            System.out.println("The values on dice are: ");
            for (int i = 0; i < 2; i++)
                System.out.println(rand.nextInt(n/2) + 1);
            System.out.println("Do you want to continue? [y/n] ");
            String option = sc.next();
            if (!option.equalsIgnoreCase("y")) {
                System.out.println("Program terminated");
                break;
            }
        } while (true);
    }

}
