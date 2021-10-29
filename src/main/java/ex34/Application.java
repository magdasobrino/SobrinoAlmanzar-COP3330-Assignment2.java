/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Magdalena Sobrino-Almanzar
 */
package ex34;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        employee employee = new employee();

        employee.create();
        employee.print();

        System.out.printf("%nEnter an employee's name to remove: ");
        String user = in.nextLine().trim();
        String output = employee.remove(user);
        System.out.println(output);
        employee.print();
    }
}