package ex34;

import java.util.ArrayList;

public class employee {
    private ArrayList<String> list = new ArrayList<>();

    public void create() {
        this.list.add("Michael Scott");
        this.list.add("Dwight Schrute");
        this.list.add("Jim Halpert");
        this.list.add("Pam Beesly");
        this.list.add("Kevin Malone");
    }

    public void print() {
        System.out.printf("%nThere are %d employees: %n", this.list.size());
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i));
        }
    }

    public String remove(String employee) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).equals(employee)) {
                String output = String.format("Found %s. Removing.", this.list.get(i));
                this.list.remove(i);
                return output;
            }
        }
        return " Employee Not found.";
    }
}




