/*
 * Project Name: FactorialUsingMethods
 * Programmer: Student - Christian Alvarez
 * Date: 03-11-2021
 */

package factorialusingmethods;
// i :: import Scanner
import java.util.Scanner;

public class FactorialUsingMethods {

    public static void main(String[] args) {
        // 1 :: Declare Variables
        int number = 5;
        int secondNumber = 10;
        int result, resultSecondNumber, resultUserNumber;
        int userNumber;

        // 2 :: Create Scanner object
        Scanner input = new Scanner(System.in);

        // 2 :: Call Header
        printHeaders();

        // 3 :: Calculate & output result
        result = factorial(number);
        System.out.printf("The Factorial of %d is = %d", number, result);
        
        // 4 :: Calculate & output result of second number
        resultSecondNumber = factorial(secondNumber);
        System.out.printf("%nThe Factorial of %d is = %d", secondNumber, resultSecondNumber);

        // prompt user for input & store in user number
        System.out.printf("%nEnter a number between 1-25: ");
        userNumber = input.nextInt();
        
        if(userNumber > 25){
            System.out.printf("Please enter a number between 1 & 25: ");
            userNumber = input.nextInt();

        }
        else {
            // Calculate & store result of user number
            resultUserNumber = factorial(userNumber);
            System.out.printf("%nThe Factorial of %d is = %d", userNumber, resultUserNumber);

        }

        //  :: Call Footer
        printFooters();

    }

    public static int factorial(int n) {
        int answer;

        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            answer = (n * factorial(n - 1) );
            return answer;
        }
    }
    
    public static void printHeaders() {
        System.out.println("***** Find the Factorial of a Number *****");
        System.out.println();
    }
    
    public static void printFooters() {
        System.out.println();
        System.out.println("\n******************* End Of Program *********************");
        System.out.println("****** Programmer: Student - Christian Alvarez **********");
    }
    
}
