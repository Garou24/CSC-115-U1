//Brian Coe
//05/10/2020
//Week 14 Programming Assignment 2
//This program will create an array of ten randomly generated integers and then display them.
//
import java.util.Scanner;

public class FirstArray{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
  
        // declare an array (named numbs) that holds 10 ints
        int[] numbs = new int[10];
 

        // write a for loop that loops 10 times and generates a random number between 0 and 100
        for (int i = 0; i < numbs.length; i++) {
            // assign the random number to each element in the array , numbs
            numbs[i] = (int)(Math.random()*100) + 1;
        }
        
    
        // write a for loop that displays each number in the array named numbs
        System.out.print("Here are 10 randomly generated numbers: ");
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + " ");
        }
  
  
        scanner.close();
    }
  }