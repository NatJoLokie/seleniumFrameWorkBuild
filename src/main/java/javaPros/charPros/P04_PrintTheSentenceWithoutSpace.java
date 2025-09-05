package javaPros.charPros;

public class P04_PrintTheSentenceWithoutSpace {
    public static void main(String[] args) {
        String s = ("the quick brown fox\n" +
                "jumps over \n" +
                "a Lazy dog");

        System.out.println(s.replaceAll("",""));


    }


}
