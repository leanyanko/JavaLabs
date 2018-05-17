package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static int firstUnique (String string) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int size = string.length();


        for (int i = 0; i < size; i++) {
            char ch = string.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, 2);
            }
            else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < size; i++) {
            char ch = string.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(firstUnique("llaasfs"));
        System.out.print("hello world");
        int[] nums = {1,3,5};
        Arrays.sort(nums);
    }
}
