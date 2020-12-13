package movies;

import util.Input;
import java.util.Arrays;

public class MovieApplication {

    public static void main(String[] args) {

    }

    public static void runMovieList() {
        Movie[] moviesArray = MoviesArray.findAll();
        Input userInput = new Input();
        boolean pickOption = true;

        while (pickOption) {
            int userChoice = userInput.getInt(0, 5);
            System.out.println("What would you like to do?\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            switch (userChoice) {
                case (0):

            }
        }
    }

}
