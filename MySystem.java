//Brian Coe
//05/12/2020
//Assessment 3 Spring 2020 - Part 2 
//Question 3
//
import java.util.Scanner;

public class MySystem {
    public static void main(String[] args) {
		// Create an instance of Scanner
		Scanner scanner = new Scanner(System.in);
		// Call the method 'displayMenu()' to show the menu to the user
		displayMenu();
		// Read in input from user and assign to 'choice'
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            //call the addition method
			addNumbers();

		} else if (choice == 2) {
            //call the subtraction method
		    subtractNumbers();

	   	} else if (choice == 3) {
            //close the program
            System.exit(0);

		} else {
            //report that the option was not listed and call the menu again
			System.out.println("Sorry! That was an invalid option.");
            displayMenu();
		}

        scanner.close();
    }

    static void displayMenu() {
		// This method simply displays the menu of options
        System.out.println("Welcome to My System");
        System.out.println("Enter the letter of the option you wish to run!" + "\n");
        System.out.println("1- Add 2 numbers" + "\n");
        System.out.println("2- Subtract 2 numbers" + "\n");
        System.out.println("3- Exit this Program" + "\n");
        System.out.print("Please enter your choice: ");


    }
    
    static void addNumbers() {
        Scanner scanner = new Scanner(System.in);

        //Prompt user for the first number and assign it to a variable
        System.out.println("Please enter the first number you wish to add: ");
        int add1 = scanner.nextInt();

        //Prompt user for the second number and assign it to a variable
        System.out.println("Please enter the second number you wish to add: ");
        int add2 = scanner.nextInt();

        //create a new variable that combines the two previous variables
        int total_add = add1 + add2;

        //Display the result of the addition of the two user numbers.
        System.out.print("The total of " + add1 + " added to " + add2 + " is " + total_add);

        scanner.close();
    }

    static void subtractNumbers() {
        Scanner scanner = new Scanner(System.in);

        //Prompt user for the first number and assign it to a variable
        System.out.println("Please enter the first number you wish to subtract: ");
        int sub1 = scanner.nextInt();

        //Prompt user for the second number and assign it to a variable
        System.out.println("Please enter the second number you wish to subtract: ");
        int sub2 = scanner.nextInt();

        //create a new variable that subtracts the two previous variables and prevents negative numbers
        int total_sub = 0;
        if (sub1 > sub2) {
            total_sub = sub1 - sub2;
            System.out.print("The total of " + sub1 + " minus " + sub2 + " is: " + total_sub);
        } else {
            total_sub = sub2 - sub1;
            System.out.print("The total of " + sub2 + " minus " + sub1 + " is: " + total_sub);
        }

        scanner.close();
    }
    
}