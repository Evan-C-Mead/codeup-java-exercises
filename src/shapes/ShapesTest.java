package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4, 5);
        System.out.printf("Area of your rectangle is: %.1f\n", box1.getArea());
        System.out.printf("Perimeter of your rectangle is: %.1f\n", box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.printf("Area of your square is: %.1f\n", box2.getArea());
        System.out.printf("Perimeter of your square is: %.1f\n", box2.getPerimeter());
    }

}
