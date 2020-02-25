import java.util.Scanner;

//Brian Coe
//02/24/2020
//Week 5 Programming assignment 1
//This program prompts the user for input in the form of a number, enterted as the number of rocks.
//Based on the fact that a box will hold 12 rocks, the program will display how many boxes will hold
//the number of rocks entered by the user along with the amount left over.
//
import java.util.Scanner;

public class BoxRocks {
   public static void main(String[] args) {
      runBoxRocks();
   }

   public static void runBoxRocks() {
   
      Scanner scanner = new Scanner(System.in);
   
      System.out.print("\n");
      System.out.print("How many rocks? ");
      
      int num = scanner.nextInt();
      int box = num / 12;
      int rock = num % 12;
      
      System.out.print("\n");
      System.out.print("You will completely fill " + box + " boxes, with " + rock + " rocks left over.");
      scanner.close();
   }
}