//Brian Coe
//02/26/2020
//Week 5 programming assignment 2
//This program will find the circumference and area of a circle with a radius that is provided by the user.
//
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        runTest();

    }

    public static void runTest() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your name:");
        String name = scanner.nextLine();
        scanner.close();
    }
}