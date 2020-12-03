import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {

        for (double i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.printf("Fizz %.0f\n", i);
            } else if (i % 5 == 0){
                System.out.printf("Buzz %.0f\n", i);
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.printf("FizzBuzz %.0f\n", i);
            } else {
                System.out.printf("%.0f\n", i);
            }
        }

    }
}
