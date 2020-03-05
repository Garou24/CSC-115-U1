// Brian Coe
// 03/05/2020
// Assessment #1 Chapters 1,2,3, 4 Part II
// This program will take the user's input for a number and raise it to the number they imput for power.
// Then it will display this data in an easy to read table.
//
import java.util.Scanner;

public class PTable {
    public static void main(String[] args) {

        runPTable();
    }

    public static void runPTable() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number you wish to raise to the power: ");

        int number = scanner.nextInt();

        System.out.print("Enter the power: (for example, enter 2 if you wish to square a number) ");

        int power = scanner.nextInt();

        System.out.print("\n");
        System.out.println("---------------------------------");
        System.out.println("number| power| pow(number, power)");
        System.out.println("---------------------------------");
        System.out.print(number + "        " + power + "        " + (Math.round(Math.pow(number, power))));
        scanner.close();
    }
}