//Brian Coe
//02/24/2020
//Week 5 programming assignment 3
//This prpgram will create a Mad lib from text entered in by the user.
//
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        runMadLib();

    }

    public static void runMadLib() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.print("Please enter the first group of words: ");
        String firstGroup = scanner.nextLine();
        
        System.out.print("\n");
        System.out.print("Please enter the second group of words: ");
        String secondGroup = scanner.nextLine();

        System.out.print("\n");
        System.out.print("Please enter the third group of words: ");
        String thirdGroup = scanner.nextLine();

        System.out.print("\n");
        System.out.print("Please enter the fourth group of words: ");
        String fourthGroup = scanner.nextLine();

        System.out.print("\n");
        System.out.print("Please enter the fifth group of words: ");
        String fifthGroup = scanner.nextLine();

        System.out.print("\n");
        System.out.print("Here is your story: " + firstGroup + " " + secondGroup + " " + thirdGroup + " " + fourthGroup + " " + fifthGroup);
        System.out.print("\n");
        scanner.close();
    }
}