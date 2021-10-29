package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    @Test
    void employeeTest() {
        employee employee = new employee();

        employee.create();

        String expectedOutput1 = "Found Jim Halpert. Removing.";
        String expectedOutput2 = "Unable to find employee to remove.";
        String actualOutput1 = employee.remove("Jim Halpert");
        String actualOutput2 = employee.remove("Stanley Hudson");

        assertEquals(expectedOutput1, actualOutput1);
        assertEquals(expectedOutput2,actualOutput2);
    }


}
