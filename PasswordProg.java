/* Brian Coe
   04/14/2020
   Week 11 Programming assignment 
   This program will allow users the ability to generate new passwords and test existing passwords to ensure
   they adhere to a specific set of security rules. The program will give the user multiple promts to read the
   rules required for all passwords, create a random password that follows these rules and to also test a password
   they enter to ensure it follows the rules set by the program.*/

import java.util.Scanner;
import java.util.Random;

public class PasswordProg {
	public static void main(String[] args) {
		// Create an instance of Scanner
		Scanner scanner = new Scanner(System.in);
		// Call the method 'displayMenu()' to show the menu to the user
		displayMenu();
		// Read in input from user and assign to 'choice'
		int choice = scanner.nextInt();
      // IF-ELSE statements

   	if (choice == 1) {

			showPasswordSpecifications();

		} else if (choice == 2) {

		    	System.out.println("\nYour password is: " + generateRandomPassword());

	   } else if (choice == 3) {

		    	System.out.println("\nEnter a password to test: ");
			   scanner.nextLine();
			   String input = scanner.nextLine();

			   if (verifyPasswordSpecifications(input)) {

			   	System.out.println("\nYour password is valid.");

			   } else {

				   System.out.println("\nYour password is invalid");

			}

		} else {

			System.out.println("Sorry! That was an invalid option.");

		}

        // Be good to your scanners! Close them..
        //
		scanner.close();

	}

	//Below  are your methods that you must code!

	static void displayMenu() {
		// This method simply displays the menu of options (as per the pdf
        // specifications) and then asks the user to enter a number
        System.out.println("Here is your menu of options:" + "\n");
        System.out.println("1. See the password rules" + "\n");
        System.out.println("2. Generate a random password" + "\n");
        System.out.println("3. Test the validity of a password" + "\n" + "\n");
        System.out.print("Please make your selection: ");


	}

	static String generateRandomPassword() {
		// PRE-CONDITIONS: None
		// POST-CONDITIONS: A String password that satisfies the specifications is
		// generated and displayed on the screen.

		// use the Chortle password program as a guide,  to help with generating a valid password of 8 characters
		// http://programmedlessons.org/Java9/chap30/ch30_14.html

        String pasw = "";

        // code goes here to generate the password, store it in the variable pasw
        String lower = "abcdefghijklmnopqrstuvwxyz"; //Sets a variable that contains all the alphabet in lowercase
        String upper = lower.toUpperCase(); //Sets a variable that contains the previous letters, but in uppercase
        String numbers = "1234567890"; //Sets a variable with all the numbers allowed
        String special = "!\"#$%&\'()*+,-./)"; //Sets a variable with all the special characters
        Random random = new Random();
		
		//Takes a random character from each of our string variables and places it at the appropriate spot in the password.
        char one = lower.charAt(random.nextInt(lower.length()));
        char two = lower.charAt(random.nextInt(lower.length()));
        char three = upper.charAt(random.nextInt(upper.length()));
        char four = upper.charAt(random.nextInt(upper.length()));
        char five = numbers.charAt(random.nextInt(numbers.length()));
        char six = numbers.charAt(random.nextInt(numbers.length()));
        char seven = special.charAt(random.nextInt(special.length()));
        char eight = special.charAt(random.nextInt(special.length()));

        pasw = pasw + one + two + three + four + five + six + seven + eight;


      return pasw;  // return the generated password

	}

	static void showPasswordSpecifications() {
		// PRE-CONDITIONS: None
		// POST-CONDITIONS: The specifications for a valid password are
		// displayed on the screen
		//
        System.out.println("The rules for your password are:");
        System.out.println("\t1. It must be 8 characters long");
        System.out.println("\t2. The first two characters are lowercase letters");
        System.out.println("\t3. The second two characters are uppercase letters");
        System.out.println("\t4. The third two characters are numbers (0 - 9)");
        System.out.println("\t5. The fourth two characters are any valid character (valid characters are any of these 15 characters: ! \"#$%&\'()*+,-./)");

	}

	static boolean verifyPasswordSpecifications(String input) {
		// PRE-CONDITIONS: The main program will pass in a String (the password to be verified)
		// POST-CONDITIONS: "true" will be returned if the parameter "input" is
		// a valid password, as per the specifications. "false" will be returned otherwise
		//

	  	boolean v = false;   //the variable v will hold the truth value of the validity of the password
		boolean correct_length = input.length() == 8; //Sets a boolean when our password is the correct length of 8
	  	boolean lowercase1 = Character.isLowerCase(input.charAt(0)); //Sets a boolean when our first character is lowercase
		boolean lowercase2 = Character.isLowerCase(input.charAt(1)); //Sets a boolean when our second character is lowercase
		boolean uppercase1 = Character.isUpperCase(input.charAt(2)); //Sets a boolean when our third character is uppercase
		boolean uppercase2 = Character.isUpperCase(input.charAt(3)); //Sets a boolean when our fourth character is uppercase
		boolean number1 = Character.isDigit(input.charAt(4)); //Sets a boolean when our fifth character is a number
		boolean number2 = Character.isDigit(input.charAt(5)); //Sets a boolean when our sixth character is a number
		char sp1 = (input.charAt(6)); //Creates a char variable from the seventh password character
		char sp2 = (input.charAt(7)); //Creates a char variable from the eighth password character
		boolean special1 = !(Character.toString(sp1).matches("[A-Za-z0-9 ]")); //Converts char back to a string and sets boolean if it is not a letter, number or a space
		boolean special2 = !(Character.toString(sp2).matches("[A-Za-z0-9 ]")); //Converts char back to a string and sets boolean if it is not a letter, number or a space
		


     	// code goes here to validate the password that was passed to this method
        if (correct_length && lowercase1 && lowercase2 && uppercase1 && uppercase2 && number1 && number2 && special1 && special2) {
            v = true; //if every boolean was set by the entered password then it passes the verification
        }
     	//  return  the boolean value (true or false)
       	return v;

	}

}