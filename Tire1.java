//Brian Coe
//04/08/2020
//This program will ask the user to input the tire pressure for all four tires.
//It is coded to check that both front tires have the same pressure as each other
//and that both rear tires have the same pressure as each other. The front set of
//tires does not have to have the same pressure as the rear set. If either the
//front set or rear set do not have matching pressure it will display a warning.
//If both the front and rear set have matching pressure then it will display a
//success message.
//
import java.util.Scanner;

public class Tire1 {
    public static void main(String[] args) {

        runTire1 ();
    }

    public static void runTire1() {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user for input for all four tires.
        System.out.print("Please input right front pressure: ");
        int front_right = scanner.nextInt();
        System.out.print("\n");

        System.out.print("Please input left front pressure: ");
        int front_left = scanner.nextInt();
        System.out.print("\n");

        System.out.print("Please input right rear pressure: ");
        int rear_right = scanner.nextInt();
        System.out.print("\n");

        System.out.print("Please input left rear pressure: ");
        int rear_left = scanner.nextInt();
        System.out.print("\n");

        //Check if the front right/left OR the rear right/left have a mismatch in pressure.
        //Throw and error if either set does not have matching pressure. Display a success
        //message if both sets have matching pressure.
        if (front_right != front_left || rear_right != rear_left) {
            System.out.print("Inflation is NOT OK");
        } else {
            System.out.print("Inflation is OK");
        }


        scanner.close();
    }
}