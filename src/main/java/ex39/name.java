package ex39;

    import java.util.*;

   public class name {
        public static Map<String, String> input(String first, String last, String position, String date) {
            Map<String, String> output = new HashMap<String, String>();
            output.put("first", first);
            output.put("last", last);
            output.put("position", position);
            output.put("date", date);
            return output;
        }
    }

