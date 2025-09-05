package javaHPractice;

public class P02_SwapTwoStrings {
    public static void main(String[] args) {

        String str1 = "Harishs";
        String str2 = "World";
        str1 = str1+str2;

        System.out.println(str1);

        str2 = str1.substring(0,str1.length()-str2.length());
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);



    }
}
