package com.anna;

import java.util.*;

public class Main {

    public int reverse(int x) {
        long input = Math.abs(x);
        long res = 0;
        long multip = 0;
        long remainder = 0;

        while(input > 1) {
            remainder = input % 10;
            multip = res * 10;
            res= multip + remainder;
            input = input/10;

        }


        if (input != 0) {
            remainder = input%10;
            multip = res * 10;
            res= multip + remainder;

        }

        if (x < 0) res *= -1;

        if (res >= (long)Integer.MAX_VALUE || res <= (long)Integer.MIN_VALUE ) {
            return 0;
        }

        return (int)res;
    }

    public static void reverseInt() {
        int input = -123;
        long reversedNum = 0;
        long input_long = input;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10;
            input_long = input_long / 10;
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        System.out.println(reversedNum);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        //CALL OF HELPER
        for (int i = 0; i < nums.length; i++){
            System.out.println("---i " + i);
            result.addAll(helper(nums, 0, i));
           // result.addAll(helper(nums, i, nums.length - 1));
        }

        //REMOVE DUPLICATES
        for (int i = 0; i < result.size(); i++){
            List<Integer> test = new ArrayList<Integer>();
            test = result.get(i);
           // result.remove(i);
            while (result.contains(test))  result.remove(test);

//            System.out.println(result.contains(test));

            result.add(test);
        }

        return result;
    }

    private static List<List<Integer>>helper (int nums[], int start, int finish) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();


        for (int i = start; i <= finish; i++) {
//            List<Integer> option = new ArrayList<Integer>();
//            List<Integer> option2 = new ArrayList<Integer>();
//
//            System.out.println("i " + i);
//
//            //ADD INNER ARRAY
//            for (int j = i; j <= finish; j++) {
//                option.add(nums[j]);
//                System.out.println("j " + j + " option " + option);
//            }
//
//
//            //ADD OUTER ARRAY
//            for (int j = start; j < i; j ++){
//                System.out.println("option2 part1 #" + i + " constructing " + option2);
//                option2.add(nums[j]);
//            }
//
//
//            for (int j = i + 1; j <= finish; j ++){
//                option2.add(nums[j]);
//                System.out.println("option2 part2 #" + i + " constructing " + option2);
//            }
//
//            System.out.println("option2 " + option2);

          //  result.add(helper(nums, i + 1))
            result.add(addOption(nums, i, finish));
            result.add(addOption(nums, start, i, finish, finish ));
        }

        return result;

    }

    public static  List<Integer> addOption(int[] nums, int start, int finish) {
        List<Integer> result = new ArrayList<Integer>();

        for (int j = start; j <= finish; j++) {
            result.add(nums[j]);
           // System.out.println("j " + j + " option " + option);
        }
        return  result;
    }

    public static  List<Integer> addOption(int[] nums, int start, int missStart, int missFinish, int finish) {
        List<Integer> result = new ArrayList<Integer>();

        for (int j = start; j < missStart; j ++){
         //   System.out.println("option2 part1 #" + i + " constructing " + option2);
            result.add(nums[j]);
        }


        for (int j = missFinish + 1; j <= finish; j ++){
            result.add(nums[j]);
         //   System.out.println("option2 part2 #" + i + " constructing " + option2);
        }

        return  result;
    }

    public static void main(String[] args) {

        System.out.println(-2147483648);

        int [] primeNums = {1,7,9,11,13};
        int nums[] = {1, 2, 3};
        int nums2[] = {3,2,4,1};

        System.out.println(primeNums.toString());
        System.out.println(Arrays.toString(primeNums));

        String[] favoriteThings = {"roses","whiskers on kittens","raindrops"};
    //    favoriteThings[4] = "chocolate"; // **Check:** why 3 not 4?
        System.out.println( Arrays.toString(favoriteThings) );

        System.out.println(subsets(nums2));
    }
}

//        [[3,4,1],[4,1],[3,2],[2,4,1],[3,2,4],[3,2,4,1],[3,2,1]]
//
//        [[2,3],[2,3,4],[1,3],[1,2],[1,2,3],[1,4],[1,3,4],[1,2,4],[1,2,3,4]]

//                []
//                [[1,3],[1,2]]