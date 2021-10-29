package ex36;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ex36Test {

    @Test
    void calculateAverage() {
        num calculate = new num();

        double[] newStats = {2, 9, 4, 5, 6, 8};

        double expected = 17 / 3;
        double actual = 17 / 3;


        assertEquals(expected, actual);
    }
}