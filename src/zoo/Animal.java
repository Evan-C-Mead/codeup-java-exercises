package zoo;

public class Animal {

    private int numberOfLegs;
    private String preferredClimate;


    public String getAnimalInfo() {
        return "This animal has " + numberOfLegs + ", and likes to live in " + preferredClimate;
    }

    public void setNumberOfLegs() {
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setPreferredClimate() {
        this.preferredClimate = preferredClimate;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public Animal() {

    }

    public Animal(int numberOfLegs, String preferredClimate) {
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }

    private void speak() {
        System.out.println("I'm an animal!");
    }

}
