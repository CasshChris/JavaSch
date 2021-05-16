/**
 * Project Name: MilesPerGallonTryCatch
 * Programmer: Student - Christian Alvarez
 * Date: 04-22-2021
 */

package milespergallontrycatch;
// i :: import Scanner
import java.util.Scanner;
import java.util.NoSuchElementException; // import NoSuchElementException to catch string L. 39

public class MilesPerGallonTryCatch {

    public static void main(String[] args) {
        // 1 :: Create Scanner object
        Scanner input = new Scanner(System.in);
    
        // 2 :: Print header
        System.out.println("**** Calculate Miles Per Gallon Project *** \n\n");

        // 3 :: Declare variables
        int milesDriven;
        int gallonsOfGasUsed;
        int milesPerGallon = 0;
        
        try {
            // 4 :: Prompt user for amount of miles driven
            System.out.print("Please, Enter Miles Driven: ");
            milesDriven = input.nextInt();

            // 5 :: Prompt user for amount of gas used
            System.out.print("Please, Enter Gallons of Gas Used: "); 
            gallonsOfGasUsed = input.nextInt();

            // 6 :: Calculate miles per gallon
            milesPerGallon = milesDriven / gallonsOfGasUsed;

        }
        catch (ArithmeticException ex) {
            System.out.println("Attempted to Divide by Zero");
        }
        catch (NoSuchElementException e) {
            System.out.println("Input String not in correct format");
        }
        finally {
            // 7 :: Output mailes per gallon
            System.out.printf("%nThe Car gets %d Miles per Gallon", milesPerGallon);
        }

        // 8 :: Print Footer
        System.out.println("\n\n********** End of Program. ***********");
        System.out.println("******** Programmer: Christian Alvarez ********* \n");

    }
    
}
