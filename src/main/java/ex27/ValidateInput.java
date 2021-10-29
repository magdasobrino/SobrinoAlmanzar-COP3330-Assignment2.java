package ex27;

public class ValidateInput {

    public static int firstName(String first) {
        if (first.isEmpty()) {
            System.out.println("First name cannot be empty.");
            return 0;
        }
        else if (first.length() < 2) {
            System.out.println("First name needs to be at least 2 characters long.");
            return 0;
        }
        else {
            return 1;
        }
    }

    public static int lastName(String last) {
        if (last.isEmpty()) {
            System.out.println("Last name cannot be empty.");
            return 0;
        }
        else if (last.length() < 2) {
            System.out.println("Last name needs to be at least 2 characters long.");
            return 0;
        }
        else {
            return 1;
        }
    }

    public static int zip(String zip) {
        if (zip.matches("\\d{5}$")) {
            return 1;
        }
        else {
            System.out.println("Invalid zip code.");
            return 0;
        }
    }

    public static int id(String id) {
        if (id.matches("\\w{2}-\\d{4}$")) {
            return 1;
        }
        else {
            System.out.println("Invalid employee ID.");
            return 0;
        }
    }

    public static String print(String first, String last, String zip, String id) {
        int counter = 0;
        counter += ValidateInput.firstName(first);
        counter += ValidateInput.lastName(last);
        counter += ValidateInput.zip(zip);
        counter += ValidateInput.id(id);
        return (counter == 4) ? ("No problems were found.") : ("Incorrect information. Please try again.");
    }
}
