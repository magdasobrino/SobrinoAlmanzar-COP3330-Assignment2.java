package ex40;

import java.util.HashMap;
import java.util.Map;

public class Employee {

  public static Map<String, String> input(String first,String last, String position, String date)
  {
        Map<String, String> output = new HashMap<String, String>();
        output.put("first", first);
        output.put("last", last);
        output.put("position", position);
        output.put("date", date);
        return output;
    }
}

