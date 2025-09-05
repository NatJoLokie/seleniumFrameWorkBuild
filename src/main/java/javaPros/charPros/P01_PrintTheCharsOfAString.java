package javaPros.charPros;

public class P01_PrintTheCharsOfAString {

    public static void main(String[] args) {
        String str = "Hello, World!";
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
