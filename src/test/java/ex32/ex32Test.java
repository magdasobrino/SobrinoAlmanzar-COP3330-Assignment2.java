package ex32;


import static org.junit.Assert.*;

public class ex32Test {

    void guessTest() {
        String expectedOutput = "Wow you guessed it in 1 guess!";
        String actualOutput = GameGuess.run("5", 5);
        assertEquals(expectedOutput, actualOutput);
    }


}