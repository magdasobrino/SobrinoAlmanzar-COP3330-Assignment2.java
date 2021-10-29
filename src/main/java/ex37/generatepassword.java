package ex37;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class generatepassword {
    Random rand = new Random();

    public String passwordBuilder(int minLength, int numOfSpecialChars, int numOfNumbers) {
        ArrayList<String> initialPassword = new ArrayList<>();

        if(initialPassword.size() < minLength)
        {
            for (int i = 0; i < numOfSpecialChars; i++)
            {
                String character = randomSpecialChar();
                initialPassword.add(character);
            }
        }

        if(initialPassword.size() < minLength)
        {
            for (int i = 0; i < numOfNumbers; i++)
            {
                String character = randomNumber();
                initialPassword.add(character);
            }
        }

        while(initialPassword.size() < minLength)
        {
            String character = randomLetter();
            initialPassword.add(character);
        }

        String password = "";
        for(int i = initialPassword.size() - 1; i >= 0 ; i--)
        {
            password = password + initialPassword.get(i);
        }
        //I could shuffle the order of this password to make it more random, but it isn't required for this assignment.

        return password;
    }



    String randomLetter()
    {
        List<String> letters = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

        int randLetter = rand.nextInt(26);
        String outputLetter = letters.get(randLetter);

        return outputLetter;
    }

    String randomNumber()
    {
        List<String> numbers = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

        int randNum = rand.nextInt(10);
        String outputNumber = numbers.get(randNum);

        return outputNumber;
    }

    String randomSpecialChar()
    {
        List<String> specialChars = List.of("!", "@", "#", "$", "%", "^", "&", "*", "-",
                "+", "=", ":", ";", "?", ",", ".", "<", ">", "/", "~");
        //I didn't include every special char b/c some of them would be weird in a password imo.

        int randSpecialChar = rand.nextInt(20);
        String outputSpecialChar = specialChars.get(randSpecialChar);

        return outputSpecialChar;
    }

}

