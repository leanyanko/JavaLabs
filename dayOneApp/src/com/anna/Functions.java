package com.anna;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.sound.midi.Soundbank;

public class Functions {

    public static int divide152By(int argument) {
        return 152 / argument;
    }


    public static boolean thirdAndFirst (String third, String first) {
        return third.toLowerCase().charAt(2) == first.toLowerCase().charAt(0);
    }

    public static int transmogrifier (int factor, int multipl, int power) {
        return pow(factor * multipl, power);
    }

    public static int pow(int a, int b) {
        if (b == 1) return a;

        return a * pow(a, b - 1);
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
//        System.out.println(divide152By(3));
//        System.out.println(divide152By(43));
//        System.out.println(divide152By(8));

        System.out.println(thirdAndFirst("billygoat","LION"));
        System.out.println(thirdAndFirst("drEAMcaTCher","statue"));
        System.out.println(thirdAndFirst("Apple","Peon"));

        System.out.println(transmogrifier(1, 2, 3));

        System.out.println(reverseString("black cat"));

    }
}
