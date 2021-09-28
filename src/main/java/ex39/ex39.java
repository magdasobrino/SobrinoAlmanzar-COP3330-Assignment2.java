  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */

package ex39;

import java.util.*;

    public class ex39 {
        public static void main(String[] args) {
            ArrayList<Map<String, String>> employeeList = new ArrayList<>();

            employeeList.add(name.input("John", "Johnson", "Manager", "2016-12-31"));
            employeeList.add(name.input("Tou", "Xiong", "Software Engineer", "2016-10-05"));
            employeeList.add(name.input("Michaela", "Michaelson", "District Manager", "2015-12-19"));
            employeeList.add(name.input("Jake", "Jacobson", "Programmer", ""));
            employeeList.add(name.input("Jacquelyn", "Jackson", "DBA", ""));
            employeeList.add(name.input("Sally", "Webber", "Web Developer", "2015-12-18"));

            Collections.sort(employeeList, new Compare()); //compares based on last name

            System.out.printf("%-10s|%-15s|%-20s|%-10s%n", "FIRST", "LAST", "POSITION", "DATE OF SEPARATION");
            System.out.printf("%-10s|%-15s|%-20s|%-10s%n", "----------", "---------------", "--------------------", "-------------------");
            for (int i = 0; i < employeeList.size(); i++) {
                Map<String, String> temp = employeeList.get(i);
                System.out.printf("%-10s|%-15s|%-20s|%-10s%n",
                        temp.get("first"), temp.get("last"), temp.get("position"), temp.get("date"));
            }

        } // end of main//
    } // end of program //

