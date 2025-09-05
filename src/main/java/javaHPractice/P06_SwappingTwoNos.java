package javaHPractice;

public class P06_SwappingTwoNos {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        System.out.println("before Swap n1 : " + n1);
        System.out.println("before Swap n2 : " + n2);

        n1 = n1 + n2; //30

        n2 = n1 - n2; // 30 - 20 = 10

        n1 = n1 - n2;  // 30 - 10 = 20

        System.out.println("after Swap n1 : " + n1);
        System.out.println("after Swap n2 : " + n2);

    }
}
