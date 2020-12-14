package inheritancePolymorphismLecture;

public class Teacher extends Employee {

    public static void main(String[] args) {
        Teacher Teacher1 = new Teacher("Jane");
        System.out.println(Teacher1.getName());
        Teacher1.doWork();
        Teacher1.working();
    }

    public Teacher() {

    }

    public Teacher(String name) {
        super(name);
    }

    public void doWork() {
        System.out.println("Teaching students");
    }

    public void working() {
        super.doWork();
    }

}
