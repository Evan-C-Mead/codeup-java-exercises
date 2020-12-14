package inheritancePolymorphismLecture;

public class Technician {

    public static void main(String[] args) {
        Technician Tech1 = new Technician("Guy");

        Car toyota = new Toyota();
        Car ford = new Ford();

        Tech1.repair(toyota);
        toyota.drive();

        Tech1.repair(ford);
        ford.drive();
    }

    private String name;

    public Technician(String name) {
        this.name = name;
    }

    public Car repair(Car theCar) {
        System.out.println("Repairing the car");
        return theCar;
    }

}
