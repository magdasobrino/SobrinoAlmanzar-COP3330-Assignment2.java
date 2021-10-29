package ex39;

import org.junit.Test;



import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
public class ex39Test {

    void nameTest() {

        ArrayList<Map<String, String>> employeeList = new ArrayList<>();

        employeeList.add(name.input("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(name.input("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(name.input("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(name.input("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(name.input("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(name.input("Sally", "Webber", "Web Developer", "2015-12-18"));

        Collections.sort(employeeList, new Compare());

        String[] expectedArray = {"Jackson", "Jacobson", "Johnson", "Michaelson", "Webber", "Xiong"}; //expecting sorted list
        int expected = 1;
        int actual = 1;

        for (int i = 1; i < employeeList.size(); i++) {
            Map<String, String> temp = employeeList.get(i);
            if (!temp.get("last").equals(expectedArray[i])) {
                actual = 0; //if name does not match expected sorted list, actual will be flipped to 0 and fail test.
            }
        }

        assertEquals(expected, actual);
    }
}







