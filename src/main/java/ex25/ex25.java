/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

package ex25;
import java.util.Scanner;

public class ex25 {
    private static String password;

    public static String inputReader() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is the password? "); // ask user for password //
        password = scnr.nextLine(); // user enters password//

        return password; // returns password//

    }

    public static void main(String[] args) {

        inputReader();

        Validator validate = new Validator();
        String outputStatement = validate.checkStrength(password);

        System.out.print(outputStatement); //returns validated password//
    }// end of main//

}//end of program//

