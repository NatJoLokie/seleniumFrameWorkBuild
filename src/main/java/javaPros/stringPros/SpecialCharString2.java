package javaPros.stringPros;

public class SpecialCharString2 {
    public static void main(String[] args) {
        String input = "~`!@#$%^&*()_+-=/*{}[]:\";'Ch@r# !7t* e7$/?><|";

        char[] inputArr = input.toCharArray();

        for (char c : inputArr) {
            if (((c >= 32 && c <= 47) || (c >= 58 && c <= 64) ||
                 (c>=91 && c<=96) || (c>=123 && c<=126))) {
                System.out.print(c);
            }
        }
    }

}



