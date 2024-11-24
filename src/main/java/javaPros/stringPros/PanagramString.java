package javaPros.stringPros;

public class PanagramString {
    public static void main(String[] args) {
        String input = "The quick brown dog jumps over a lazy dog";

        input = input.toLowerCase();
        if(checkPanagram(input)){
            System.out.println(":: in Panagram");
        }else {
            System.out.println(":: not a Panagram");
        }


    }

    private static boolean checkPanagram(String input) {
        if (input.length() < 26) {
            return false;
        }

        for (char i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) < 0) {
                return false;
            }
        }
        return true;
    }



}

