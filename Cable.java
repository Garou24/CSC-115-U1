//Brian Coe
//03/08/2020
//Week 7 Programming Assignment 1
//This program will allow a user to enter the number of cables they would like to order.
//There is a discount for purchasing quantities over 3. When the user enters the number
//of cables, the program will display the amount owed. If the number is higher than 3 the
//program will apply the discount to the price per cable.
//
import java.util.Scanner;

public class Cable {
    public static void main(String[] args) {

        runCable();
        
    }

    public static void runCable() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many cables would you like to order? ");

        double qty = scanner.nextDouble();

        System.out.print("\n");

        if (qty > 3) {
            System.out.print("You owe: $" + String.format("%.2f",(qty * 7.25)));
        } else {
            System.out.print("You owe: $" + String.format("%.2f",(qty * 8.99)));
        }

        scanner.close();
    }
}