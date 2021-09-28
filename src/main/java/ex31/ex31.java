  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */

package ex31;
import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String input1, input2;
        do {
            System.out.print("What's your resting heart rate? ");
            input1 = in.nextLine().trim();
            System.out.print("What's your age? ");
            input2 = in.nextLine().trim();
            if (!input1.matches("[0-9]+$") || !input2.matches("[0-9]+$")) {
                System.out.println("Invalid input. Try again.");
            }
        } while (!input1.matches("[0-9]+$") || !input2.matches("[0-9]+$"));
        int rest = Integer.parseInt(input1);
        int age = Integer.parseInt(input2);
        Calculation.print(rest, age);
    } // end of main//
} // end of program//

