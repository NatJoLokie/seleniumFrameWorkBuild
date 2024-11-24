package javaPros.stringPros;

public class CountVowelString3 {
    public static void main(String[] args) {
        String input = "CountVowel";

        int voweCount = vowCount(input);

        System.out.println("voweCount : "+voweCount);

    }

    private static int vowCount(String input){
        char[] inputArray = input.toCharArray();
        int vowCount = 0;

        for(char i:inputArray){
            if(i=='a' || i=='e' ||i=='i' ||i=='o' ||i=='u' ||
               i=='A' || i=='E' ||i=='I' ||i=='O' ||i=='U'){
                vowCount++;
            }
        }
        return vowCount;
    }
}
