import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        userInput.useDelimiter("\n");

//        System.out.println("What is your class percentage grade?");
//        double grade = userInput.nextDouble();
//        System.out.println("Would you like to continue [Y/N]");
//
//        String userGrade = userInput.next();
//        boolean confirmation = userGrade.equalsIgnoreCase("y");
//
//        if (confirmation) {
//            if (grade <= 100 & grade >= 88){
//                System.out.println("You received an A :)");
//
//            }else if (grade <= 87 & grade >= 80){
//                System.out.println("You received a B :}");
//            }else if (grade <= 79 & grade >= 67){
//                System.out.println("You received a C :|");
//            }else if (grade <= 66 & grade >= 60){
//                System.out.println("You received a D :{");
//            }else if (grade <= 59 & grade >= 0){
//                System.out.println("You received a F :[");
//            }else {
//                System.out.println("Try again...");
//            }
//        }else {
//            System.out.println("Program terminated...");
//        }

        for (double i = 1; i <= 100; i +=1) {
            if (i % 15 == 0) {
                System.out.printf("FizzBuzz %.0f\n", i);
            } else if (i % 5 == 0) {
                System.out.printf("Buzz %.0f\n", i);
            } else if (i % 3 == 0) {
                System.out.printf("Fizz %.0f\n", i);
            } else {
                System.out.printf("%.0f\n", i);
            }
        }

    }
}
