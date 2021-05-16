/*
 * Project Name: ConvertReturnChangeBills
 * Programmer: Student - Christian Alvarez
 * Date: 03-05-2021
 */

package convertreturnchangebills;
// i :: import Scanner
import java.util.Scanner;

public class ConvertReturnChangeBills {
    // g :: Declare global variables
    public static int DOLLARS = 100;
    public static int QUARTERS = 25;
    public static int DIMES = 10;
    public static int NICKELS = 5;
    public static int PENNIES = 1;

    // g.2 :: Create global Scanner
    public static Scanner input = new Scanner (System.in);

    // 1 :: Define main function
    public static void main(String[] args) {
        // 1 :: Call printHeaders()
        printHeaders();

        // 2 :: Call calculateChangeReturned()
        calculateChangeReturned();

        // 3 :: Call printFooters()
        printFooters();
        
    }

    // 2 :: Define printHeaders()
    public static void printHeaders() {
        System.out.println("********************************************");
        System.out.println("******* I will make change for you. ********");
        System.out.println("********************************************");
        System.out.println();
    }
    
    // 3 :: Define calculateChangeReturned()
    public static void calculateChangeReturned() {
        // 1 :: Declare variables
        int dollar, quarters, dimes, nickels, pennies;
        double changeReturned;

        // 2 :: Prompt user for enter amount of change & store in changeReturned
        System.out.print("Enter amount of Chage to convert(ex. 1.87): ");
        changeReturned = input.nextDouble();

        // 3 :: Output amount given
        System.out.printf("Amount of change to Given: = %.2f %n", changeReturned);

        // 4 :: Convert Change into pennies
        changeReturned = changeReturned * 100;

        // 5 :: Use if statements to check if the Change given is >= than DIMES Constant 10
        if (changeReturned >= DOLLARS) {
            // 6 :: Cast int to find Dollars
            dollar = (int) changeReturned / 100;
            System.out.println("Dollars = " + dollar);

            // 7 :: Calculate changeReturned & output 
            changeReturned = changeReturned - (dollar * 100);

        }
        // 8 :: Use if statements to check if the Change given is >= than QUARTERS Constant 25
        if (changeReturned >= QUARTERS) {
            // 9 :: Cast int to find Quarters
            quarters = (int)changeReturned / 25;
            System.out.printf("Quarters = %d %n", quarters);

            // 10 :: Calculate changeReturned & output 
            changeReturned = changeReturned - (quarters * 25);
        }
        // 11 :: Use if statemnet to check if the Change given is >= than NICKELS Constant 5
        if (changeReturned >= DIMES) {
            // 12 :: Cast int to find Dimes
            dimes = (int) changeReturned / 10;
            System.out.printf("Dimes = %d %n", dimes);

            // 13 :: Calculate changeReturned & output 
            changeReturned = changeReturned - (dimes * 10);
        }
        // 14 :: Use if statement to check if the Change given is >= than DIMES Constant 10
        if (changeReturned >= NICKELS) {
            // 15 :: Cast int to find Nickels
            nickels = (int)changeReturned / 5;
            System.out.printf("Nickels = %d %n", nickels);

            // 16 :: Calculate changeReturned & output 
            changeReturned = changeReturned - (nickels * 5);
        }
        // 17 :: Use if statement to check if the Change given is >= than NICKELS Constant 5
        if (changeReturned >= PENNIES) {
            // 18 :: Cast int to find Pennies
            pennies = (int)changeReturned / 1;
            System.out.printf("Pennies = %d %n", pennies);

            // 19 :: Calculate changeReturned & output 
            changeReturned = changeReturned - (pennies * 1);
        }
    }
    
    // 4 :: Define printHeaders()
    public static void printFooters() {
        // 1 :: Print Footer
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("****************** End Of Program *****************");
        System.out.println("***** Programmer: Student - Christian Alvarez *****");
        System.out.println("***************************************************");
    }
    
}
