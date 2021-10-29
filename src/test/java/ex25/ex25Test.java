package ex25;

import org.junit.Test;

import static org.junit.Assert.*;

public class ex25Test {

    @Test //"No characters are letters"//

    void No_Letters() {
        Validator validate = new Validator();

        boolean actual = validate.letters("1234@");

        assertFalse(actual);

    }

        @Test //"Weak password, only numbers"//
        void Only_Numbers () {
            Validator validate = new Validator();

            String expected = "The password '123' is a very weak password.";
            String actual = validate.checkStrength("123");

            assertEquals(expected, actual);
        }


        @Test //"all characters are letters"//
        void All_Letters () {
            Validator validate = new Validator();

            boolean actual = validate.letters("defenestration");

            assertTrue(actual);
        }


    }
