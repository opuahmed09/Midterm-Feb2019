package math.problems;

import org.testng.Assert;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Factorial factorial1=new Factorial();
        long value=5;
        long number =factorial1.fctorial(value);
        System.out.println(number);
        Assert.assertEquals(number,120);




    }
    public long fctorial(long y){
        long number =1;
        for (long a=1; a<=y;a++){
            number=number*a;
        }
        return number;
    }
}
