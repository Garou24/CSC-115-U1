//Brian Coe
//03/11/2020
//Week 7 - programming assignment 2
//This program asks the user to submit 5 grades, averages them and then reports back
//if those grades average to a passing or failing grade.
//
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        runGrades();

    }

    public static void runGrades() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You have completed five tests in this course.");
        System.out.println("Enter your grades below to see your current average.");
        System.out.print("\n");
        System.out.print("Enter your first test score: ");
        double first_grade = scanner.nextDouble();

        System.out.print("Enter your second test score: ");
        double second_grade = scanner.nextDouble();

        System.out.print("Enter your third test score: ");
        double third_grade = scanner.nextDouble();

        System.out.print("Enter your fourth test score: ");
        double fourth_grade = scanner.nextDouble();

        System.out.print("Enter your fifth test score: ");
        double fifth_grade = scanner.nextDouble();

        double average = (first_grade + second_grade + third_grade + fourth_grade + fifth_grade)/5;

        System.out.print("\n");
        System.out.println("Your current average in this class is: " + String.format("%.1f",average));

        if (average >= 64.5) {
            System.out.print("A grade of 64.5 or higher is passing, you are currently PASSING this class.");
        } else {
            System.out.println("A grade of 64.5 or higher is passing, you are currently FAILING this class.");
            System.out.print("Please see me for additional help.");
        }
        scanner.close();
    }
}