package zoo;

public class Fish extends Animal{

    public Fish() {

    }

    public Fish(int numberOfLegs, String preferredClimate) {
        super(numberOfLegs, preferredClimate);
    }

    private void speak() {
        System.out.println("Blub!");
    }

}
