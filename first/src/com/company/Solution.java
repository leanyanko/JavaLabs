package com.company;

import sun.awt.geom.AreaOp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> input = new HashMap<Integer, Integer>();
        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();

        int size = nums.length;

        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        for (int i = 0; i < size; i++) {
            input.put(i, nums[i]);
            tmp.put(nums[i], i);
        }

        for (int i = 0; i < size; i++) {

            int search = target - nums[i];
            ans[0] =  i;


            if (input.containsKey(i))
                    input.remove(i);

            if(input.containsValue(search)){

                ans[1] = tmp.get(search);

                return ans;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
       // int nums[] = {2, 7, 11, 15};
        int nums2[] = {3,3};
       // System.out.println(twoSum(nums, 9)[0] +"   : " + twoSum(nums, 9)[1]);
        System.out.println(twoSum(nums2, 6)[0] +"   : " + twoSum(nums2, 6)[1]);
    }
}
