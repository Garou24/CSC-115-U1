//Brian Coe
//05/09/2020
//Week 14 Programming Assignment 1
//
import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter a total of 10 integers separated by a space. Hit the Enter key when done. ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("You entered: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Those numbers in reverse order are: ");
        for (int i = 9; i >= numbers.length; i--) {
            System.out.print(numbers[i]);
        }

            
    }
}