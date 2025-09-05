package javaHPractice;

public class P01_ReverseString {

    public static void main(String[] args) {

        String s = "FirstClass";
        String ts = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            char c = s.charAt(i);
//            System.out.print(c);
            ts = ts + c;

        }
        System.out.println(ts);

    }
}
