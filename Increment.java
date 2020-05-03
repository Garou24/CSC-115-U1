//Brian Coe
//05/02/2020
//Week 13 Programming Assignment 1
//This program will prompt the user for a beginning and ending number along with an incrementor.
//Then the program will display all the numbers between the beginning and ending numbers provided
//by the user using the increments they provided.
import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your intial number: ");
        int begin_num = input.nextInt();
        
        System.out.print("Enter your ending number: ");
        int end_num = input.nextInt();

        System.out.print("Enter your incrementor: ");
        int increment = input.nextInt();
        //Setting the variable used to display feedback on the screen to equal the beginning number provided.
        //Then checking, if that is less than to equal to the ending number, add the incrementor provided to it.
        for (int output = begin_num; output <= end_num; output = output + increment) {
            System.out.println(output);
        }

    input.close();
    }
    
}