package javaPros.stringPros;

public class AsciiString {
    public static void main(String[] args) {

        String input = "capital";
//        char A = 'A';
//        int Ai = (int) A;
//
//        char a = 'a';
//        int ai = (int) a;
//
//        System.out.println(A);
//        System.out.println(Ai);
//
//        System.out.println(a);
//        System.out.println(ai);
//
//        int Aa = 97;
//        char aai = (char) (Aa-32);
//
//        System.out.println(aai);
        StringBuilder sb = new StringBuilder();

        char[] inputArray = input.toCharArray();
        for (char c :inputArray){
            System.out.println(c);
            int ca = (int) c-32;
            char car = (char) ca;
            System.out.println(ca);
            System.out.println(car);

            sb.append(car);
        }
        System.out.println("**************");
        System.out.println(sb);




    }
}
