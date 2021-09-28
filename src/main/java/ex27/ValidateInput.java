package ex27;

public class ValidateInput {
    public static int firstname(String name) {

        if (name.length() < 2) {
            System.out.println("First name needs to be at least 2 characters long.");
            return 0;

        } else if (name.isEmpty()) {
            System.out.println("First name must be filled in. ");
            return 0;
        }
        else
        {
            return 1;
        }
    }
        public static int last (String lastName){

        if (lastName.isEmpty())
        {
            System.out.println("Last name must be filled in. ");
            return 0;

        }
        else if (lastName.length() < 2)
            {
                System.out.println("The Last name needs to be at least 2 characters long.");
                return 0;

            }

            else{
                return 1;
            }

        }

    public static int id(String EmployeeID) {
        if (EmployeeID.matches("\\w{2}-\\d{4}$")) //The employee ID must be in the format of AA-1234//

        {
            return 1;
        }
        else {
            System.out.println("The employee ID must be in the format of AA-1234");
            return 0;
        }
    }

    public static int zip(String ZipCode) {
        if (ZipCode.matches("\\d{5}$")) {
            return 1;
        }
        else {
            System.out.println("The zipcode must be a 5 digit number."); //The zipcode must be a 5 digit number.//
            return 0;
        }
    }

    public static String print(String name, String lastName, String ZipCode, String EmployeeID){

    int counter = 0;
    counter += ValidateInput.firstname(name);
    counter += ValidateInput.last(lastName);
    counter += ValidateInput.id(EmployeeID);
    counter += ValidateInput.zip(ZipCode);


        return (counter == 4) ? ("There were no errors found.") : ("Not Correct! Try again.");
    }
}


