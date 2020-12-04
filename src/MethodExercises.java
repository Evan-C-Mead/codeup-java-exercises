public class MethodExercises {

    public static void main(String[] args) {

        System.out.println(addition(2, 3));
        System.out.println(subtraction(8, 7));
        System.out.println(multiplication(3, 9));
        System.out.println(division(16, 4));
        System.out.println(modulus(30, 4));

    }

    public static double addition(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static double modulus(double x, double y) {
        return x % y;
    }

}
