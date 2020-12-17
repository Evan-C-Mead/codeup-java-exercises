package grades;

import java.util.HashMap;
import java.util.Map;
import util.Input;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        Student Student1 = new Student("Jake", 100);
        students.put("jakeTheSnake75", Student1);
        Student1.addGrade(76);
        Student1.addGrade(87);
        Student1.addGrade(93);

        Student Student2 = new Student("Mary", 100);
        students.put("mary-mary-quite-contrary", Student2);
        Student2.addGrade(89);
        Student2.addGrade(75);
        Student2.addGrade(82);

        Student Student3 = new Student("Frank", 100);
        students.put("frankThe-tank-90", Student3);
        Student3.addGrade(97);
        Student3.addGrade(83);
        Student3.addGrade(70);

        Student Student4 = new Student("Rodrigo", 100);
        students.put("rodrigoIsADude02", Student4);
        Student4.addGrade(81);
        Student4.addGrade(93);
        Student4.addGrade(78);

        commandListInterface(students);
    }

    public static void commandListInterface(Map<String, Student> students) {
        System.out.println("Welcome!\n");
        do {
            System.out.println("Here are the GitHub usernames of our students:\n");
            for (String key : students.keySet()) {
                System.out.print("| " + key + " |");
            }
            System.out.println("\n\nWhat username would you like to see more information on?\n");
            String usernameKey = input.getString();
            if (students.containsKey(usernameKey)) {
                Student selectedStudent = students.get(usernameKey);
                System.out.printf("\nName: %s - GitHub Username: %s\n", selectedStudent.getName(), usernameKey);
                System.out.printf("Current GPA: %.2f\n", selectedStudent.getGradeAverage());
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of " + usernameKey);
            }
            System.out.println("\nWould you like to see another student?\n");
        } while (input.yesNoNewLine());
        System.out.println("\nGoodbye, and have a wonderful day!");
    }
}