import java.util.Scanner;

public class MethodExercises {

    public static void main(String[] args) {

        // Exercise #1
        System.out.println(addition(2, 3));
        System.out.println(subtraction(8, 7));
        System.out.println(multiplication(3, 9));
        System.out.println(division(16, 4));
        System.out.println(modulus(30, 4));

        // Exercise #2
        getInteger(1, 10);

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

}
