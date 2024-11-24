package javaPros.stringPros;

public class PalindromeString {

    public static void main(String[] args) {

        String input = "never odd or even";
        System.out.println(input);

        char[] inputArray = input.toLowerCase().replaceAll("\\s","").toCharArray();

        int iALength = inputArray.length;
//        System.out.println(iALength);

        int left = 0;
        int right = iALength - 1;
        boolean isPalidrome = true;

        while (left < right) {
            if (inputArray[left] != inputArray[right]) {
                isPalidrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalidrome) {
            System.out.println(input + " : Is a Palindrome");
        } else {
            System.out.println(input + " : Is not a Palindrome");
        }
    }

}
