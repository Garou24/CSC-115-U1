//Brian Coe
//05/12/2020
//Assessment 3 Spring 2020 - Part 2 
//Question 2
//

public class LoopTry {
    public static void main(String[] args) {
        //Setting our beginning int variable to 12
        int begin_num = 12;
        //Setting our ending int variable to 2
        int end_num = 2;
        //Setting an increment of 2
        int increment = 2;

        //This loop will check if the beginning int variable is greater than or equal to our ending variable of 2.
        //If it is, the loop will display the variable and subtract the increment of 2 and check again. Once we reach
        //the ending variable of 2 the program will end.
        for (int output = begin_num; output >= end_num; output = output - increment) {
            System.out.println(output);
        }

    }
}