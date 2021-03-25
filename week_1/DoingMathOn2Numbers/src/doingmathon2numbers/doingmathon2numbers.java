/* Week 1 -  Doing Math on 2 Numbers Project Program will calcate the sum, difference, product of 2 numbers Date: 01-22-2021 Programmer: Student - Christian Alvarez
*/

package doingmathon2numbers;
// 1) Import Scanner class
import java.util.Scanner;

public class DoingMathOn2Numbers {
    
    public static void main(String[] args) {
            // 1) Declare local varibales to be use in Project
            String firstName, lastName, fullName;
            int number1, number2;
            int sum;
            int difference;
            int product;
            int quotient;
            
            // 2) Create object instance called "input" from from class Scanner
            Scanner input = new Scanner (System.in);
            
            // 3) Prompt the user to enter first name
            System.out.print("Enter your First Name: ");
            
            // 4) Read first name & store it in "firstName" Varible firstName
            firstName = input.nextLine();
            
            // 5) Prompt the user to enter last name
            System.out.print("Enter your Last Name: ");
            
            // 6) Read first name & store it in "lastName" Varible firstName
            lastName = input.nextLine();
            
            // 7) Prompt user to enter number1
            System.out.print("Enter the first number: ");
            
            // 8) read number & store in "number1" Varible
            number1 = input.nextInt();
            
            // 9) Prompt user to enter number2
            System.out.print("Enter the second number: ");
            
            // 10) read number & store in "number2" Varible
            number2 = input.nextInt();
            
            // 11.1) Calculate sum of 2 numbers
            sum = number1 + number2;
            
            // 11.2) find difference
            difference = number1 - number2;
            
            // 11.3) find product
            product = number1 * number2;
            
            // 11.4) find quotient
            quotient = number1 + number2;
                        
            // 12) Combine first & last name
            fullName = firstName + " " + lastName;
            
            // 13) Print firstName (echo)
            System.out.println("Your first name is: " + firstName);
            
            // 14) Use printf to print the last & a blank line
            System.out.printf("Your last name is: %s %n", lastName);
            
            // 15) Use printf to print the full name
            System.out.printf("Your full name is: %s %n", fullName);
            
            // 16) Print sum of number1 & number2 
            System.out.printf("The sum of %d and %d is equal to = %d %n",
                                    number1, number2, sum);
            
            // 17) Print difference of number1 & number2
            System.out.printf("The difference of %d and %d is equal to = %d %n",
                                    number1, number2, difference);
            
            // 18) Print product of number1 & number2
            System.out.printf("The products of %d and %d is equal to = %d %n",
                                    number1, number2, product);
            
            // 19) Print quotient of number1 & number2
            System.out.printf("The quotient of %d and %d is equal to = %d %n",
                                    number1, number2, quotient);
    }
    
}
