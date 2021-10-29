  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex35;

import java.util.Scanner;
import java.lang.*;

public class ex35 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        competition contest = new competition();
        String user = ""; //empty string for do while loop

        do {
            System.out.print("Enter a name: ");
            user = in.nextLine().trim();
            contest.add(user);
        } while (!user.isEmpty());


        }//end of main

} // end of program//
