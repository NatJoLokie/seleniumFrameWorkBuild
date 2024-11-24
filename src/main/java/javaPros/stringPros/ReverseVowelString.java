package javaPros.stringPros;

public class ReverseVowelString {
    public static void main(String[] args) {
        String input = "Davidson";
        String vowel = "aeiouAEIOU";

        char[] inputArray = input.toCharArray();
        int left = 0;
        int right = inputArray.length - 1;

        while (left < right) {
            if (vowel.indexOf(inputArray[left]) == -1) {
                left++;
            } else if (vowel.indexOf(inputArray[right]) == -1) {
                right--;
            } else {
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(inputArray);

    }
}
