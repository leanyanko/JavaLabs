package com.anna;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import java.sql.SQLOutput;
import java.util.Scanner;


public class FunctionsLab {

    //1
    public static void oddEven() {

        try {
            System.out.println("Input your number");
            String input = grabUserInput();
            int number = Integer.parseInt(input);
            System.out.println(number % 2 == 0 ? "even" : "odd");
            askForExit("Test more numbers? y/n");
            oddEven();
        } catch (Exception e) {
            System.out.println("You've got a mistake: " + e + ", please, try again");
            oddEven();
        }
    }

    //2
    public static boolean equalSpelling() {
        System.out.println("Input two words");
        String string = grabUserInput();
        String toCompare = grabUserInput();
        return string.equals(toCompare);
    }


    public static String grabUserInput() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        return userInput;
    }

    public static void askForExit(String message) {
            System.out.println(message);
            String answer = grabUserInput();

            if(answer.toLowerCase().equals("y")){
               return;
            }
            else if (answer.toLowerCase().equals("n")){
                System.out.println("Go for main menu? y/n");
                answer = grabUserInput();

                if (answer.equals("y")) intro();
                else if (answer.equals("n"))
                    System.exit(0);
            }
            else {
                System.out.println("unable to parse");
            }
    }



    /* 3
    Write a function that takes in a word and prints out
    its every letter on a new line before it sees the letter "w".
    If it encounters "w" the function should stop executing.
    */
    public static void wLooker() {

        try{
            System.out.println("Input word");
            String word = grabUserInput();
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'w') return;
                System.out.println(word.charAt(i));
            }
            askForExit("Again? y/n");
            wLooker();
        } catch (Exception e) {
            System.out.println("You've got a mistake: " + e + ", please, try again");
            wLooker();
        }
    }

    /* 4
    Write a function that generates a random number.
    Print it out.
    If the number is greater that 50, return it, otherwise return -1.
    You may use control flow and multiple conditionals.
     */
    public static double printRandom(){
        double random = Math.random();
        boolean returned = random > 50;
        System.out.println("Ramdom number is: " + random + " returned: " + returned) ;

        if (returned) return random;
        else return -1;
    }

    /* 5
    Write a function that takes in 3 integers:
    day, month, and year and computes day, month, and year of the next day.
    The function should return a string (e.g. day:12 month:11 year:1988)
     */
    public static String nextDay() {
        String output = "";

        System.out.println("Input date mm/dd/yyyy");

        try{
            String[] date = grabUserInput().split("/");

            int month = Integer.parseInt(date[0]);
            int day = Integer.parseInt(date[1]);
            int year = Integer.parseInt(date[2]);

            boolean leap = false;


            if(year % 4 == 0)
            {
                if( year % 100 == 0)
                {
                    if ( year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }
                else
                    leap = true;
            }
            else
                leap = false;

            int [] numberOfDays = {31, (leap) ? 29: 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (day < numberOfDays[month])
                day++;
            else if ( day == numberOfDays[month] && month < 12)
                month++;
            else if (day == numberOfDays[month] && month == 12)
                year++;
            else throw new Exception("Something went wrong ");

            output =  new String("day: " + day + ", month: " + month + ", year: " + year);

            askForExit("One more year? y/n");
            nextDay();
        }catch(Exception e) {
            System.out.println("You've got a mistake: " + e + ", please, try again");
            nextDay();
        }

        return output;
    }

    /* 6
    Write a function that takes in a word, omits every other letter
    in that word and returns a new word.
    You can use control flow and multiple conditionals.
     */
    public static String halfWord () {

        try{
            char [] letters = grabUserInput().toCharArray();
            char[] output = new char[letters.length / 2 + 1];

            int j = 0;
            for (int i = 0; i < letters.length; i +=2) {
                output[j++] = letters[i];
            }

            return new String(output);

        }
        catch(Exception e) {
            System.out.println("You've got a mistake: " + e + ", please, try again");
            halfWord();
        }
        return null;
    }

    /* 7
    Write a function that takes in a number greater than 5
    and prints out all the numbers from 1 to that number except number 4.
    Please use a while statement.
     */

    public static void printer5() {
        try{
            System.out.println("Input number > 5");
            int input = Integer.parseInt(grabUserInput());
            if (input <= 5) return;
            for (int i = 1; i < input; i++) {
                if (i != 4)
                    System.out.println(i);
            }
            askForExit("More? y/n");
            printer5();
        }
        catch(Exception e) {
            System.out.println("You've got a mistake: " + e + ", please, try again");
            printer5();
        }
    }

    /* 8
    Write a function that takes in 2 numbers, and checks if they are the same.
    If they are not the same, it adds 1 to every number and returns its sum.
    If the numbers are the same, it adds 2 to every number and returns its sum.
     */

    public static int checkerOf2() {
        int answer = -1;

        try {
            int a = Integer.parseInt(grabUserInput());
            int b = Integer.parseInt(grabUserInput());

            if (a != b ) answer = a + b + 2;
            else answer = a + b + 4;

//            askForExit("More? y/n");
//            checkerOf2();
        }
        catch(Exception e) {
            System.out.println("You've got a mistake: " + e + ", please, try again");
            checkerOf2();
        }
        return answer;
    }

    /* 9
    Write a function that asks the user to enter a country domain.
    If the user types in "us", the function prints out "United States",
    if the user enters "de", the function prints out "Germany",
    if the user types in "hu" the response should be "Hungary".
    In all other cases the function should print out "Unknown".
    Please try to use a switch statement and make sure the function
    works with a user's input of lower and upper case strings.
     */

    public static void countryPrinter() {
        try{
            System.out.println("Input country");
            String input = grabUserInput().toLowerCase();
            if (input.equals("us"))
                System.out.println("United States");
            else if (input.equals("de"))
                System.out.println("Germany");
            else if (input.equals("hu"))
                System.out.println("Hungary");
            else System.out.println("Unknown");
            askForExit("More countries? y/n");
            countryPrinter();
        }
        catch(Exception e) {
            System.out.println("You've got a mistake: " + e + ", please, try again");
            countryPrinter();
        }
    }

    /* 10
    Write a function that asks the user to type in a letter
    and prints out whether the letter is a vowel or a consonant.
    You may use control flow and multiple conditionals.
     */

    public static void consonant() {
        try{
            System.out.println("Input one letter");
            String  input = grabUserInput();
            if (input.length() > 1) return;
            if (input.matches("[aeoue]"))
                System.out.println("vovel");
            else System.out.println("consonant");
            askForExit("more letters?");
            consonant();
        }
        catch(Exception e) {
            System.out.println("You've got a mistake: " + e + ", please, try again");
            countryPrinter();
        }
    }



    public static void intro () {
        System.out.println("Make your choice 1 - 10");
        Scanner reader = new Scanner(System.in);
        try {
            int input = reader.nextInt();

            switch (input) {
                case 1: oddEven();
                        break;
                case 2: System.out.println("Speling is equal: " + equalSpelling());
                        break;
                case 3: wLooker();
                        break;
                case 4: printRandom();
                        break;
                case 5: System.out.println("Next day is: " + nextDay());
                        break;
                case 6: System.out.println(halfWord());
                        break;
                case 7: printer5();
                        break;
                case 8: System.out.println(checkerOf2());
                        break;
                case 9: countryPrinter();
                        break;
                case 10: consonant();
                        break;
            }
        } catch (Exception e) {
            System.out.println("You've got a mistake: " + e + ", please, try again");
            intro();
        }

        askForExit("More tasks? y/n");
        intro();

    }

    public static void main(String[] args) {
        intro();
    }
}
