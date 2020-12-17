package grades;

import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {
        Student Student1 = new Student("Dude", 100);
        System.out.println(Student1.getName());
        System.out.println(Student1.getGrades());
        Student1.addGrade(76);
        Student1.addGrade(87);
        Student1.addGrade(93);
        System.out.println(Student1.getGrades());
        System.out.println(Student1.getGradeAverage());

        Student Student2 = new Student("Other Dude", 100);
        System.out.println(Student2.getName());
        System.out.println(Student2.getGrades());
        Student2.addGrade(89);
        Student2.addGrade(75);
        Student2.addGrade(82);
        System.out.println(Student2.getGrades());
        System.out.println(Student2.getGradeAverage());
    }

    private String studentName;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String studentName, int grades) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
        this.grades.add(grades);
    }

    // returns the student's name
    public String getName() {
        return studentName;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int average = 0;
        for (int grade : grades) {
            average += grade;
        }
        return (double) average / grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
}
