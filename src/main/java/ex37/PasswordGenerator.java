package ex37;

import java.util.*;

public class PasswordGenerator {

        private List<Character> listChar = new ArrayList<>();
        private List<Character> listSpecial = new ArrayList<>();
        private List<Character> listNum = new ArrayList<>();

        public void populateChar() {
            for (char i = 'A'; i <= 'z'; i++) {
                if (i == '[' || i == '\\' || i == ']' || i == '^' || i == '_' || i == '`') {
                    continue;
                }
                listChar.add(i);
            }
            populateSpecial();
            populateNum();
            //print(listChar);
        }

        public void populateSpecial() {
            for (char i = '!'; i <= '*'; i++) {
                listSpecial.add(i);
            }
        }

        public void populateNum() {
            for (char i = '0'; i <= '9'; i++) {
                listNum.add(i);
            }
        }

        public String generate(int length, int special, int num) {
            int counterSpecial = 0;
            int counterNum = 0;
            int counterChar = 0;
            int rand = 0; //randomized number
            String output= "";

            //loop while string is under minimum length
            while ((counterChar + counterNum + counterSpecial) <= length) {
                rand = randomize(3); //randomly adds either char, num or special char
                switch(rand) {
                    case 0: //generates random char
                        if (counterChar <= (special + num)) {
                            rand = randomize(listChar.size());
                            output += listChar.get(rand);
                            counterChar++;
                        }
                        break;
                    case 1: //random special char
                        if (counterSpecial <= special) {
                            rand = randomize(listSpecial.size());
                            output += listSpecial.get(rand);
                            counterSpecial++;
                        }
                        break;
                    case 2: //random num
                        if (counterNum <= num) {
                            rand = randomize(listNum.size());
                            output += listNum.get(rand);
                            counterNum++;
                        }
                        break;
                    default:
                        System.out.println("Program error, try again.");
                        break;
                }
            }
            //to make sure that number of characters are at least equal to (special characters + numbers).
            if (counterChar < (counterNum + counterSpecial)) {
                for (int i = counterChar; i < (counterNum + counterSpecial); i++) {
                    rand = randomize(listChar.size());
                    output += listChar.get(rand);
                    counterChar++;
                }
            }

            return output;
        }

        public int randomize(int size) { //randomizer with min of 0 and max of size
            return (int) Math.floor(Math.random()*((size - 1) + 1));
        }

        public int checkChar(char input) { //check to see if input is in char array
            for (int i = 0; i < listChar.size(); i++) {
                if (listChar.get(i) == input) {
                    return 1;
                }
            }
            return 0;
        }

        public int checkNum(char input) {//see if input is in num array
            for (int i = 0; i < listNum.size(); i++) {
                if (listNum.get(i) == input) {
                    return 1;
                }
            }
            return 0;
        }

        public int checkSpecial(char input) {//see if input is in special array
            for (int i = 0; i < listSpecial.size(); i++) {
                if (listSpecial.get(i) == input) {
                    return 1;
                }
            }
            return 0;
        }



    }

