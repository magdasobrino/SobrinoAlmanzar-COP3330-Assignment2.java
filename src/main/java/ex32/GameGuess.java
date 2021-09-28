package ex32;

import java.util.Scanner;

public class GameGuess {
    public static String run(String guess, int num) { //parameter for testing purposes
        Scanner in = new Scanner(System.in);

        int counter = 1;
        int flag = 0;

        if (Integer.parseInt(guess) == num) { //for testing purposes
            flag = 1;
        }
        else {
            System.out.print("I have my number. What's your guess? ");
            guess = in.nextLine().trim();
            do {
                if (!guess.matches("[0-9]+$")) {
                    System.out.print("Invalid input. Guess again: ");
                }
                else if (Integer.parseInt(guess) == num) {
                    flag = 1;
                    break;
                }
                else {
                    String output = (Integer.parseInt(guess) > num) ? ("Too high. Guess again: ") : ("Too low. Guess again: ");
                    System.out.print(output);
                }
                counter++;
                guess = in.nextLine().trim();
            } while (flag == 0);
        }

        if (counter > 1) {
            return String.format("You guessed it in %d guesses!", counter);
        }
        else {
            return String.format("Wow you guessed it in %d guess!", counter);
        }
    }
}