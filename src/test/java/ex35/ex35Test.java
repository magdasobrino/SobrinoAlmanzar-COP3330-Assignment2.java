package ex35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ex35Test {

    @Test
    void contestTest() {
        competition competition = new competition();
        int expectedOutput = 1;
        int actualOutput = 1;

        competition.add("Jane");
        competition.add("Jim");
        competition.add ("Joe");
        competition.add("Jill");

        String output1 = competition.winner();
        String output2 = competition.winner();
        String output3 = competition.winner();

        if (output1.equals(output2) && output2.equals(output3)) {
            actualOutput = 0;
        }

        assertEquals(expectedOutput, actualOutput);
    }
}