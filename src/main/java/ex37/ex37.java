  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex37;

import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PasswordGenerator password = new PasswordGenerator();
        password.populateChar();
        System.out.print("What's the minimum length? ");
        int length = in.nextInt();
        System.out.print("How many special characters? ");
        int special = in.nextInt();
        System.out.print("How many numbers? ");
        int num = in.nextInt();
        String output = password.generate(length, special, num);
        System.out.print("The password is:");
        System.out.print(output);

    }// end of main//

} //end of program//
