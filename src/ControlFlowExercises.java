import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        userInput.useDelimiter("\n");


        System.out.println("Enter a number. You will see a table of squared and cubed numbers up to the number you have entered.");
        double input = userInput.nextDouble();

        System.out.println("Would you like to continue? [Y/N]");
        String userConfirmation = userInput.next();
        boolean confirm = userConfirmation.equalsIgnoreCase("Y");

        if (confirm) {
            System.out.println("Number | Squared | Cubed");
            System.out.println("------ | ------- | -----");
            for (double i = 1; i <= input; i++ ){
                double squared = Math.pow(i, 2);
                double cubed = Math.pow(i, 3);
                System.out.printf("%.0f      | %.0f       | %.0f\n", i, squared, cubed);
            }
        } else {
            System.out.println("Program terminated");
        }

    }
}
