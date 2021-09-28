  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex33;
import java.util.Scanner;

public class ex33 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("What's your question? ");
            String user = in.nextLine().trim();

            int rand = (int) Math.floor(Math.random()*(3-1+1)+1);
            String output = NumberGenerator.response(rand);
            System.out.println(output);

        }//end of main//
    }//end of program//

