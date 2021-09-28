  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */

package ex34;
import java.util.Scanner;
import java.util.*;


public class ex34 {
    public static void main(String[] args){

        String answer;
        Scanner scnr = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");

        System.out.println("There are "+ names.size() + " employees:");
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("\nEnter an employee name to remove:");
        answer = scnr.nextLine();

        for(int i = 0; i < names.size(); i++){
            if(answer.compareToIgnoreCase(names.get(i))==0){
                names.remove(i);
            }
        }

        System.out.println("\nThere are "+ names.size() + " employees:");
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

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