package ex33;

import org.junit.Test;

import static org.junit.Assert.*;

public class ex33Test {

    @Test
    void NumberGenerator() {
        String expectedOutput1 = "Yep.";
        String expectedOutput2 = "Nah.";
        String expectedOutput3 = "Maybe?";
        String expectedOutput4 = "Ask again later.";
        String actualOutput1 = NumberGenerator.response(0);
        String actualOutput2 = NumberGenerator.response(1);
        String actualOutput3 = NumberGenerator.response(2);
        String actualOutput4 = NumberGenerator.response(3);

        assertEquals(expectedOutput1, actualOutput1);
        assertEquals(expectedOutput2, actualOutput2);
        assertEquals(expectedOutput3, actualOutput3);
        assertEquals(expectedOutput4, actualOutput4);
    }
}
