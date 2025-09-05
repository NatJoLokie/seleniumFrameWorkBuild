package javaPros.charPros;

public class P02_PrintTheASCIIofCharOfAString {

    public static void main(String[] args) {
        String s = "azAZ09";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            System.out.println("c : "+(int)c);

        }

    }
}
