package javaPros.stringPros;

import java.util.Arrays;

public class ReverseAlNumString {

    public static void main(String[] args) {

        String input = "1m2a3la";
        System.out.println(input);

        char[] inputArray = input.toCharArray();

        int left = 0;
        int right = inputArray.length - 1;

        while (left < right) {
            if (!Character.isLetter(inputArray[left])) {
                left++;
            } else if (!Character.isLetter(inputArray[right])) {
                right--;
            } else {
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;

            }
        }
        System.out.println(Arrays.toString(inputArray));
        System.out.println(inputArray);

    }

}
