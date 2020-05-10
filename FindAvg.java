//Brian Coe
//05/09/2020
//Week 14 Programming Assignment 3
//This program will prompt the user to enter an integer for the number of doubles they plan to use.
//Then it will prompt them to enter in a number of doubles that equals the amount they stated and it
//will place these doubles into an array. Next the program will find the average of the array of doubles
// and display that to the screen along with the number of doubles entered that was higher than the average.
//
import java.util.Scanner;

public class FindAvg {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = 0;
        //Prompt for the size of the array
        System.out.print("Enter the number of items(double numbers) you plan to use: ");
        size = scanner.nextInt();

        double[] doubles = new double[size];
        
        System.out.print("Enter your items(double numbers) separated by a space. Hit the Enter key when done. ");
        //Read in the input fromt he user into the array
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = scanner.nextDouble();
        }

        scanner.close();

        double total = 0;
        //Sum the array
        for (int i = 0; i < doubles.length; i++) {
            total += doubles[i];
        }

        double average = (total/doubles.length);
        //Find the average of the array and display it
        System.out.println("The average of the numbers you entered is: " + average);

        int count = 0;
        //Count the number of doubles in the array higher than the average of the array
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] > average) {
                count = count + 1;
            }
        }

        System.out.print("The number of elements above the average is: " + count);

    }
    
}