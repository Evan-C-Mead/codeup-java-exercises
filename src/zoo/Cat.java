package zoo;

public class Cat extends Animal{

    public Cat() {

    }

    public Cat(int numberOfLegs, String preferredClimate) {
        super(numberOfLegs, preferredClimate);
    }

    private void speak() {
        System.out.println("Meow!");
    }

}
