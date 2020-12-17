package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student Student1 = new Student("Jake", 100);
        Student1.addGrade(76);
        Student1.addGrade(87);
        Student1.addGrade(93);

        Student Student2 = new Student("Mary", 100);
        Student2.addGrade(89);
        Student2.addGrade(75);
        Student2.addGrade(82);

        Student Student3 = new Student("Frank", 100);
        Student3.addGrade(97);
        Student3.addGrade(83);
        Student3.addGrade(70);

        Student Student4 = new Student("Rodrigo", 100);
        Student4.addGrade(81);
        Student4.addGrade(93);
        Student4.addGrade(78);

        students.put("jakeTheSnake75", Student1);
        students.put("mary-mary-quite-contrary", Student2);
        students.put("frankThe-tank-90", Student3);
        students.put("rodrigoIsADude02", Student4);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
//        System.out.println(students.keySet() + "\n");

        for (String key : students.keySet()) {
            System.out.print( "| " + key + " |");
        }

    }

}
