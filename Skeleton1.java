//Final Assessment question 1
//May 2020
//Follow the directions specified in the comments
//Brian Coe

public class Skeleton1 {
	public static void main(String[] args) {
		String input = "Happy Holidays!";       // this is the input string

        // call the method reverseTheString, it requires the input parameter, and will return the reversed, uppercase string
        reverseTheString(input);

        System.out.println("The original string is " + input);

        // write the output statement below that displays the reversed, uppercase input string
        System.out.print("The backwards string is " + reverseTheString(input));

        // write the method reverseTheString below
    }
    
    static String reverseTheString(String input) {
        String upper = input.toUpperCase();

        String reverse = "";
        
        for(int i = upper.length() - 1; i >= 0; i--)
        {
            reverse = reverse + upper.charAt(i);
        }
        
        return reverse;
    }

}