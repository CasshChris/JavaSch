/*
 * Project Name: CIS 144 Mid-Term Exam Console App - ChristianAlvarez
 * Programmer: Student - Christian Alvarez
 * Date: 
 */

package cis144midtermexamconsoleapp.christianalvarez;

/*imports*/
// import Scanner
import java.util.Scanner;

public class CIS144MidTermExamConsoleAppChristianAlvarez {

    public static void main(String[] args) {
        /*Variables*/
        // 0 :: Declare Variables
        String firstName, lastName;
        String fullName;
        int lenFullName;
        int firstNumber, secondNumber;
        int sum;
        int subtraction;
        int multiplication;
        int division;
        int answer;
        String operator;

        /*Scanner*/
        // Create Scanner
        Scanner input = new Scanner(System.in);
        /*prompts*/
        // 1 :: Prompt user for First Name & last Name
        System.out.print("Enter your first name: "); // 1.2 :: prompt for first name
        firstName = input.nextLine(); // 1.3 :: read & store in firstName
        System.out.print(""); // 1.4 :: blank line

        System.out.print("Enter your last name: "); // 1.5 :: prompt for last name
        lastName = input.nextLine(); // 1.3 :: read & store in lastName
        input.nextLine(); // 1.4 :: blank line
        

        // 2 :: Prompt user for first number & last number
        System.out.print("Enter the first number (Between 0 & 10): "); // 2.2 :: prompt for first number
        firstNumber = input.nextInt(); // 2.3 :: read & store in firstNumber
        input.nextLine(); // 2.4 :: blank line

        // 3 :: Prompt user for Math Operator
        System.out.print("Enter the math operator (+, -, *, /) or (A, S. M, D): "); // 3.2 :: prompt for Math Operator
        operator = input.nextLine(); // 3.3 :: read & store in operater
        input.nextLine(); // 3.4 :: blank line

        System.out.print("Enter the second number (Between 0 & 10): "); // 3.5 :: prompt for second number
        secondNumber = input.nextInt(); // 3.6 :: read & store in secondNumber
        input.nextLine(); // 3.7 :: blank line

        /*Calculations && if statemnts*/ 
        // 4 :: combine firstName & lastName into fullName
        fullName = firstName+ " " + lastName;

        if (null != operator) // 5 :: if Statements
        switch (operator) {
            case "+":
            case "A":
                sum = firstNumber + secondNumber;
                System.out.print("Enter your answer: ");
                answer = input.nextInt();
                input.nextLine();
                if (answer == sum){
                    System.out.printf("Correct. Your answer of " + answer + " is correct.");
                    
                }
                else {
                    System.out.printf("Incorrect. Your answer of " + answer + " is incorrect");
                    
                }   break;
            case "-":
            case "S":
                subtraction = firstNumber - secondNumber;
                System.out.print("Enter your answer: ");
                answer = input.nextInt();
                input.nextLine();
                if (answer == subtraction){
                    System.out.printf("Correct. Your answer of " + answer + " is correct.");
                    
                }
                else {
                    System.out.printf("Incorrect. Your answer of " + answer + " is incorrect");
                    
                }   break;
            case "*":
            case "M":
                multiplication = firstNumber * secondNumber;
                System.out.print("Enter your answer: ");
                answer = input.nextInt();
                input.nextLine();
                if (answer == multiplication){
                    System.out.printf("Correct. Your answer of " + answer + " is correct.");
                    
                }
                else {
                    System.out.printf("Incorrect. Your answer of " + answer + " is incorrect");
                    
                }   break;
            case "/":
            case "D":
                division = firstNumber / secondNumber;
                System.out.print("Enter your answer: ");
                answer = input.nextInt();
                input.nextLine();
                if (answer == division){
                    System.out.printf("Correct. Your answer of " + answer + " is correct.");
                    
                }
                else {
                    System.out.printf("Incorrect. Your answer of " + answer + " is incorrect");
                    
                }   break;
            default:
                break;
        }

        // 6 :: find length of fullName
        lenFullName = fullName.length();
        System.out.printf("%nYour Full Name is: " + fullName + "%n");
        System.out.printf("Your Full Name '" + fullName + "' contians " + lenFullName + " characters. %n");
        System.out.print("******************************************");
        System.out.print("******Programmer: Christian Alvarez*******");
        System.out.print("*********End of Programmer****************");
        System.out.print("******************************************");

    }
    
}
