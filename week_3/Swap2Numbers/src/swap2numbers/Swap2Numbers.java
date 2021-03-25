/**
 * Project Name: How to Swap 2 Integer Numbers
 * Programmer: Student - Christian Alvarez
 * Date: 02-04-2021
 */
package swap2numbers;
/*Scanner*/
// import Scanner
import java.util.Scanner;

public class Swap2Numbers {

    /*Main Class*/
    public static void main(String[] args) {
        // Main.1 :: Declare Var
        int tempNumber;
        int firstNumber, secondNumber;
        String tempName;
        String firstName, secondName;

        /*Scanner*/
        // Main.2 :: Create Scanner input
        Scanner input = new Scanner(System.in);

        /*prompts*/
        // Main.3 :: Call Footer
        printHeader();

        // Main.4 :: prompt user for first Name
        System.out.print("Enter the First Number: ");

        // Main.5 :: Read & Store in firstNumber
        firstNumber = input.nextInt();

        // Main.6 :: Prompt user for Second Number
        System.out.print("Enter the Second Number: ");

        /*Calculations*/
        // Main.7 :: Read & store in secondNumber
        secondNumber = input.nextInt();

        // Main.8 :: Swap firstNumber wuth tempNumber
        tempNumber = firstNumber;

        // Main.9 :: Swap secondNumber with firstNumber
        firstNumber = secondNumber;

        // Main.10 :: Swap tempNumber with secondNumber
        secondNumber = tempNumber;

        /*prompts*/
        // Main.11 ::  Print the title & the Swapped Numbers
        System.out.println("\n**** After Swapping the 2 Numbers ****\n");
        System.out.println("Value of the First number = " + firstNumber);
        System.out.println("Value of Second number = " + secondNumber);
        System.out.print("\n"); // Blank Line
        
        // Main.12 :: prompt user for first Name
        System.out.print("Enter the First name: ");

        // Main.13 :: Read & Store in firstNumber
        firstName = input.nextLine();
        input.nextLine(); // Blank Line
        
        // Main.14 :: Prompt user for Second Number
        System.out.print("Enter the Second name: ");
        
        /*Calculations*/
        // Main.15 :: Read & store in secondNumber
        secondName = input.nextLine();

        // Main.16 :: Swap firstName wuth tempName
        tempName = firstName;

        // Main.17 :: Swap secondName withfirstName
        firstName = secondName;

        // Main.18 :: Swap tempName with secondName
        secondName = tempName;

        /*prompts*/
        // Main.19 :: Print the title & the Swapped Numbers
        System.out.println("\n**** After Swapping the First Name & Last Name ****\n");
        System.out.println("Value of the First name = " + firstName);
        System.out.println("Value of Second name = " + secondName);

        // Main.20 :: 
        printFooter();
    }

    /*printHeader*/
    // 2 :: Define printHeader()
    public static void printHeader() {
        // 2.2 :: Print Header
        System.out.println("\n*************************************");
        System.out.println("\n******Swapping 2 Integer Numbers*****");
        System.out.println("\n*************************************");
    }

    /*printFooter*/
    // 3 :: Define printFooter()
    public static void printFooter() {
        // 3.2 :: print Footer
        System.out.println("\n*************************************");
        System.out.println("*****End of Job: Christian Alvarez*****");
        System.out.println("\n*************************************");
     }
}
