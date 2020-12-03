import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("%.2f%n", pi);


        Scanner userInput = new Scanner(System.in);


//        System.out.println("Please enter your favorite number: ");
//        int number = userInput.nextInt();
//        System.out.println(number);
//
//
//        System.out.println("Please enter three fruits: ");
//        String firstFruit = userInput.next();
//        String secondFruit = userInput.next();
//        String thirdFruit = userInput.next();
//        System.out.println(firstFruit);
//        System.out.println(secondFruit);
//        System.out.println(thirdFruit);
//
//
//        System.out.println("Type a sentence: ");
//        String sentence = userInput.next();
//        System.out.println(sentence);

        System.out.println("Enter the length and width: ");
        int width = userInput.nextInt();
        int height = userInput.nextInt();
        System.out.println("Area is: " + width * height);
        System.out.println("Perimeter is: " + (width * 2) + (height * 2));
    }
}
