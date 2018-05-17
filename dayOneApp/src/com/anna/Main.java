package com.anna;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Works");
//        boolean [] arr = new boolean[4];
//        boolean a= arr[0];
//
//       // if(arr)
//            System.out.println(a);5

        Scanner reader = new Scanner(System.in);

        while(reader.hasNext()) {
           // System.out.println("Enter a number");
            // int n = Integer.parseInt(reader.next());
            int n = reader.nextInt();


            if (n % 3 == 0) System.out.print("fizz");
            if (n % 5 == 0) System.out.print("buzz");
            System.out.println();
        }

        reader.close();
    }
}
