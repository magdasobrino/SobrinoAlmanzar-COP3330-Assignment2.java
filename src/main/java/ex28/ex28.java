  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */

package ex28;

import java.util.Scanner;

    public class ex28 {
        public static void main(String[] args){

            int i, n=0, s=0;
            int sum=0;


            for ( i=1; i<6;i++)
            {
                System.out.println("Enter a number:");
                Scanner in = new Scanner (System.in);
                n = in.nextInt();

                s +=n;
            }
            sum += s;
            System.out.println("The total is " +sum);


        }

    }







