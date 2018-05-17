package com.anna;
import java.util.Scanner;

public class Ask {

    public static void askAQuestion () {
       // Scanner input = new Scanner(System.in);
        String userInput = grabUserInput();
        if (userInput.contains("who")) {
            System.out.println("We're the ADI class.");
        }
        else if (userInput.contains("what")) {
            System.out.println("What?");
        }
        else if (userInput.contains("why")) {
            System.out.println("Because we can");
        }
        else if (userInput.contains("where")) {
            System.out.println("At the venue");
        }
        else if (userInput.contains("when")) {
            System.out.println("Yesterday");
        }
        else if (userInput.contains("exit")) {
            askAgain();
        }
        else {
            System.out.println("I don't know how to answer that question.");
            System.out.println("Try again...");
        }

        askAQuestion();
    }

    public static String grabUserInput() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        return userInput;
    }

    public static void askAgain() {
        System.out.println("\nAre you sure you have no more questions? y or n");
        String userInput = grabUserInput();
        if (userInput.equals("y")) {
            System.out.println("Thanks for playing. Goodbye.");
            System.exit(0);
        }
        else if (userInput.equals("n")) {
            System.out.println("Ask another then:");
            askAQuestion();
        }
    }


    public static void main(String[] args) {
        System.out.println("\nAsk: who, what, why, when, or where");
        askAQuestion();
    }
}
