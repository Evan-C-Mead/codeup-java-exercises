package interfacesAbstractClassesLecture;

public abstract class Franchise {
    // All the methods in an abstract class are like a list of rules or requirements for what needs to be implemented in a class that extends this abstract class

    // If we were to create a class that extends a Franchise
    // i.e. McBurger on I-10 vs McBurger on Loop 1604

    // static
//    double result = Math.pow(10, 2);

    // non-static
//    Math myCoolMathTool = new Math(); <-- cannot do -- Math library won't allow this

    // Properties (contain values)
    private final String companyName = "McBurger"; // this is always the same, no matter where the Franchise is built
    private String managerName;

    // if we have enough properties to warrant a constructor - to set those values when initializing this class - we'd create here

    public Franchise(String managerName) {
        // no need to set companyName because it is a "final"
        this.managerName = managerName;
    }

    // Methods
    public abstract void makeStuff(String menuItem);
    public abstract void businessHours(int openTime, int closeTime); // example 8am = 800, 10pm = 2200
    public abstract boolean icCreamMachineWorking(); // non-void method
    public void greetCustomer() {
        System.out.println("Welcome to " + this.companyName + ". Not home of the Good Burger!"); // non abstract method
    }

    public String getCompanyName() {
        return companyName; // can retrieve this from any class that extend from this abstract class - even though it's declared private
    }

}
