public class HelloWorld {
    public static void main(String[] args) {

        System.out.print("Hello, World!");
        System.out.print("\n");

        int myFavoriteNumber = 31;
        System.out.println(myFavoriteNumber);

        String myString = "This is my string.";
        System.out.println(myString);

        char myChar = myString.charAt(8);
        System.out.println(myChar);

        long myNumber = 123L;
        System.out.println(myNumber);

        float myNumber2 = 3.14F;
        System.out.println(myNumber2);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String class = "hello"; <-- does not work due to "class" being reserved in Java

        // this will create ClassCastExceptions, but will crash the solution due to improper casting of data types
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
//        System.out.println(three);

        // rewrite the following expressions using the relevant shorthand assignment operators
//        int x = 4;
//        x = x + 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        // refactored expressions
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(x);
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);
    }
}
