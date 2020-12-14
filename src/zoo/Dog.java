package zoo;

public class Dog extends Animal{

    public Dog() {

    }

    public Dog(int numberOfLegs, String preferredClimate) {
        super(numberOfLegs, preferredClimate);
    }

    private void speak() {
        System.out.println("Woof!");
    }


}
