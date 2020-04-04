//Brian Coe
//04/04/2020
//Ch 6 Programming Assignment 3
//This program will ask the user to enter an integer number and will then display back the
//month of the year that coresponds to that number. If the number entered is less than 1 or
//greater than 12 the program will report that their month is invalid.
//
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        runCalendar();
    }

    public static void runCalendar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int month_of_year = scanner.nextInt();
        String month = "";

        switch(month_of_year) {
            case 1: month = "January";
                    break;
            case 2: month = "Febuary";
                    break;
            case 3: month = "March";
                    break;
            case 4: month = "April";
                    break;
            case 5: month = "May";
                    break;
            case 6: month = "June";
                    break;
            case 7: month = "July";
                    break;
            case 8: month = "August";
                    break;
            case 9: month = "September";
                    break;
            case 10: month = "October";
                    break;
            case 11: month = "November";
                    break;
            case 12: month = "December";
                    break;
            default: month = "invalid";
                    break;
            }
        
        System.out.print("Your month is " + month);

        scanner.close();
    }

}