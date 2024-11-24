package javaPros.stringPros;

public class toLowerString {
    public static void main(String[] args) {

        String input = "toLowerCase";
        char[] inputArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char ip : inputArray) {
            if (ip >= 65 && ip <= 90) {
                System.out.println(ip);
                int ipi = (int) ip;
                System.out.println(ipi);
                int toLow = ipi + 32;
                char cap = (char) toLow;
                System.out.println(cap);

                sb.append(cap);
            }else{
                sb.append(ip);
            }
        }
        System.out.println(sb);


    }
}
