package inheritancePolymorphismLecture;

import util.Input;

public class Employee {

    public static void main(String[] args) {
        Input sc = new Input();
    }

    public String name;
    public int id;
    public final static String company = "Codeup";

    public Employee() {

    }

    public Employee(String name) {
        this.name = name;
    }

    public void doWork() {
        System.out.println("Work..work...");
    }

    public String work() {
        return "Filling out TPS reports";
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

}
