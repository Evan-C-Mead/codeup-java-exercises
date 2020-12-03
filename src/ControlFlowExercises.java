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

//        for (double i = 1; i <= 100; i +=1) {
//            if (i % 15 == 0) {
//                System.out.printf("FizzBuzz %.0f\n", i);
//            } else if (i % 5 == 0) {
//                System.out.printf("Buzz %.0f\n", i);
//            } else if (i % 3 == 0) {
//                System.out.printf("Fizz %.0f\n", i);
//            } else {
//                System.out.printf("%.0f\n", i);
//            }
//        }

        boolean userContinues = true;

        do {
            System.out.print("What number would you like to go up to? ");
            int userInt = userInput.nextInt();
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (long i = 1; i <= userInt; i += 1) {
                System.out.format("%-7d", i);
                System.out.print("|");
                System.out.format(" %-8d", i * i);
                System.out.print("|");
                System.out.format(" %-9d", i * i * i);
                System.out.println();
            }
            System.out.print("Would you like to enter another number (y/n)? ");
            String userResponse = userInput.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while (userContinues);

    }
}
