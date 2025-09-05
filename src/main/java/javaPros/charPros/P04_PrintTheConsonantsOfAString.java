package javaPros.charPros;

public class P04_PrintTheConsonantsOfAString {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over a Lazy dog".replaceAll(" ","");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                System.out.println(c);

            }
        }

    }


}
