package ex27;
import java.util.Scanner;

public class ex27 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String  name, lastName,EmployeeID, ZipCode; // 2 char length//

        //employeeID =  AA-1234;// format  AA-1234//

        System.out.print("Enter the first name: ");
        name = scnr.nextLine();

        System.out.print("Enter the last name: ");
        lastName = scnr.nextLine();

        System.out.print("Enter the ZIP Code: ");
        ZipCode = scnr.nextLine();

        System.out.print("Enter the employee ID (using the format AA-12345):");
        EmployeeID = scnr.nextLine();

        String output = ValidateInput.print(name, lastName, ZipCode, EmployeeID);
        System.out.println(output);


    } //end of main//
}//end of program//