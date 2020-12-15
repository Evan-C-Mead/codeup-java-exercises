package interfacesAbstractClassesLecture;

import java.util.ArrayList;
import java.util.List;

// this is a specific "location" of the Franchise
public class BurgerPlace extends Franchise{
    // this is the ACTUAL McBurger restaurant
    // it must follow all the rules set in the Franchise.java class

    // properties - can have as many custom properties as it wants
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;

    // constructor
    public BurgerPlace(String managerName, List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        super(managerName);
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }

    // override the methods that have been written, per the "Franchise" abstract class
    @Override
    public void makeStuff(String menuItem) {
        System.out.println("The kitchen just made a tasty " + menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.println("We are open from " + openTime + " to " + closeTime);
    }

    @Override
    public boolean icCreamMachineWorking() {
        if (this.openTime > 100) {
            return this.iceCreamTime;
        }
        return false;
    }

    // getters and setters
    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public List<String> getMenuCategories() {
        return menuCategories;
    }

    public void setMenuCategories(List<String> menuCategories) {
        this.menuCategories = menuCategories;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isIceCreamTime() {
        return iceCreamTime;
    }

    public void setIceCreamTime(boolean iceCreamTime) {
        this.iceCreamTime = iceCreamTime;
    }

    public static void main(String[] args) {
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Burger");
        theseMenuItems.add("Fires");
        List<String> theseCategories = new ArrayList<>();
        theseCategories.add("Lunch");
        theseCategories.add("Sides");
        BurgerPlace theBurgerJoint = new BurgerPlace("Manager Dude", theseMenuItems, theseCategories, 80, 800, 2200, true);
    }
}
