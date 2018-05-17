package com.anna;

import java.util.*;

public class Lab {

    /*10
Write a function that takes in a list of countries,
swaps the first country with the last one in the list
and prints out each of them following the new order.
Choose the best collection that gives you access to the first and last element.
     */

    public static void countryPrinter(String[] countries ) {
//        ArrayList<String> list = countries;
//        String tmp = countries.get(0);
//        countries.remove(1);
//        countries.add(0, countries.get(countries.size() - 1));
//        countries.add(countries.size() - 1, tmp);
//        countries.remove(countries.size() - 1);
//        System.out.println(countries);
        String tmp = countries[0];
        countries[0] = countries[countries.length - 1];
        countries[countries.length - 1] = tmp;
        System.out.println(Arrays.toString(countries));
    }

    /* 9
    Write a function that creates the right data structure
to keep the names of your family members and their age.
The function asks the user to type in a family member's
name and returns his/her age if the name exists or the
string "Such family member does not exist!" if such a member does not exit.
     */
    public static String family (int age) {
        Map<Integer, String> list = new HashMap();
        list.put(29, "Anna");
        list.put(23, "Andrey");
        list.put(24, "Pavel");
        list.put(52, "Olga");
        list.put(53, "Iurii");
        list.put(33, "Ivan");

        if (list.containsKey(age))
            return list.get(age);
        else return "Member does not exist";
    }

    /* 8
    Write in a function that takes in a positive integer,
creates a linked list with integers in the range
from 1 to the input number and returns a middle
element of the linked list if the length of the
linked list is an odd number, otherwise -1.
     */
    public static int middle (int num) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i < num; i ++){
            list.add(i);
        }
        return (list.size() % 2 == 1) ? list.get(list.size() / 2 + 1) : -1;
    }


    /* 7
    Write a function that takes in a string,
omits all vowels and returns a new string
that contains only consonants. Make sure
to catch the edge cases (e.g. empty string, upper/lower case).
     */
    public static String omitter (String word) {
//        String newWord = "";
//
//        String[] n = word.split("[euoaEUOA]");
//
//        for (int i = 0; i < n.length; i++) {
//            newWord+=n[i];
//        }

        return word.replaceAll("[euioaEUIOA]", "");//newWord;
    }


    /* 6
    Write a function that takes in a list of names,
filters the list removing all duplicate names
and returns a list with unique names.
     */
    public static List<String> remDupl (List<String> names) {
        List<String > result = names; //new ArrayList<>();

        for (int i = 0; i < result.size(); i++){
           String test = "";
            test = result.get(i);

            while (result.contains(test))  result.remove(test);


            result.add(test);
        }
        return result;
    }

    /* 5
    Write a function that takes in an array of integers,
sums the integers that are greater than 1,
and subtracts 3 if the number is greater than 20.
The function returns the result of the operations on the array.
     */
    public static int sums (int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 1) sum+= nums[i];
            if (nums[i] > 20) sum -= 3;
        }
        return sum;
    }

    /* 4
    Write a function that takes in a month of
the year and returns the number of days in this month.
If the input is not a valid month, return 0.
     */
    public static int days (int month) {
        if (month > 12 || month < 1) return 0;
        int [] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return numberOfDays[month - 1];
    }

    /* 3
    Write a function that takes in an array of integers
and returns the max value in that array.
Please do not sort the array.
     */
    public static int max (int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
        }

        return max;
    }

    /* 2
    Write a function that accepts no parameters and creates a
list of any characters and returns a string, which contains
every other element in the list.
Thus, if the list has 'a', 'b', 'c', 'd', the output should be "bd".
     */
    public static String anyOther () {
        List<Character> ch = new ArrayList<>();

        ch.add('a');
        ch.add('b');
        ch.add('c');
        ch.add('d');

        List<Character> c = new ArrayList<>();
        for (int i = 1; i < ch.size(); i+=2){
            c.add(ch.get(i));
        }

        return  c.toString();
    }

    /* 1
        Write a function that takes in a word.
    This function should return true if the word is a palindrome and false if it is not.
    A string is considered a palindrome if it remains unchanged when reversed.
    For example, "dad" is a palindrome as reverse of "dad" is "dad", whereas
    "program" is not a palindrome. Note: palindromes are case insensitive ("Dad" and "dad" are both palindromes).
     */
    public static boolean polindrome (String word) {

        int pointer = (word.length()%2 == 0) ? word.length()/2 : word.length()/2 + 1;
        return  word.substring(0, word.length()/2).equals(reverseString(word.substring(pointer, word.length())));
    }

    public static String reverseString (String input) {
        String output = "";

        int size = input.length();
        char[] tmp = new char[size];

        for (int i = 0; i < size; i++) {
            tmp[i] = input.charAt(size - i - 1);
        }

        output = new String(tmp);//tmp.toString();

        return output;
    }



    public static void main(String[] args) {
//        System.out.println("First: " + polindrome("artytra"));
//        System.out.println("First: " + polindrome("artyytra"));
//        System.out.println("First: " + polindrome("artytrar"));
//        System.out.println();
//        System.out.println(anyOther());


        int[] nums = {1,2,8,4,5,6};

        ArrayList<String> wildlifeNYC = new ArrayList<String>();
        wildlifeNYC.add("Squirrel");
        wildlifeNYC.add("Duck");
        wildlifeNYC.add("Duck");
        wildlifeNYC.add("Giraffe");
        wildlifeNYC.add("Rat");
        wildlifeNYC.add("aorta");
       // wildlifeNYC.add("Squirrel");

        System.out.println(max(nums));
        System.out.println(days(2));
        System.out.println(sums(nums));
        System.out.println(wildlifeNYC);
       // System.out.println(remDupl(wildlifeNYC));
        System.out.println(omitter("strinaar ety"));
        System.out.println(middle(6));

        System.out.println(family(23));
        System.out.println(family(44));

        String []countries = {"USA", "France", "Russia"};
        countryPrinter(countries);


    }
}
