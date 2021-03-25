/*
Project: Chapter 2 Project Exercises
date: Friday 01-29-2021
Programmer: Student - Christian Alvarez
*/
package chapter02exercieses;

public class Chapter02Exercieses {

    public static void main(String[] args) {
        /*
        // 1 :: Declare variables
        int number1 = 11;
        int number2 = 3;
        int quoteint, remainder;

        // 2 :: Use % operator to find reaminder, also division
        quoteint = number1 / number2;
        remainder = number1 % number2;

        // 3 :: Print result
        System.out.println("Value of Quoteint = " + quoteint);
        System.out.println("Value of remainder = " + remainder);
        */

        // Use casting
        // 1 :: Declare 2 variables
        int test1 = 100;
        int test2 = 97;
        double average;

        // 2 :: Calculate average
        average = (double) (test1 + test2)/ 2;

        // 3 :: Print result
        System.out.printf("The Average of Test %d & %d is = %5.2f %n", test1, test2, average);

        // 4 ::  declare gross pay
        double grossPay = 1234.56789;

        // 5 :: Use printf to print gross pay with $ a , and 2 decimal places
        System.out.printf("The gross pay is = $%,.2f %n", grossPay);

        // 6 :: Using consistant names
        // 7 :: Define federal tax @ 0.10
        double federalTaxCalculation;
        final double federalTax = 0.10;

        federalTaxCalculation = grossPay * federalTax;
    }
    
}
