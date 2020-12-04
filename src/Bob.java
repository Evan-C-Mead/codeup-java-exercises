import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Say something to Bob...\n");
            String userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("\"Sure.\"");
            } else if (userInput.endsWith("!")) {
                System.out.println("\"Whoa, chill out!\"");
            } else if (userInput.isEmpty()) {
                System.out.println("\"Fine. Be that way!\"");
            } else {
                System.out.println("\"Whatever.\"");
            }
            System.out.println("Keep talking to Bob? [y/n]");
            String keepTalking = sc.nextLine();
            if (keepTalking.equals("n")) {
                System.out.println("\"Later dude...\"");
                break;
            }
        }while (true);

    }
}
