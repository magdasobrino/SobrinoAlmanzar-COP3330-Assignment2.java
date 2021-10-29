package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ex37Test {

    @Test
    void passwordGenerator_Length() {
        generatepassword generate = new generatepassword();
        String password = generate.passwordBuilder(8, 2, 2);

        int expected = 8;
        int actual = password.length();
        assertEquals(expected, actual);
    }

    @Test
    void passwordGenerator_Length_If_Zero() {
        generatepassword generate = new generatepassword();
        String password = generate.passwordBuilder(0, 2, 2);

        int expected = 0;
        int actual = password.length();
        assertEquals(expected, actual);
    }

    @Test
    void passwordGenerator_NumOfSpecialChars_Is_Zero() {
        generatepassword generate = new generatepassword();
        String password = generate.passwordBuilder(8, 0, 2);

        int expected = 8;
        int actual = password.length();
        assertEquals(expected, actual);
    }

    @Test
    void passwordGenerator_NumberLength_Is_Zero() {
        generatepassword generate = new generatepassword();
        String password = generate.passwordBuilder(8, 3, 0);

        int expected = 8;
        int actual = password.length();
        assertEquals(expected, actual);
    }
}

