package javaPros.stringPros;

public class ReplaceConstantsString {
    public static void main(String[] args) {
        String input = "nameNAME";
        char[] inputArray = input.toCharArray();
        StringBuilder sb =new StringBuilder();

        for (char ch : inputArray) {
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
               || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                sb.append('x');

            }else{
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}