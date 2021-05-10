/*
 * Project Name: CalculateSumMethod
 * Programmer: Student - Christian Alvarez
 * Date: 03-18-2021
 */

package calculatesummethod;
// i :: import Scanner, Date, & SimpleDateFormata
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalculateSumMethod {
    // 1 :: Create Scanner object
    public static Scanner input = new Scanner(System.in);
    
    // 2 :: Declare glodal var
    public static String firstName;
    public static String lastName;
    public static int firstNumber, secondNumber;
    public static int result;
    
    // 3 :: Define Main Class
    public static void main(String[] args) {
        // 1 :: call printHeadings()
        printHeadings();
        
        // 2 :: call promptUserForInput()
        promptUserForInput();
        
        // 3 :: call calculateSum()
        calculateSum();
        
        // 4 :: call calculateSubtract()
        calculateSubtract();

        // 5 :: call calculateProduct()
        calculateProduct();

        // 6 :: call calculatedDivision()
        calculatedDivision();

        // 7 :: call calculatedDivision()
        calculatedDivision();

        // 8 :: call calculateAverage()
        calculateAverage();
        
        // 9 :: call calculateModulus()
        calculateModulus();
        
        //  :: call printFootings()
        printFootings();
    }

    // 4 :: Define printHeadings()
    public static void printHeadings() {
        // 1 :: create "dateFormat" object
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        // 2 :: create "Date" object
        Date date = new Date();

        // 3 :: create "timeFormat" object
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        
        // 4 :: create "Date" object
        Date time = new Date();

        // 5 :: print header
        System.out.printf("***********************************************************%n");
        System.out.printf("******************** " + dateFormat.format(date) + " ***************************%n");
        System.out.printf("********************* " + timeFormat.format(time) + " ****************************%n");
        System.out.printf("******* Calculate Sum of 2 Numbers using Methods **********%n");
        System.out.printf("***********************************************************%n");
        System.out.printf("***********************************************************%n%n");

    }

    // 5 :: Define promptUserForInput()
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
        secondNumber = input.nextInt();
        
        //  :: output user input
        System.out.println("Your Second Number is : " + secondNumber);

    }
    
    // 6 :: Define calculateSum()
    public static void calculateSum() {
        // 1 :: Calculate sum & store in "result"
        result = firstNumber + secondNumber;
        
        // 2 :: output the users full name
        System.out.println("The user Full Name is: " + firstName + " " + lastName);
        
        // 3 :: output the result
        System.out.println("The Sum of the two numbers is: " + result);
        
    }
    
    // 7 :: Define calculateSubtract()
    public static void calculateSubtract() {
        // 1 :: Calculate subtraction & store in "result"
        result = firstNumber - secondNumber;
        
        // 2 :: output the result
        System.out.println("The Subtraction of the two numbers is: " + result);
        
    }
    
    // 8 :: Define calculateProduct()
    public static void calculateProduct() {
       // 1 :: Calculate product & store in "result"
       result = firstNumber * secondNumber;
        
       // 2 :: output the result
       System.out.println("The Product of the two numbers is: " + result);
        
    }
    
    // 9 :: Define calculatedDivision()
    public static void calculatedDivision() {
        // 1 :: Calculate Division & store in "result"
        result = firstNumber / secondNumber;
         
        // 2 :: output the result
        System.out.println("The Division of the two numbers is: " + result);
        
    }
    
    // 10 :: Define calculateAverage()
    public static void calculateAverage() {
        // 1 :: Calculate Average & store in "result"
        result = (firstNumber + secondNumber) / 2;
        
        // 2 :: output the result
        System.out.println("The Average of the two numbers is: " + result);
        
    }
    
    // 11 :: Define calculateModulus()
    public static void calculateModulus() {
        // 1 :: Calculate & find Modulu & store in "result"
        result = firstNumber % secondNumber;
         
        // 2 :: output the result
        System.out.println("The Modulus of the two numbers is: " + result);

    }
    
    // 12 :: Define printFootings()
    public static void printFootings() {
        System.out.printf("%n***********************************************************%n");
        System.out.printf("***********************************************************%n");
        System.out.printf("****************** End of project *************************%n");
        System.out.printf("******** Programmer: Student - Christian Alvarez **********%n");
        System.out.printf("***********************************************************%n");
        System.out.printf("***********************************************************%n");

    }

}
