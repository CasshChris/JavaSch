/**
 * Project Name: Sum Numbers in Array
 * Programmer: Student - Christian Alvarez
 * Date: 03-19-2021
 */
package sumnumbersinarray;
/*Arrays & Scanner*/
// i :: Import Classes
import java.util.Arrays; // i.2 :: import Arrays
import java.util.Scanner; // i.3 :: import Scanner

public class SumNumbersInArray {

    public static void main(String[] args) {
        // 1 :: Declare Var
        int arrayLength;
        int number;
        int sum = 0;
        int average;

        // 2 :: Creat object 'input' from the Scanner class
        Scanner input = new Scanner (System.in);

        // 3 :: prompt user for length of Array
        System.out.print ("Enter the Size or Length of the array: ");
        arrayLength = input.nextInt ();

        // 4 :: Declare var & create 
        int [] numberArray = new int[arrayLength];

        // 5 :: Use for statement to promt user to popluate the array
        for (int i = 0; i < numberArray.length; i++){

            // 5.2 :: prompt the user to enter the number
            System.out.print ("Please, Enter the number for the item: "+ i +": ");
            number = input.nextInt(); // read and store the number

            // 5.3 :: Store number in array
            numberArray[i] = number ;
        }
    
        // 6 Print out the contect of the array
        System.out.println("The array as populated by the user:");

        // 7 :: Use enhanced for statement to print items in arrya
        for (int n : numberArray) {
            // 7.2 :: Print n
            System.out.println(n);
        }
    
        System.out.println(); // Blank Line
        
        // 8 :: sum up the numbers in the array
        for  (int j = 0; j < numberArray.length; ++j){
            sum += numberArray[j]; //3 2 4
        }
        
        // 10 :: Find average of numbers in array
        average = sum / numberArray.length;
        
        // 11 :: Print Sum of Array 
        System.out.println("The Sum of the numbers in the array = " + sum);
        System.out.println("The Average of the number of array = " + average);
        
        // 12 :: Use .sort() to sort numberArray
        Arrays.sort(numberArray);

        // 13 :: Print Min & Max Number in Array
        System.out.println("The Minimum number is: " + numberArray[0]); // 13.2 :: min
        System.out.println("The Maximum number is: " + numberArray[numberArray.length -1]); // 13.3 :: Max
    }

    
}
