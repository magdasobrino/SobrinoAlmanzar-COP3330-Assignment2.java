  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex38;

import java.util.Scanner;

import java.util.*;

public class ex38 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayConverter ArrayConverter = new ArrayConverter();

            System.out.print("Enter your numbers: ");
            String user = in.nextLine().trim();

            List<Integer> userList = ArrayConverter.even(user);

            for (int i = 0; i < userList.size(); i++) {
                System.out.printf("%d ", userList.get(i));
            }

        } // end of main//
    } //end of program//


