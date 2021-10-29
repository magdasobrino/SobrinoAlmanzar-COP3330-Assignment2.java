  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */

  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
  package ex32;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice1 = "y";
        int num; //random number
        String output;

        while (choice1.equals("y")) {
            System.out.print("Choose your difficulty level from 1 to 3: ");
            int choice2 = in.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("~ Guess a number between 1 and 10 ~\n");
                    num = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
                    output = GameGuess.run("0", num);
                    System.out.println(output);
                    System.out.print("%nEnter Y to keep playing or N to quit: ");
                    in.nextLine(); //consumes newline character
                    choice1 = in.nextLine().trim().toLowerCase();
                    break;
                case 2:
                    System.out.println("~ Guess a number between 1 and 100 ~\n");
                    num = (int) Math.floor(Math.random() * (100 - 1 + 1) + 1);
                    output = GameGuess.run("0", num);
                    System.out.println(output);
                    System.out.print("%nEnter Y to keep playing or N to quit: ");
                    in.nextLine(); //consumes newline character
                    choice1 = in.nextLine().trim().toLowerCase();
                    break;
                case 3:
                    System.out.println("~ Guess a number between 1 and 1000 ~\n");
                    num = (int) Math.floor(Math.random() * (1000 - 1 + 1) + 1);
                    output = GameGuess.run("0", num);
                    System.out.println(output);
                    System.out.print("%nEnter Y to keep playing or N to quit: ");
                    in.nextLine(); //consumes newline character
                    choice1 = in.nextLine().trim().toLowerCase();
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }


    }// end of main//
} //end of program//