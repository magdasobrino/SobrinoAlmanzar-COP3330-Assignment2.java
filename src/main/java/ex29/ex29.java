  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex29;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String user = "";

        do {
            System.out.print("What is the rate of return? ");
            user = scnr.nextLine().trim();
            if (!user.matches("[1-9]+$")) {
                System.out.println("Invalid input. Try again.");
            }
        } while (!user.matches("[1-9]+$"));
        int rate = Integer.parseInt(user);
        int output = Calculator.calculate(rate);
        if (output > 1) {
            System.out.printf("It will take %d years to double your investment.", output);
        }
        else {
            System.out.printf("It will take %d year to double your investment.", output);
        }
    } //end of main//
}//end of program//



