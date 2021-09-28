  /*
   *  UCF COP3330 Fall 2021 Assignment 2 Solution
   *   Magdalena Sobrino-Almanzar
   */
package ex40;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ex40 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Map<String, String>> employeeList = new ArrayList<>();
        ArrayList<Map<String, String>> filteredList = new ArrayList<>();

        employeeList.add(Employee.input("John", "Webber", "Manager", "2016-12-31"));
        employeeList.add(Employee.input("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(Employee.input("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(Employee.input("John", "Jacobson", "Programmer", ""));
        employeeList.add(Employee.input("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(Employee.input("Sally", "Webber", "Web Developer", "2015-12-18"));
        CompleteLists.print(employeeList);

        System.out.print("\nDo you want to search by first name or last name? ");
        String user = in.nextLine().trim().toLowerCase();
        switch(user) {
            case "first" :
                System.out.print("Enter first name to search: ");
                String first = in.nextLine().trim();
                filteredList = CompleteLists.filterFirst(first, employeeList);
                break;
            case "last":
                System.out.print("Enter last name to search: ");
                String last = in.nextLine().trim();
                filteredList = CompleteLists.filterLast(last, employeeList);
                break;
            default:
                System.out.println("Invalid. Try again.");
                break;
        }
        CompleteLists.print(filteredList);
    } // end of main//
} // end of program //



