package shapes;

public class Circle {

    private double radius;
    double pi = Math.PI;

    private static int circleCount = 0;

    public Circle(double radius) {
        this.radius = radius;
        circleCount++;
    }

    public double getArea() {
        return pi * (Math.pow(radius, 2));
    }

    public double getCircumference() {
        return 2 * pi * this.radius;
    }

    public static int getCircleCount() {
        return circleCount;
    }

}
