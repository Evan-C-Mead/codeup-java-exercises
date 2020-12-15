package shapes;

public class Square extends Quadrilateral{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double setLength() {
        return length;
    }

    @Override
    public double setWidth() {
        return width;
    }

//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("Square implementation of area.");
//        return (Math.pow(length, 2));
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("Square implementation of perimeter.");
//        return 4 * width;
//    }

}
