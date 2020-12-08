package oopLecture;

public class Person {

    //        // SLIDE 3
//        public String firstName;
//        public String lastName;


    // SLIDE 4

        // instance variables
        public String firstName;
        public String lastName;

        // instance method
        public String sayHello() {
                return lastName + ", " + firstName + " says hi!";
        }


    // SLIDE 7
        public static long worldPopulation = 7_500_000_000L; // class property
        public String name;                                  // instance property

        public void sayName() {
                System.out.println("My name is " + name);
        }

        public static String longestName(Person p1, Person p2) {
                if (p1.name.length() > p2.name.length()) {
                        return p1.name;
                } else {
                        return p2.name;
                }
        }

        public static void main(String[] args) {
                Person theBestDrummer = new Person();
                theBestDrummer.name = "Dude";
                theBestDrummer.sayName();

                Person notBestDrummer = new Person();
                notBestDrummer.name = "Drummer Dude";

                String longestName = notBestDrummer.longestName(theBestDrummer, notBestDrummer);
                System.out.println(longestName);

//                System.out.println(oopLecture.Person.worldPopulation);
//                oopLecture.Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);
//
//
//                oopLecture.Person theBestDrummerAlive = new oopLecture.Person();
//                theBestDrummerAlive.name = "Neil Peart";
//                oopLecture.Person.worldPopulation += 1; // accessing a static property
//                // this also works, but is usually not a good idea
//                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//                // DONT DO THIS, it will not compile
////                 System.out.println(oopLecture.Person.name);
        }

}
