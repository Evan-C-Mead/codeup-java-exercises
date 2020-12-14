package inheritancePolymorphismLecture;

public class Developer extends Employee{

    public static void main(String[] args) {
        Employee Employee1 = new Employee("Dude");
        Employee1.doWork();
        System.out.println(Employee1.getName());

        Developer Dev1 = new Developer("Neo");
        Dev1.doWork();
        Dev1.working();
        System.out.println(Dev1.getName());
    }

    public Developer() {

    }

    public Developer(String name) {
        super(name);
    }

    public void doWork() {
        System.out.println("Writing code");
    }

    public void working() {
        super.doWork();
    }

}
