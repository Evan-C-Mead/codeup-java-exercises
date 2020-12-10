package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("What is the radius of a circle?");
        double radius = userInput.getDouble();
        Circle circle = new Circle(radius);
        System.out.printf("Area of the circle is: %f\n", circle.getArea());
        System.out.printf("Circumference of the circle is: %f\n", circle.getCircumference());
    }

}
