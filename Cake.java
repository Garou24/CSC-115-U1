/*This program allows the user to enter in their first and last name along with the price they will pay
 for their cupcakes and the total number of cupcakes they want to buy. Then the program will divide the
 total price by the number of cupcakes to get the cost per cupcake the user will pay.
 The program then reports the user's first and last name along with the cost per cupcake rounded to two
 decimal places to display as currency.
 written by  Brian Coe
 03/05/2020*/

 import java.util.Scanner;

 public class Cake {
   public static void main(String args[]) {

        runCake();

   }

   public static void runCake() {
    
        Scanner scanner = new Scanner(System.in);
   
    // this program will prompt the user for the customers name (first, then last) who is placing the order of cupcakes (and read in the names)
        System.out.print("Enter the first name of the customer: ");
        String first = scanner.nextLine();
        System.out.print("\n");
        System.out.print("Enter the last name of the customer: ");
        String last = scanner.nextLine();
    // this program will prompt the user, and read in the number of cupcakes ordered as well as the total cost of the order of cupcakes
        System.out.print("\n");
        System.out.print("Enter the total cost of the cupcakes: ");
        double cost = scanner.nextDouble();
        System.out.print("\n");
        System.out.print("Enter the number of cupcakes: ");
        int amount = scanner.nextInt();
    // you must calculate the individual cost of each cupcake and display it out rounded to the nearest cent
        double cost_per = (cost / amount);
    // display the customer name (first and last), and the cost of each cupcake rounded to the nearest cent, with an appropriate message (see my sample run)
        System.out.print("\n");
        System.out.print(first + " " + last + " will pay $" + Math.round(cost_per * 100.0)/100.0 + " for each cupcake.");
    // this program should be user friendly, and all prompts and displays should be meaningful and complete
        scanner.close();
      
   }
 }