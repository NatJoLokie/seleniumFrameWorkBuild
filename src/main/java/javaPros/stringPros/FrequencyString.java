package javaPros.stringPros;

import java.util.HashMap;

public class FrequencyString {
    public static void main(String[] args) {
        String input = "madam";
        char[] inputArray = input.toCharArray();

        HashMap<Character,Integer> freqCount = new HashMap<Character,Integer>();

        for(char c :inputArray){
            System.out.println(c);
            freqCount.put(c, freqCount.getOrDefault(c,0)+1);
        }
        System.out.println(freqCount);
    }
}
