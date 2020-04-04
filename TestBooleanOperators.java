//Brian Coe
//04/04/2020
//Ch 6 Programming Assignment 1
//The program will prompt the user for a integer number and will store that number.
//Next the program will perform a series of test against this number and report
//to the screen if that test is successful. The following will be tested for:
//If the number entered by the user is divisible by 2 and 3 and 5 followed by
// checking if the number is divisible by 2 and 3 and then if the number is divisible
//by 2 or 3. The program will only report back on the tests that passed.
//
import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        runBoolean();
    }

    public static void runBoolean() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int input = scanner.nextInt();

        if ( input % 2 == 0 && input % 3 == 0 && input % 5 == 0 ) {
            System.out.println("This number is divisible by 2 and 3 and 5.");
        }

        if ( input % 2 == 0 && input % 3 == 0 ) {
            System.out.println("This number is divisible by 2 and 3.");
        }

        if ( input % 2 == 0 || input % 3 == 0) {
            System.out.print("This number is divisible by 2 or 3.");
        }

        scanner.close();
    }
}