package ex39;

import java.util.*;

    public class Compare implements Comparator { //returns value after comparing 2 maps in list based on last name.
        public int compare(Object object1, Object object2) {
            Map<String, String> employee1 = (Map<String, String>) object1;
            Map<String, String> employee2 = (Map<String, String>) object2;
            return employee1.get("last").compareTo(employee2.get("last"));
        }
    }

