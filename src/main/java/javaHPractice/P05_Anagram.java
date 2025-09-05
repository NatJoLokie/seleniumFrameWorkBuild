package javaHPractice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class P05_Anagram {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        char[] chA1 = s1.toCharArray();
        char[] chA2 = s2.toCharArray();
        if (chA1.length == chA2.length) {
            Arrays.sort(chA1);
            Arrays.sort(chA2);

            if (Arrays.equals(chA1, chA2)) {
                System.out.println("is Anagram");
            } else {
                System.out.println("Not Anagram");
            }

        }


    }
}
