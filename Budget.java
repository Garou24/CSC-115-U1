// Budget.java
// CSC  Fall 2018 Assessment 2
// 10/2018
// CSC Staff
// modified by your name Brian Coe

//You are to finish coding this program
// leave all of the comments as is
// write the Java code that is required to make the program run correctly

/**

This program will be written to facilitate
the user in keeping track of his monthly budget (revenues-expenses).

Depending on the amount of money left (balance) in the month, display the following message:
(financial status)

less than 0              			  "You are in financial trouble!"
0-20 dollars, inclusive   			  "You're cutting it too close!"
>20 (exclusive) and < 50 (inclusive),  "You are in good financial shape!"
>50 (exclusive)                       "You are in great financial shape!"

*/
import java.util.Scanner;
public class Budget
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		// prompt the user for the number of revenue sources (income) they have in a month
        // examples of revenue sources are salary, loans, gifts, etc.
        System.out.print("Enter the number of revenue sources you have in a month: ");
        
        // read in the number, and store it in a double variable named num1
        int num1 = in.nextInt();

		// prompt the user for the total of revenue (income) they have in a month
        // read in the number and store it in a double named totResources
        System.out.print("Enter your total revenue for the month: ");
        double totResources = in.nextDouble();

		// prompt the user for the number of expenses they have in a month
        // examples of expenses are rent, gas, food, lodging
        System.out.print("Enter the number of expenses you have in a month: ");

        // read in the number, and store it in a double variable named num2
        int num2 = in.nextInt();

        // prompt the user for the total of expenses they have in a month
        System.out.print("Enter your total expenses for the month: ");

        // read in the number and store it in a double named totExpenses
        double totExpenses = in.nextDouble();
        System.out.println("________________________________________________");

        // display the average revenue amount, rounded to the nearest cent
        System.out.println("Your average revenue for the month is: " + Math.round((totResources/num1)*100.0)/100.0);

        // display the average expense amount, rounded to the nearest cent
        System.out.println("Your average expense for the month is: " + Math.round((totExpenses/num2)*100.0)/100.0);

        // display the amount of money left at the end of the month (total revenues - total expenses)
        double balance = Math.round((totResources - totExpenses)*100.0/100.0);
        System.out.println("Your balance at the end of the month: " + balance);

		// display the appropriate message(financial status of the user)based on the amount of money left
        // the messages are listed in comment lines 19-22 above
        if (balance < 0) {
            System.out.print("You are in financial trouble!");
        } else if (balance >= 0 && balance <= 20) {
            System.out.print("You're cutting it too close!");
        } else if (balance > 20 && balance < 50) {
            System.out.print("You are in good financial shape!");
        } else if (balance >= 50) {
            System.out.print("You are in great financial shape!");
        }

        in.close();
	}
}