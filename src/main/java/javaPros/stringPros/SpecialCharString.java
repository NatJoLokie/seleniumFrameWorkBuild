package javaPros.stringPros;

public class SpecialCharString {
    public static void main(String[] args) {
        String input = "Ch@r#7te7s";

        char[] inputArr = input.toCharArray();

        for (char c : inputArr) {
            if (!Character.isLetterOrDigit(c)) {
                System.out.println(c);
            }
        }
    }

}
