package javaPros.stringPros;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SwapString {
    public static void main(String[] args) {
        String inputString = "google";

        char[] strArr = inputString.toCharArray();
        Set<Character> strSet = new HashSet<>();
        for (char str : strArr) {
            strSet.add(str);
        }
//        System.out.print(strSet);
        int count = 0;
        List<Character> strList = strSet.stream().toList();
        for (int i = 0; i < strList.size(); i++) {
            for (int j = i; j < strArr.length; j++) {
                if (strList.get(i) == strArr[j]) {
                    System.out.println(strList.get(i) +" "+strArr[j]);
                    count = count + 1;
                }

            }
            System.out.println(strList.get(i)+" : "+count);

        }
    }


}
