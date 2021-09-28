package ex25;

public class Validator {


    String checkStrength(String password) {
        String outputStatement = "";

        if (password.length() < 8) {
            if (letters(password))
                outputStatement = "The password '" + password + "' is a weak password.";
            else
                outputStatement = "The password '" + password + "' is a very weak password.";

        } else {
            int counter = 0;
            if (numbers(password))
                counter = counter + 1;

            if (letters(password))
                counter = counter + 1;

            if (special(password))
                counter = counter + 1;

            if (counter == 1)
                outputStatement = "The password '" + password + "' is a weak password.";
            if (counter == 2)
                outputStatement = "The password '" + password + "' is a strong password.";
            if (counter == 3)
                outputStatement = "The password '" + password + "' is a very strong password.";
        }

        return outputStatement;
    }

    boolean letters(String password) {
        boolean indicator = false;
        int counter = 0;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                counter = counter + 1;
            }
        }

        if (counter >= 1)
            indicator = true;

        return indicator;
    }


    boolean numbers(String password) {
        boolean indicator = false;
        int counter = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                counter = counter + 1;
            }
        }

        if (counter >= 1)
            indicator = true;

        return indicator;
    }

    boolean special(String password) {
        boolean indicator = false;
        String[] specialChars = {" ", "~", "`", "!", "@", "#", "$", "%", "^",
                "&", "*", "(", ")", "_", "-", "+", "=", "{", "}", "[", "]",
                "|", "/", ":", ";", "'", ",", ".", "<", ">", "?", "\\", "\""};

        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.contains(specialChars[i])) {
                counter = counter + 1;
            }
        }
        if (counter >= 1)
            indicator = true;
        return indicator;
    }
}
