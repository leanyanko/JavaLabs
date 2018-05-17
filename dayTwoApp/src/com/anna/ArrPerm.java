package com.anna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrPerm {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        //CALL OF HELPER
        for (int i = 0; i < nums.length; i++){
            System.out.println("---i " + i);
            result.addAll(helper(nums, 0, i));
        //    result.addAll(helper(nums, i, nums.length - 1));
        }

        //REMOVE DUPLICATES
        for (int i = 0; i < result.size(); i++){
            List<Integer> test = result.get(i);
            while (result.contains(test))  result.remove(test);
            result.add(test);
        }

        return result;
    }

    private static List<List<Integer>>helper (int nums[], int start, int finish) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = start; i <= finish; i++) {
            result.add(addOption(nums, i, finish));
            result.add(addOption(nums, start, i, finish, finish ));
         //   System.out.println("EXTERNAL (" + i + " - " + finish + ") - " + finish ") " + " option " + result);
        }

        return result;

    }

    public static  List<Integer> addOption(int[] nums, int start, int finish) {
        List<Integer> result = new ArrayList<Integer>();

        for (int j = start; j <= finish; j++) {
            result.add(nums[j]);
        }

        System.out.println("INNER (" + start + " - " + finish + ") " + " option " + result);
        return  result;
    }

    public static  List<Integer> addWithExclusions(int[] nums, int start, int finish, ArrayList<Integer> pointers) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = start; i < finish; i++) {
          //  for (int j = start; j <= finish; j++) {
            if(!pointers.contains(i))
                result.add(nums[i]);
          //  }
        }



    //    System.out.println("INNER (" + start + " - " + finish + ") " + " option " + result);
        return  result;
    }



    public static  List<Integer> addOption(int[] nums, int start, int missStart, int missFinish, int finish) {
        List<Integer> result = new ArrayList<Integer>();

        for (int j = start; j < missStart; j ++){
            result.add(nums[j]);
        }


        for (int j = missFinish + 1; j <= finish; j ++){
            result.add(nums[j]);
        }

        System.out.println("EXTERNAL ( " + start + " - " + missStart + ") and (" + missFinish +  " - " + finish + ") " + " option " + result);

        return  result;
    }

    public static void main(String[] args) {


        int [] primeNums = {1,7,9,11,13};
        int nums[] = {1, 2, 3};
        int nums2[] = {1,2,3,4};

        System.out.println(subsets(nums2));
    }
}
