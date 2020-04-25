//Brian Coe
//04/24/2020
//Week 12 Program Assignment #1
//This program will randomly generate a number between 0 and 100 and then ask the user to guess that number.
//After inputting a guess the program will display if that is the correct number, or if the guess is too high
//or too low. If the input from the user is not the correct number the program will ask them to guess again 
//until they reach the correct number. Then it tell the user their guess was correct as well as display the
//number of guesses it took to reach the correct answer.

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {


        int number = (int) (Math.random()*101);

        Scanner input = new Scanner(System.in);
        
        System.out.println("Guess a magic number between 0 and 100");
        
        int guess = -1;
        int count = 0;

        while (guess != number) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number);
                count++;
                System.out.print("\nIt took you " + count + " guesses to get this correct!");
            } else if (guess > number) {
                System.out.println("Your number is too high");
                count++;
            } else {
                System.out.println("Your number is too low");
                count++;
            }
        }

        input.close();
    }

}