package javaPros.stringPros;

public class CountVowelString {
    public static void main(String[] args) {
        String input = "Malalalam";
        String vowel = "aeiouAEIOU";

        char inputArray[] = input.toCharArray();
        int left = 0;
        int right =inputArray.length-1;
        int constantCount = 0;

        while(left<=right){
            if(vowel.indexOf(inputArray[left])==-1){
                left++;
                constantCount++;

            } else if (vowel.indexOf(inputArray[right])==-1) {
                right--;
                constantCount++;

            }else {
                left++;
                right--;
            }
        }
        int vowelCount = input.length()-constantCount;
        System.out.println(input.length());
        System.out.println(constantCount);
        System.out.println(vowelCount);




    }
}
