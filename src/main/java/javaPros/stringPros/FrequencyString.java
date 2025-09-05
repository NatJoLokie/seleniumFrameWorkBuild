package javaPros.stringPros;

import java.util.HashMap;
import java.util.Map;

public class FrequencyString {
    public static void main(String[] args) {
        String input = "madam is going to london";
        char[] inputArray = input.toLowerCase().toCharArray();

        System.out.println(inputArray);

        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

        for (char ch : inputArray) {
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        System.out.println(freqMap);

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {

            System.out.println(entry.getKey() + " = " + entry.getValue());

        }


    }
}
