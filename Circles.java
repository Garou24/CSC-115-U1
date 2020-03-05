//Brian Coe
//02/26/2020
//Week 5 programming assignment 2
//This program will find the circumference and area of a circle with a radius that is provided by the user.
//
import java.util.Scanner;

public class Circles {
    public static void main(String[] args) {

        runCircleData();

    }

    public static void runCircleData() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius:");

        double radius = scanner.nextDouble();
        
        System.out.println("CIRCUMFERENCE  = " + (2 * Math.PI * radius));
        System.out.println("AREA = " + (Math.PI * radius * radius));
        System.out.println("ROUNDED AREA = " + Math.round((Math.PI * radius * radius)));
        scanner.close();
    }
}