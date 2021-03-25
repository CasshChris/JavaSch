/*
    Program Name: Calculate Gross Pay
    Purpose of the Project:
    This Interactive Project will prompt the user to enter
    his/her (First Name, Last Name, and Hours Worked and Rate) 
    then it will read the text entered and store it 		  
    in its variables. Then it Calculates the Gross Pay. 
    Project Name: CalculateGrossPay
    Date: 02/03/2021
    Programmer: Student - Christian Alvarez
*/

package calculategrosspay;
/* import Java util */ 
import java.util.*;


public class CalculateGrossPay {

    public static void main(String[] args) {
        // 1 :: Declare the Local Variables to be used in the project        
        String firstName, lastName;
        Double ficaPercentage;
        Double ficaDeduction;
        int hours = 0;
        Double rate = 0.0;
        Double grossPay = 0.0;

        // 2 :: Instantiate an object called ‘input’ from the Scanner class
        Scanner input = new Scanner(System.in);
        
        // 3 :: Prompt the User to Enter his/her First Name
        System.out.print("Enter your First Name: ");
        
        // 4 :: Read First Name from keyboard and store it in a variable
        firstName = input.nextLine();
        
        // 5 :: Print out First Name to the output
        System.out.println("Your First Name is: " + firstName);

        // 6 :: Prompt the User to Enter his/her Last Name
        System.out.print("Enter your Last Name: ");
        
        // 7 :: Read his/her Last Name from keyboard and store it in a variable        
        lastName = input.nextLine();
        
        // 8 :: Print out the Last Name to the output        
        System.out.println("Your Last Name is: " + lastName);

        // 9 :: Prompt the User to Enter Hours Worked
        System.out.print("Enter Number of Hours Worked:  ");

        // 10 :: Read Hours Worked from keyboard and Store it in a variable        
        hours = input.nextInt();

        // 11 :: Print out Hours Worked to the output
        System.out.println("Hours Worked: " + hours);

        // 12 :: Prompt the User to Enter Hourly Rate
        System.out.print("Enter Hourly Rate: ");
        
        // 13 :: Read Hourly Rate and Store it in a variable
        rate = input.nextDouble();

        // 14 :: Print out the Hourly Rate to the output
        System.out.println("Hourly Rate: " + rate);

        // 15 :: Calculate Gross Pay by multiplying hours by rate
        grossPay = hours * rate;

        /* Modifications */

        // 16 :: Prompt user for the Fica Percentage
        System.out.print("Enter FICA Deduction Percentage (like 0.10): ");

        // 17 :: Read Fica Percentage and Store it in a variable
        ficaPercentage = input.nextDouble();

        // 18 :: Print out the grossPay to the output screen
        System.out.printf("Gross Pay is = $%,.2f %n" , grossPay);

        // 19 :: Calculate fica Deduction by multiplying grossPay by ficaPercentage
        ficaDeduction = ficaPercentage * grossPay;

        // 20 :: Print out the ficaDeduction to the output screen
        System.out.printf("Fica Deduction is = $%,.2f %n" , ficaDeduction);

    }
    
}
