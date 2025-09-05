package javaHPractice;

public class P04_CheckVowel {
//    String s;

    public static void main(String[] args) {
        String str = "better-everyday";

        char[] charArs = str.toCharArray();
        int count = 0;
        String s = null;

        for (int i = 0; i <= charArs.length - 1; i++) {
            if (charArs[i] == 'a' || charArs[i] == 'e' || charArs[i] == 'i' || charArs[i] == 'o' || charArs[i] == 'u') {
//                System.out.print(charArs[i] + "\n");
                count++;
                s = s ;
            }
        }
        System.out.println(s);
        System.out.println(count);


    }
}
