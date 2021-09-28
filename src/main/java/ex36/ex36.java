  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex36;
import java.util.*;
import java.lang.*;

public class ex36{
    public static void main(String[] args){

        String answer;
        int min = 0, max = 0;
        double average = 0, sd = 0;
        boolean check = false;
        Scanner scnr = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        do{
            System.out.println("Enter a number:");
            answer = scnr.nextLine();

            if(checkNumericValue(answer) == true ){
                numbers.add(Integer.parseInt(answer));
            }
            else{
                if(!answer.equalsIgnoreCase("done")){
                    System.out.println("Invalid input! Please try again...");
                }
            }

        }while(!answer.equalsIgnoreCase("done"));

        System.out.print("\nNumbers: ");
        for(int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i));
            if(i != (numbers.size()-1)){
                System.out.print(", ");
            }
        }

        average = average(numbers);
        System.out.printf("\nThe average is %.2f \n", average);

        min = min(numbers);
        System.out.println("The minimum is " + min);

        max = max(numbers);
        System.out.println("The maximum is " + max);

        sd = std(numbers);
        System.out.printf("The average is %.2f \n", sd);

        System.exit(0);
    }//end of main

    public static double average(List<Integer> list){

        int sum = 0;
        double avg = 0;

        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }

        avg = sum / list.size();

        return avg;
    }

    public static boolean checkNumericValue(String value){

        for(int i = 0; i < value.length(); i++){
            if(!Character.isDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static int min(List<Integer> list){

        int min = list.get(0);

        for(int i = 1; i < list.size(); i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
        }

        return min;
    }

    public static int max(List<Integer> list){

        int max = list.get(0);

        for(int i = 1; i < list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }

        return max;
    }

    public static double std(List<Integer> list){

        double mean = 0, std = 0, numerator = 0;

        mean = average(list);

        for(int i = 0; i < list.size(); i++){
            numerator += Math.pow(list.get(i) - mean, 2);
        }

        std = Math.sqrt(numerator/list.size());

        return std;
    } // end of main//


}//end of program