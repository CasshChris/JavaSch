/* Purpose: generate number from range give by user
 * Project Name: GenerateRandomNumberFromRange
 * Programmer: Student - Christian Alvarez
 * Date: 03-05-2021
 */

package generaterandomnumberfromrange;
// i :: import Scanner
import java.util.Scanner;

public class GenerateRandomNumberFromRange {
    // g :: declare global variables
    public static int startNumber;
    public static int endNumber;

    // g.2 :: Create Scanner input object
    public static Scanner input = new Scanner(System.in);
    
    // Define main function
    public static void main(String[] args) {
        // 1 :: Declare variables
        String promptAnswer = "y";
        
        // 1 :: Call printHeading()
        printHeading();
        
        // 5 :: Use while loop to continue if promptAnswer is yes
        while ("y".equals(promptAnswer)) {
        
        // 2 :: Call promptUserForInput()
        promptUserForInput();
        
        // 3 :: Use for loop to generate 7 numbers
        for (int i = 0; i <= 7; i++) {
            // 4 :: Call generateRandomNumbers() & output the generated number
            generateRandomNumbers();
        }
        
        // 4 :: prompt user if they what to continue with program & store answer in promptAnswer
        System.out.printf("%nDo You Want to Continue(y/n)? : ");
        promptAnswer = input.nextLine();
        
            // 6 :: Call promptUserForInput()
            promptUserForInput();
            
            // 7 :: Call generateRandomNumbers()
            generateRandomNumbers();
            
        }
        
        // 8 :: Call printFooters()
        printFooters();
        
    }
    
    public static void printHeading() {
        // 1 :: Print Header
        System.out.println("****************************************************");
        System.out.println("************ The Random Number Generator ***********");
        System.out.println("****************************************************\n");
        
    }
    
    public static void promptUserForInput() {
        // 1 :: Prompt user for first number
        System.out.print("Enter the Starting Number of the range: ");
        startNumber = input.nextInt();
        
        // 2 :: Prompt user for second number
        System.out.print("Enter the Ending Number of the range: ");
        endNumber = input.nextInt();
        input.nextLine(); // Blank

    }
    
    public static void generateRandomNumbers() {
        // 1 :: Declare variables
        int randomNumberGenerated;
        
        // 2 :: Use Math.random() to generate random number
        randomNumberGenerated = startNumber + (int)(Math.random() * ((endNumber - startNumber) + 1));
        
        // 3 :: Us
        System.out.printf("The Random Number Generated is: " + randomNumberGenerated + "%n");
    }
    
    public static void printFooters() {
        // 1 :: Print footers
        System.out.println("\n\n***************************************************************************** ");
        System.out.println("*************************** End Of Program ********************************** ");
        System.out.println("****************** Programmer: Student - Christian Alvarez ****************** ");
        System.out.println("***************************************************************************** ");
        
    }
    
}
