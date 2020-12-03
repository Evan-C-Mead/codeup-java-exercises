import java.util.Scanner;

public class ControlStatementsLec {
    public static void main(String[] args) {

// ==================== Boolean Expressions

        // no >== ,or <==, or === because only value comparisons are available
        // truthy and falsy values don't exist in Java

//        int randomNumber = 6;
//        System.out.println(randomNumber == 6);

//        char randomChar = 'Y';
//        System.out.println(randomChar == 'y');



        // ==================== Logical Operators

        // && will only check second value if first is true
        // & will check both
        // this can be used to check what would otherwise result in a syntax error
        // same comparison process for || and |

        // x will only increment in second condition if first condition is true using &&
//                int x = 2;
//                int y = 3;
//
//                if (true && ++x == y) {
//                    System.out.println("Equal");
//                } else {
//                    System.out.println("Not equal");;
//                }
//                System.out.println(x);


        // ==================== Slide 7

        // DO NOT COMPARE STRINGS WITH == !!!!

//                Scanner sc = new Scanner(System.in);
//                String cat1 = sc.nextLine();
//                String cat2 = "cat";
//                System.out.println(cat1);
//                System.out.println(cat2);
//                System.out.println(cat1 == cat2);

        // do use equals(),

//    boolean stringValuesAreEqual = "Test".equals("Test");
//    System.out.printf("The result is: %s", stringValuesAreEqual);


        // or use equalsIgnoreCase()

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

        // does not equal

//String tech = "tech";
//System.out.println(!tech.equalsIgnoreCase("tool"));



        // ==================== Switch Case

        // basically the same as JS :)


//            String caseSwitch = "Fred";
//            switch (caseSwitch) {
//                case "bob":
//                    System.out.println("Case 1");
//                    break;
//                case "fred":
//                    System.out.println("Case 2");
//                    break;
//                default :
//                    System.out.println("Default case");
//                    break;
//            }


        // ==================== Loops


//        while (/* condition */) {
//            // loop body
//        }

//        int i = 0;
//        while (i < 10) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        do {
//            //Statements
//        }while(/* condition */);

//        do {
//            System.out.println("You will see this despite the condition!");
//        } while (false);

//        for(/* init */; /* condition */; /* update */) {
//            // statements
//        }

//        for(int i = 0; i < 10; i += 1) {
//            System.out.println("i is " + i);
//        }

        // print the numbers 1 through 5
//        for(int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                break; // --------------+
//            } //                        |
//        } //                            |
//// <----------------------------+

//        for(int i = 1; i <= 10; i++) { // <--+
//            if(i % 2 == 1) { //              |
//                continue; // ----------------+
//            }
//            System.out.println(i);
//        }

    }
}