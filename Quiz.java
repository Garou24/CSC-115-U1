//Brian Coe
//04/02/2020
//Ch 6 Programming Assignment 2
//This program will randomly generate 2 numbers between 0 and 9. It will then ask the user to add the numbers
//and will confirm if they get the right answer or not. Next it will ask the user to subtract one number from
//the other. It will confirm if they get the correct response. It will also always subtract the smaller number
//from the larger to avoid getting any negative numbers.
import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {

        runQuiz();
    }

    public static void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        Random numbers = new Random();

        int first = numbers.nextInt(10);
        int second = numbers.nextInt(10);
        int sum = first + second;

        System.out.println("Your random numbers are: " + first + "," + second);
        System.out.print("\n");

        System.out.print("What is " + first + " + " + second + "? ");
        int user_sum = scanner.nextInt();
        System.out.print("\n");

        if (user_sum == sum) {
            System.out.print("You are correct! \n");
        } else {
            System.out.print("Sorry, your answer is incorrect. It should be " + sum + "\n");
        }
        System.out.print("\n");

        int subtr = 0;
        int user_subtr = 0;
        //While this IF statement feels clunky, I wanted to make sure to not repeat
        //the code used in the example for window dialog
        if (first > second) {
            subtr = first - second;
            System.out.print("What is " + first + " - " + second + "? ");
            user_subtr = scanner.nextInt();
            System.out.print("\n");
        } else {
            subtr = second - first;
            System.out.print("What is " + second + " - " + first + "? ");
            user_subtr = scanner.nextInt();
            System.out.print("\n");
        }


        if (user_subtr == subtr) {
            System.out.print("You are correct! \n");
        } else {
            System.out.print("Sorry, your answer is incorrect. It should be " + subtr);
        }

        scanner.close();
    }
}