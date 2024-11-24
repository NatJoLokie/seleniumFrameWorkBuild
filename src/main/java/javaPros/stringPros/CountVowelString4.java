package javaPros.stringPros;

public class CountVowelString4 {
    public static void main(String[] args) {

        String input = "The quick brown dog jumps over a lazy dog";
        char[] inputArray = input.toCharArray();
        int vowCount = 0;
        for (char i : inputArray) {
            if (isVowel(i)) {
                vowCount++;
            }
        }
        System.out.println(vowCount);

    }
    private static boolean isVowel(char i) {
        boolean isVowel =( i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' ||
                           i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U');
        return isVowel;
    }
}
