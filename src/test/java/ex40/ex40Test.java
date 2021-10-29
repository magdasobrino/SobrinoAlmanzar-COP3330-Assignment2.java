package ex40;

import ex34.employee;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class ex40Test {

    @Test
    public void main() {

        ArrayList<Map<String, String>> employeeList = new ArrayList<>();
        employeeList.add(Employee.input("John", "Webber", "Manager", "2016-12-31"));
        employeeList.add(Employee.input("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(Employee.input("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(Employee.input("John", "Jacobson", "Programmer", ""));
        employeeList.add(Employee.input("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(Employee.input("Sally", "Webber", "Web Developer", "2015-12-18"));

        employeeList = CompleteLists.filterFirst("John", employeeList);//filters by first name

        ArrayList<Map<String, String>> expectedList = new ArrayList<>();
        expectedList.add(Employee.input("John", "Webber", "Manager", "2016-12-31"));
        expectedList.add(Employee.input("John", "Jacobson", "Programmer", ""));

        int expected = 1;
        int actual = 0;

        if (expectedList.equals(employeeList)) {
            actual = 1; //if filtered list equals expected list, actual will be flipped to 1 and pass the test.
        }

        assertEquals(expected, actual);
    }
}

