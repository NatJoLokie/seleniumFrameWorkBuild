package javaPros.stringPros;

public class toggleCaseString {
    public static void main(String[] args) {

        String input = "capital-LOWER";
        char[] inputArray = input.toCharArray();

        System.out.println((int) 'a');
        System.out.println((int) 'z');
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        StringBuilder sb = new StringBuilder();
        for (char ip : inputArray) {
            if(ip >=97 && ip <=122){
                int op = (int) ip -32;
                char opr = (char) op;
                sb.append(opr);

            }else if(ip>=65 && ip <= 90){
                int op = (int) ip +32;
                char opr = (char) op;
                sb.append(opr);

            }
            else {
                sb.append(ip);
            }

        }
        System.out.println(sb);

    }
}
