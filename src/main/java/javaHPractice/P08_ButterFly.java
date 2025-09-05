package javaHPractice;

public class P08_ButterFly {
    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = (intArr.length - 1) / 2; i >= 0; i--) {
            System.out.print(intArr[i] + ",");
        }
//        System.out.println();
        for (int i = intArr.length-1; i >= (intArr.length) / 2; i--) {
            System.out.print(intArr[i]+",");
        }


    }
}
