package ex38;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ex38Test {
    @Test
    void convertTest() {
        ArrayConverter ArrayConverter = new ArrayConverter();
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(6);
        expectedList.add(8);
        expectedList.add(10);

        List<Integer> actualList = ArrayConverter.even("1 2 3 4 5 6 7 8 9 10");
        assertEquals(expectedList, actualList);
    }
}