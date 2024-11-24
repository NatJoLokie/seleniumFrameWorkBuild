package javaPros.stringPros;

public class CountVowelString2 {
    public static void main(String[] args) {
        String input = "Malalalam";
        String vowel = "aeiouAEIOU";

        char inputArray[] = input.toCharArray();
        int count=0;
        int i = 0;
        while (i <= inputArray.length-1) {
            if (vowel.indexOf(inputArray[i])!=-1) {
                count++;
            }
            i++;

        }

        System.out.println("count++ "+count);


    }
}
