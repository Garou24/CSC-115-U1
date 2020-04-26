
/*
    Brian Coe
    04/25/2020
    Week 12 Program Assignment #2
    This program will read in temperature entered by user, determine whether water is a solid liquid or gas at the temperature entered.
    The program will continue to prompt the user for an input until they enter 999. Then the program will stop running and display a
    goodbye message.
*/

import java.util.Scanner;

public class TempSolution
{
	public static void printTemp (double temperature)

	{ 
		if (temperature <= 32.0)
		{
			System.out.print("solid at ");
		}

		else if (temperature >= 212.0)
		{
			System.out.print("gas at ");
		}

		else
			System.out.print("liquid at ");

	}
	public static void printMess ()
	{
	     System.out.print("Water is ");
	 }

	public static void main(String [] args)
	{

		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the temperature (Enter 999 to stop this program): ");
		int tt = input.nextInt();
		double temperature = tt;

        while (tt != 999) {

		printMess ();

        printTemp(temperature);
        
        System.out.println(tt+ " degrees.");
        
        System.out.print("\nPlease enter the temperature (Enter 999 to stop this program): ");
        tt = input.nextInt();
        temperature = tt;
        }

        System.out.print("\nEnd of execution! Thanks for running my program!");

        input.close();
    }
}