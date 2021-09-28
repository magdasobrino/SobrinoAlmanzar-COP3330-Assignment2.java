 /*
  *  UCF COP3330 Fall 2021 Assignment 2 Solution
  *  Copyright 2021 Magdalena Sobrino-Almanzar
  */

package ex24;

import java.util.Scanner;

public class ex24 {

        private static final Scanner scnr = new Scanner(System.in);

        private static String first;
        private static String second;


        public static void readUserInput() {

            System.out.println("Enter two strings and I'll tell you if they are anagrams.");
            System.out.println("Enter the first string:");
            first = scnr.nextLine(); // user enters first string//

            System.out.println("Enter the second string:");
            second = scnr.nextLine();// user enters second string//

            AnagramChecker name = new AnagramChecker();

            if (name.isAnagram(first, second))
                System.out.println(first + " and " + second + " are anagrams.");
            else
                System.out.println(first + " and " + second + " are not anagrams.");

        }

        public static void main(String[] args) {

            readUserInput(); // reads AnagramChecker class //
        } //end of main//


    } //end of program//



