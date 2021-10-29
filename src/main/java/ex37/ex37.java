  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex37;

  import java.util.ArrayList;
  import java.util.Scanner;

  public class ex37 {
      private static final Scanner input = new Scanner(System.in);

      public static void readUserInput()
      {
          System.out.print("What's the minimum length? ");
          int minLength = input.nextInt();

          System.out.print("How many special characters? ");
          int numOfSpecialChars = input.nextInt();

          System.out.print("How many numbers? ");
          int numOfNumbers = input.nextInt();

          generatepassword generate = new generatepassword();
          String password = generate.passwordBuilder(minLength, numOfSpecialChars, numOfNumbers);

          System.out.print("Your password is " + password);
      }
      public static void main(String[] args) {

          readUserInput();

      }
  }