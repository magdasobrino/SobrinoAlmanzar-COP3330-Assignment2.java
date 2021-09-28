package ex24;

import java.util.Arrays;

public class AnagramChecker {

        public Boolean isAnagram(String first, String second){

            int length1 = first.length();
            int length2 = second.length();

            if(length2 != length1) //compares length//
                return false;

            else
            {
                char[] tempChar1 = first.toCharArray();
                char[] tempChar2 = second.toCharArray();
                Arrays.sort(tempChar1);
                Arrays.sort(tempChar2);

                for (int i = 0; i < length1; i++) {
                    if (tempChar1[i] != tempChar2[i]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }



