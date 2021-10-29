package ex31;

import org.junit.Test;

import static org.junit.Assert.*;

public class ex31Test {

    @Test
    public void main() {
        double expectedOutput = 138.15;
        double actualOutput = Calculation.target(65, 22, 55/100.0);
        assertEquals(expectedOutput, actualOutput);
    }
    }
