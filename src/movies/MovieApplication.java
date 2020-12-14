package movies;

import util.Input;
import java.util.Arrays;

public class MovieApplication {

    public static void main(String[] args) {
        runMovieList();
    }

    public static void runMovieList() {
        Movie[] moviesArray = MoviesArray.findAll();
        Input userInput = new Input();
        boolean pickOption = true;

        while (pickOption) {
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the musical category");
            System.out.println("6 - view movies in the sci-fi category");
            int userChoice = userInput.getInt();
            System.out.println();
            switch (userChoice) {
                case (0):
                    System.out.println("Are you sure you want to quit?");
                    boolean userConfirm = userInput.yesNo();
                    if (userConfirm) {
                        pickOption = false;
                        System.out.println("Program terminated...");
                    } else {
                        System.out.println("Please pick an option.");
                    }
                    break;
                case (1):
                    for (Movie movie : moviesArray) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    System.out.println();
                    break;
                case (2):
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println();
                    break;
                case (3):
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println();
                    break;
                case (4):
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println();
                    break;
                case (5):
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equals("musical")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println();
                    break;
                case (6):
                    for (Movie movie : moviesArray) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }
        }
    }

}
