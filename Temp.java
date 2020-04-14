/*
    Program revised by Brian Coe
    04/14/2020
    Week 10 Prog Asg #1
	This program will read in temperature entered by user, determine whether water is a solid liquid or gas at the temperature entered.
	Author: S Brown
	11/2018
   Follow directions in the comments, and get this to run correctly!
*/

import java.util.Scanner;

public class Temp
{
	public static void printTemp (double temperature)   // this is the method I will call, it can appear here, or after the main method it is
	                                                 // void, because it does not return anything, it needs an input parameter, replace the xxxxxxx here
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
	public static void printMess ()              //this is a void, non returning method, no input parameter needed
	{
	     System.out.print("Water is ");
	 }

	public static void main(String [] args)   // here is the main method, it is the special, most important method, it calls all other methods
	{
		//Create a scanner
		Scanner input = new Scanner(System.in);
		//Prompt user to enter temperature
		System.out.print("Please enter the temperature: ");
		int tt = input.nextInt();
		double temperature = tt;

		printMess();                                // call the method that displays the beginning of the message (replace the xxxxxxxxx)

		printTemp(temperature);                   // call the method which needs 1 parameter, temperature
		                                           // fill in the ---------- and xxxxxxxxxxxx here
		System.out.println(tt+ " degrees.");

        input.close();
	}
}