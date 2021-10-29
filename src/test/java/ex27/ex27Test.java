package ex27;

import org.junit.Test;

import static org.junit.Assert.*;

public class ex27Test {
        @Test
        void outputTest() {
            String expectedOutput = "No problems were found.";
            String actualOutput = ValidateInput.print("John","Doe","32792","AB-3982");
            assertEquals(expectedOutput, actualOutput);
        }

        @Test
        void nameTest() {
            int expectedOutput1 = 0;
            int actualOutput1 = ValidateInput.firstName("");
            int expectedOutput2 = 0;
            int actualOutput2 = ValidateInput.firstName("a");
            int expectedOutput3 = 1;
            int actualOutput3 = ValidateInput.lastName("Doe");
            assertEquals(expectedOutput1,actualOutput1);
            assertEquals(expectedOutput2,actualOutput2);
            assertEquals(expectedOutput3,actualOutput3);
        }

        @Test
        void zipTest() {
            int expectedOutput1 = 0;
            int actualOutput1 = ValidateInput.zip("32abc");
            int expectedOutput2 = 1;
            int actualOutput2 = ValidateInput.zip("82912");
            assertEquals(expectedOutput1,actualOutput1);
            assertEquals(expectedOutput2,actualOutput2);
        }

        @Test
        void idTest() {
            int expectedOutput1 = 0;
            int actualOutput1 = ValidateInput.id("a1-76ab");
            int expectedOutput2 = 1;
            int actualOutput2 = ValidateInput.id("AA-1234");
            assertEquals(expectedOutput1,actualOutput1);
            assertEquals(expectedOutput2,actualOutput2);
        }
    }