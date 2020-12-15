package interfacesAbstractClassesLecture;

// declared as an interface
public interface McFranchise {
    // properties
    String companyName = "McBurger"; // this string is a constant
    String managerName = "";

    //abstract methods - that we have to completely write out in any class that IMPLEMENTS this interface
    public void makeStuff(String menuItem);
    public void businessHours(int openTime, int closeTime);
    public String iceCreamMachineWorking();

}
