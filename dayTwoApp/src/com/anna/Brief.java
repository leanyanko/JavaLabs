package com.anna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class Brief {
    /*1
    Find the size:
        a. Create an array of ints.
        b. Print the length of the array to the command line.
        */

    /*
    Concrete Jungle
    a. Create a ArrayList of New York City wildlife.
    b. Create a function that, given an ArrayList of Strings,
        prints for each element:
            "Today, I spotted a /Thing here/ in the concrete jungle!"

    Create a method that, given an array of ints,
    return the sum of the first 2 elements in the array.
    If the array length is 1, just return the single element,
    and return 0 if the array is empty (has length 0).

    Create an method that, given an ArrayList of words (Strings),
    turns each word into Pig Latin. The rules of Pig Latin are as follows:
        a. The first consonant is moved it to the end of the word and suffixed with an ay.
        b. If a word begins with a vowel you just add way to the end.
     */
    public static void lifePrinter (ArrayList<String> life) {
        //System.out.println(life.toString());
        for (int i = 0; i < life.size(); i++) {
            System.out.println("Today, I spotted a " + life.get(i) + " in the concrete jungle!");
        }
    }

    public static int summer (int[] nums) {

        if (nums.length == 1) return nums[0];

        if (nums==null || nums.length == 0) return 0;
        else return nums[0]+ nums[1];

    }

    public static void toLatin (ArrayList<String> words) {
        for (String word: words){
           // char ch = 'e' || 'o';
            String ch = word.substring(0,1);
            //int indexOfFirstConsonant = 0;
//            while( ch.matches("[aeoue]")){
//                indexOfFirstConsonant++;
//                ch = word.substring(indexOfFirstConsonant, indexOfFirstConsonant + 1);
//            }
//
//
//            System.out.println(indexOfFirstConsonant);
//            String parts = "";
//            if (indexOfFirstConsonant > 0)
//             parts = word.substring(0, indexOfFirstConsonant );// +
//                 //   word.substring(indexOfFirstConsonant + 1, word.length() - 2); // +
//                //    word.charAt(indexOfFirstConsonant);
//            parts += word.substring(indexOfFirstConsonant + 1, word.length()) + word.charAt(indexOfFirstConsonant) + "ay";
//
//            word = parts;
//            System.out.println(parts);
            String newWord = "";
            if (ch.matches("[aeoue]") ) newWord = word + "way";
            else newWord = word.substring(1, word.length()) + word.charAt(0) + "ay";
            System.out.println(newWord);
        }
    }

    public static void main(String[] args) {
       int[] firstTask = {1,2,3,4,5,6};
       System.out.println("First:");
       System.out.println("The size is: " + firstTask.length);

        System.out.println();
        System.out.println("Second: ");
        ArrayList<String> wildlifeNYC = new ArrayList<String>();
        wildlifeNYC.add("Squirrel");
        wildlifeNYC.add("Duck");
        wildlifeNYC.add("Giraffe");
        wildlifeNYC.add("Rat");
        wildlifeNYC.add("aorta");
        lifePrinter(wildlifeNYC);
        System.out.println();
        System.out.println("Third:");
        toLatin(wildlifeNYC);
        System.out.println();
        System.out.println("Forth");
        System.out.println(summer(firstTask));
    }
}
