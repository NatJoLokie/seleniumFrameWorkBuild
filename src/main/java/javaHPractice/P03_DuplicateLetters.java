package javaHPractice;

public class P03_DuplicateLetters {

    public static void main(String[] args) {

        String str1 = "malayalam";
        String str = str1.toLowerCase();

        char[] charAr = str.toCharArray();

        for (int i = 0; i < charAr.length; i++) {
            for (int j = i + 1; j < charAr.length; j++) {
                if (charAr[i] == charAr[j]) {
                    System.out.print(charAr[i]);
                    break;
                }
            }

        }


    }
}
