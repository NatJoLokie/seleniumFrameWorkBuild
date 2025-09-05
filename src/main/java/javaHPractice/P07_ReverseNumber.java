package javaHPractice;

public class P07_ReverseNumber {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int rem = 0;
        int temp = num;

        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.println(temp);
        System.out.println(rev);
        if (num == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is Not A palindrome");
        }


    }
}
