package ex40;

import java.util.*;

public class CompleteLists {

    public static ArrayList<Map<String, String>> filterFirst(String first, ArrayList<Map<String, String>> employeeList) {
        ArrayList<Map<String, String>> tempList = new ArrayList<>();

        for (int i = 0; i < employeeList.size(); i++) {
            Map<String, String> temp = employeeList.get(i);
            if (temp.get("first").equalsIgnoreCase(first)) {
                tempList.add(temp);
            }
        }

        return tempList;
    }

    public static ArrayList<Map<String, String>> filterLast(String last, ArrayList<Map<String, String>> employeeList) {
        ArrayList<Map<String, String>> tempList = new ArrayList<>();

        for (int i = 0; i < employeeList.size(); i++) {
            Map<String, String> temp = employeeList.get(i);
            if (temp.get("last").equalsIgnoreCase(last)) {
                tempList.add(temp);
            }
        }

        return tempList;
    }

    public static void print(ArrayList<Map<String, String>> list) {
        System.out.printf("%-10s|%-15s|%-20s|%-10s%n", "FIRST", "LAST", "POSITION", "DATE OF SEPARATION");
        System.out.printf("%-10s|%-15s|%-20s|%-10s%n", "----------", "---------------", "--------------------", "-------------------");
        for (int i = 0; i < list.size(); i++) {
            Map<String, String> temp = list.get(i);
            System.out.printf("%-10s|%-15s|%-20s|%-10s%n",
                    temp.get("first"), temp.get("last"), temp.get("position"), temp.get("date"));
        }
    }
}

