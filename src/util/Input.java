package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        String input;
        System.out.println("Enter a word: ");
        input = this.scanner.next();
        return input;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        return yesNo("Yes/No?");
//        String input = this.scanner.next();
//        return (input.trim().toLowerCase().equals("y") ||
//                input.trim().toLowerCase().equals("yes"));
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String input = this.scanner.next();
        return (input.trim().toLowerCase().equals("y") ||
                input.trim().toLowerCase().equals("yes"));
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.println("Enter a number between " + min + " and " + max +": ");
            input = this.scanner.nextInt();
        } while (input < min || input > max);
        return input;
    }

    public int getInt() {
        int input;
        System.out.println("Enter a number: ");
        input = this.scanner.nextInt();
        return input;
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.println("Enter a number with decimals between " + min + " and " + max +": ");
            input = this.scanner.nextDouble();
        } while (input < min || input > max);
        return input;
    }

    public double getDouble() {
        double input;
        System.out.println("Enter a number with decimals: ");
        input = this.scanner.nextDouble();
        return input;
    }

}
