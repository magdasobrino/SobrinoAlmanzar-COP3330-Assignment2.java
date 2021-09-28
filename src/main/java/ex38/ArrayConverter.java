package ex38;
import java.util.*;

public class ArrayConverter {

    public List<Integer> even(String user) {
        String[] user2 = user.split(" ");
        List<Integer> userList = new ArrayList<>();
        for (int i = 0; i < user2.length; i++) {
            if (Integer.parseInt(user2[i]) % 2 == 0) {
                userList.add(Integer.parseInt(user2[i]));
            }
        }
        return userList;
    }
}


