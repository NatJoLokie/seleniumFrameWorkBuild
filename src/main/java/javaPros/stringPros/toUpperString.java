package javaPros.stringPros;

public class toUpperString {
    public static void main(String[] args) {

        String input = "toUpperCase";
        char[] inputArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        System.out.println((int) 'a');
        System.out.println((int) 'z');

        for(char ip :inputArray){
            if(ip>=97 && ip<=122) {
                System.out.println(ip);
                int ipi = (int) ip;
                System.out.println(ipi);
                int toCap = ipi - 32;
                char cap = (char) toCap;
                System.out.println(cap);

                sb.append(cap);
            }else{
                sb.append(ip);
            }

        }
        System.out.println(sb);




    }
}
