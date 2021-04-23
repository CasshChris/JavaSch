/*
 * Project Name: CalculateSumMethod
 * Programmer: Student - Christian Alvarez
 * Date: 04-23-2021
 */

package calculatesummethod;
// i :: import Scanner
import java.util.Scanner;

public class CalculateSumMethod {
    // 1 :: Create Scanner object
    public static Scanner input = new Scanner(System.in);
    // 
    public static String firstName;
    public static String lastName;
    public static int firstNumber, secondNumber;
    public static int result;
    
    // Define Main Class
    public static void main(String[] args) {
        // 1 :: call printHeadings()
        printHeadings();
        
        // 2 :: call promptUserForInput()
        promptUserForInput();
        
        // 3 :: call calculateSum()
        calculateSum();
        
        // 4 :: call calculateSubtract()
        calculateSubtract();
        
        // 5 :: call printFootings()
        printFootings();
    }

    // Define printHeadings()
    public static void printHeadings() {
        // 1 :: print header
        System.out.println("\n Calculate Sum of 2 Numbers using Methods \n");
    }

    
    // Define promptUserForInput()
    public static void promptUserForInput() {
        // 1 :: prompt user for first name & store in "firstName"
        System.out.print("Enter your First Name: ");
        firstName = input.nextLine();
        
        // 2 :: output user input
        System.out.println("Your First Name is : " + firstName);
        
        // 3 :: prompt user for last name & store in "lastName"
        System.out.print("Enter your Last Name: ");
        lastName = input.nextLine();
        
        // 4 :: output user input
        System.out.println("Your last Name is : " + lastName);
        
        System.out.print("Enter the First Number: ");
        firstNumber = input.nextInt();
        
        //  :: output user input
        System.out.println("Your First Number is : " + firstNumber);
        
        //  :: prompt user for  & store in ""
        System.out.print("Enter the Second Number: ");
        secindNumber = input.nextInt();
        
        //  :: output user input
        System.out.println("Your Second Number is : " + secondNumber);

    }
    
    // Define calculateSum()
    public static void calculateSum() {
        // 1 :: Calculate sum & store in "result"
        result = firstNumber + secondNumber;
        
        // 2 :: output the users full name
        System.out.println("The user Full Name is: " + firstName + " " + lastName);
        
        // 3 :: output the result
        System.out.println("The Sum of the two numbers is: " + result);
        
    }
    
    // Define calculateSubtract()
    public static void calculateSubtract() {
        // 1 :: Calculate subtraction & store in "result"
        result = firstNumber - secondNumber;
        
        // 2 :: output the users full name
        System.out.println("The user Full Name is: " + firstName + " " + lastName);
        
        // 3 :: output the result
        System.out.println("The Subtraction of the two numbers is: " + result);
        
    }
    
    // Define calculateProduct()
    public static void calculateProduct() {
       // 1 :: Calculate product & store in "result"
       result = firstNumber * secondNumber;
        
       // 2 :: output the users full name
       System.out.println("The user Full Name is: " + firstName + " " + lastName);
       
       // 3 :: output the result
       System.out.println("The Subtraction of the two numbers is: " + result);
        
    }
    
    // Define calculatedDivision()
    public static void calculatedDivision() {}
    
    // Define calculateAverage()
    public static void calculateAverage() {}
    
    // Define calculateModulus()
    public static void calculateModulus() {}
    
    // Define printFootings()
    public static void printFootings() {
        System.out.println ("\n This is Footings\n");
    }

    
}
