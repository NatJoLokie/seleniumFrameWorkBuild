package javaPros.stringPros;

public class SpecialCharString3 {
    public static void main(String[] args) {
        String input = "~`!@#$%^&*()_+-=/*{}[]:\";'Ch@r# !7t* e7$/?><|";

//        System.out.println((int)'a');
//        System.out.println((int)'z');
//        System.out.println((int)'A');
//        System.out.println((int)'Z');
//        System.out.println((int)'0');
//        System.out.println((int)'9');

        char[] inputArr = input.toCharArray();

        for (char c : inputArr) {
            if (!((c>=48 && c<=57) || (c>=65 && c <=90) ||(c>=97 && c<=122) )) {
                System.out.print(c);
            }
        }
    }

}



