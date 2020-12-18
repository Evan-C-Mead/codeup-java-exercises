package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public boolean yesNo() {
        System.out.println("[Yes / No]");
        String input = scanner.nextLine();
        return (input.trim().toLowerCase().equals("y") || input.trim().toLowerCase().equals("yes"));
    }

    public boolean yesNoNewLine() {
        System.out.println("[Yes / No]\n");
        String input = scanner.nextLine();
        return (input.trim().toLowerCase().equals("y") || input.trim().toLowerCase().equals("yes"));
    }

    public int getInt(int min, int max) {
        try {
            do {
                System.out.println("Enter a number between " + min + " and " + max +": ");
            } while (Integer.valueOf(getString()) < min || Integer.parseInt(getString()) > max);
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.println("Enter a number between " + min + " and " + max +": ");
            return getInt();
        }
    }

    public int getInt() {
        System.out.println("Enter a number: ");
        try {
            return Integer.parseInt(getString());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number!");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number with decimals between " + min + " and " + max +": ");
        try {
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            System.out.println("Enter a number with decimals between " + min + " and " + max +": ");
            return getDouble();
        }
    }

    public double getDouble() {
        System.out.println("Enter a number with decimals: ");
        try {
            return Double.parseDouble(getString());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number with decimals!");
            return getDouble();
        }
    }

}
