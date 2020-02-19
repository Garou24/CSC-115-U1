//Brian Coe
//02/18/2020
//Week 4 Programming Assignment 1
//Java Program used to calculate the user's BMI
//
import java.util.Scanner;
public class Exercise2_14 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter weight in pounds: ");
      double weight = input.nextDouble();
   
      System.out.print("Enter height in inches: ");
      double height = input.nextDouble();
   
      double bmi = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
   
      System.out.printf(("BMI is ") + "%.2f", bmi);
   }
}