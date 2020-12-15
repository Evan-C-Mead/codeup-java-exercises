package interfacesAbstractClassesLecture;

import java.util.ArrayList;
import java.util.List;

public class McBurgerPlace implements McFranchise {

    public static void main(String[] args) {
        List<String> theseMenuItems = new ArrayList<>();
        theseMenuItems.add("Burger");
        theseMenuItems.add("Fries");
        theseMenuItems.add("Shake");
        List<String> theseCategories = new ArrayList<>();
        theseCategories.add("Lunch");
        theseCategories.add("Sides");
        McBurgerPlace newBurgerJoint = new McBurgerPlace(theseMenuItems, theseCategories, 60, 800, 2200, true);

        System.out.println("Welcome to " + companyName + "!");
        System.out.println("We have " + newBurgerJoint.seatingCapacity + " seats.");
        newBurgerJoint.businessHours(newBurgerJoint.openTime, newBurgerJoint.closeTime);

        // loop through all menu items and print them
        for (String thisItem : newBurgerJoint.getMenuItems()) {
            newBurgerJoint.makeStuff(thisItem);
//            System.out.println("Menu item: " + thisItem);
        }

    }

    // properties - can have as many custom properties as it wants
    private List<String> menuItems;
    private List<String> menuCategories;
    private int seatingCapacity;
    private int openTime;
    private int closeTime;
    private boolean iceCreamTime;

    // constructor
    public McBurgerPlace(List<String> menuItems, List<String> menuCategories, int seatingCapacity, int openTime, int closeTime, boolean iceCreamTime) {
        this.menuItems = menuItems;
        this.menuCategories = menuCategories;
        this.seatingCapacity = seatingCapacity;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.iceCreamTime = iceCreamTime;
    }

    // overrides
    @Override
    public void makeStuff(String menuItem) {
        System.out.println("The kitchen just prepared an order of: " + menuItem);
    }

    @Override
    public void businessHours(int openTime, int closeTime) {
        System.out.println("We are open from " + openTime + " to " + closeTime);
    }

    @Override
    public String iceCreamMachineWorking() {
        if (this.iceCreamTime) {
            return "Time for ice cream!";
        } else {
            return "No ice cream today...";
        }
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

}
