//Brian Coe
//02/10/2020
//Chapter 2 Programming Assignment #4
//
//Defining the class
public class Half {
   //Declaring the method
   public static void main(String[] args) {
      //Defining a double variable as youName using camelCase and initializing it to 10
      double youName = 10;
      //Printing the result for the variable youName divided by 2
      System.out.print((youName/2) + "\n");
      //Printing the result of adding 3 to the variable youName
      System.out.print((youName+3) + "\n");
   
      //Defining an integer variable as newVar using camelCase and initializing it to 20
      int newVar = 20;
      //Printing the result of newVar divided by 2
      System.out.print((newVar/2) + "\n");
   
      //Declaring the string variable userName as Brian using camelCase
      String userName = "Brian";
      //Displaying the value of the variable userName
      System.out.print((userName) + "\n");
   
      //Declaring the the boolean variable trueFalse using camelCase and initializing it as true
      boolean trueFalse = true;
      //Changing the value of trueFalse to false
      trueFalse = !trueFalse;
      //Displaying the value of the variable trueFalse
      System.out.print(trueFalse);
   }
}