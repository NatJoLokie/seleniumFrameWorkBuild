package javaPros.stringPros;

public class ReverseString {
    public static void main(String[] args) {
        String input = "never odd or even";

        char[] inputArray = input.toCharArray();

        int left = 0;
        int right = inputArray.length - 1;

        while (left <= right) {

            char temp = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = temp;

            left++;
            right--;

        }
        System.out.println(inputArray);
    }
}
