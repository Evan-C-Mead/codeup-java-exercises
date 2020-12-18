package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input userInput = new Input();

        do {
            double radius = userInput.getDouble(1,100);
            Circle circle = new Circle(radius);

            System.out.printf("Area of the circle is: %f\n", circle.getArea());
            System.out.printf("Circumference of the circle is: %f\n", circle.getCircumference());

            System.out.println("Want to make another circle?");
        } while (userInput.yesNo());

        System.out.println("You checked " + Circle.getCircleCount() + " circles.");

//        System.out.println("What is the radius of a circle?");
//        double radius = userInput.getDouble();
//        Circle circle = new Circle(radius);
//        System.out.printf("Area of the circle is: %f\n", circle.getArea());
//        System.out.printf("Circumference of the circle is: %f\n", circle.getCircumference());
    }

}
