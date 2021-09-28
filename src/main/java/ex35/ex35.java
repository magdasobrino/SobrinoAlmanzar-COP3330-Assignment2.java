  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex35;

import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class ex35 {

        public static void main(String[] args){

            String answer;
            Scanner scnr = new Scanner(System.in);
            List<String> names = new ArrayList<>();

            do{
                System.out.println("Enter a name:");
                answer = scnr.nextLine();
                if(!answer.equalsIgnoreCase("")){
                    names.add(answer);
                }
            }while(!answer.equalsIgnoreCase(""));

            System.out.println(names);
            Random rand = new Random();
            String winner = names.get(rand.nextInt(names.size()));

            System.out.println("The winner is... " + winner);


        }//end of main

} // end of program//
