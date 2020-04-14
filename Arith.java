//Brian Coe
//04/13/2020
//Week 10 - Prog Asg #2
//This program will prompt the user to enter two integers and then will perform a series of math equations on those values.
//The program will call a seperate method for each problem and then display the result of that equation on the screen.
//The methods called will add, subtract, multiply and divide the recorded inputs.
//
import java.util.Scanner;

public class Arith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide an integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Provide another integer: ");
        int num2 = scanner.nextInt();
        System.out.println("____________________________________");

        int total_sum = sum(num1,num2);
        System.out.println("The sum of your integers is: " + total_sum);

        int total_diff = diff(num1, num2);
        System.out.println("The difference between your integers is: " + total_diff);

        int total_prod = prod(num1, num2);
        System.out.println("The product of your integers is: " + total_prod);

        int total_quotient = quotient(num1, num2);
        System.out.print(total_quotient);


        scanner.close();
    }

public static int sum(int num1, int num2) {
    int sum_result = num1 + num2;
    return sum_result;
}
//Setting the higher of the two numbers first so as to avoid getting negative numbers.
public static int diff(int num1, int num2) {
    int diff_result = 0;
    if (num1 > num2) {
        diff_result = num1 - num2;
    } else {
        diff_result = num2 - num1;
    }
    return diff_result;
}

public static int prod(int num1, int num2) {
    int prod_result = num1 * num2;
    return prod_result;
}
//Setting the higher of the two numbers first and displaying the order in which they are being 
//divided on the screen.
public static int quotient(int num1, int num2) {
    int quotient_result = 0;
    if (num1 > num2) {
        quotient_result = num1/num2;
        System.out.print("The quotient of " + num1 + " and " + num2 + " is: ");
    } else {
        quotient_result = num2/num1;
        System.out.print("The quotient of " + num2 + " and " + num1 + " is: ");
    }
    return quotient_result;
}

}