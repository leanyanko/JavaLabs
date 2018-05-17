package com.anna;

public class Reverser {
    public static int reverse(int x) {
//        int ans = 0;
//        int num = x;
//        for (int i = 10; i > 0; i--){
//            double iterator = Math.pow(10,i);
//          //  System.out.println(iterator);
//            int remainder =(int) ((double)x / iterator);
//          //  System.out.println(remainder);
//            if (remainder >= 1) {
//                remainder =(int) ((double)x % iterator);
//                System.out.println(remainder);
//                ans+= (num - remainder);
//                System.out.println("ans"+ans);
//                num -= remainder;
//            }
//        }
//
//        return ans;
        int input = x;
        int res = 0;
        int multip = 0;
        int remainder = 0;
        while(input > 1){
            remainder = input%10;
          //  System.out.println("remainder " + remainder);
            multip = res * 10;


            res= multip + remainder;
            System.out.println("mult " + multip + " + remaind " + remainder + " = res " + res);

          //  System.out.println("res " + res);
            input = input/10;
            System.out.println("input " + input);
        }
        remainder = input%10;
        multip = res * 10;
        res= multip + remainder;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
}
