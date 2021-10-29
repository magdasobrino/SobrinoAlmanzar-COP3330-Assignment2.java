package ex35;

import java.util.*;
public class competition {
    private ArrayList<String> contestants = new ArrayList<>();

    public void add(String name) {
        if (name.isEmpty()){
            System.out.println(winner());
            return;
        }
        this.contestants.add(name);
    }

    public String winner() {
        int rand = (int) (Math.floor(Math.random()*((this.contestants.size() - 1) - 1 + 1) + 1)); //randomizes based on (list size - 1)
        System.out.println(rand);
        return String.format("%nThe winner is %s", this.contestants.get(rand));
    }
}

