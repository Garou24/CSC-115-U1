//Brian Coe
//05/03/2020
//Week 13 Programming Assignment 2
//This program will prompt the user for the Last anem and numerical grade for a student in class. Then the program
//will report back the student name, grade along with the matching letter grade they earned. It will repeat ten
//times which is the number of students in class and then close.
//
import java.util.Scanner;

public class GradeCat {
    public static void main(String[] args) {

        int count = 1;
        int students = 10;

        while (count <= students) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the last name of a student: ");
            String name = input.nextLine();

            System.out.print("Enter the student's score (between 0 - 100): ");
            int grade_number = input.nextInt();
        
            String grade_letter;

            if (grade_number >= 90 && grade_number <= 100) {
                grade_letter = "A";
            } else if (grade_number < 90 && grade_number >= 80) {
                grade_letter = "B";
            } else if (grade_number < 80 && grade_number >= 70) {
                grade_letter = "C";
            } else if (grade_number < 70 && grade_number >= 65) {
                grade_letter = "D";
            } else {
                grade_letter = "0";
            }

            System.out.println("The student with a last name of " + name + ", scored a " + grade_number + ". This earned them a letter grade of: " + grade_letter);
            count++;

            if (count > students) {
                input.close();//Closing the scanner only after the loop has completed to not interfere with user input and looping
            }
        }


    }
  
}