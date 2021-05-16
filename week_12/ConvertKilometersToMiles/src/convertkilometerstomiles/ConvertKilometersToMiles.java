/**
 * Project Name: ConvertKilometersToMiles
 * Programmer: Student - Christian Alvarez
 * Date: 04-22-2021
 */

package convertkilometerstomiles;
// i :: import JOptionSiwg class
import javax.swing.*;

public class ConvertKilometersToMiles {
    // 1 :: Declare final global variables
    private static final double MILES_PER_KILOMETER = 0.621;
    
    // 1 :: declare glabol variable 
    private static String strKilometers;
    private static double kilometers, miles;
    private static boolean invalidInput = true;

    public static void main(String[] args) {
        // 1 :: Run while is invalidInput is true
        while (invalidInput == true) {
            try {
                strKilometers = JOptionPane.showInputDialog(null, "Enter Kilometers to be converted into Miles.");
                if (strKilometers == null || strKilometers.equals(" ")) {
                    break;
                }
                kilometers = Double.parseDouble (strKilometers);

                miles = kilometers * MILES_PER_KILOMETER;

                JOptionPane.showMessageDialog (null, kilometers + " Kilometers is " + " equal to " + miles + " Miles.");
                invalidInput = false;
            }
            catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog (null, "***** Invalid Input. Input must be a Number.*****");
            }
            finally {
                System.out.println ("************ End of Project ***********");
                System.out.println ("****** Programmer: Christian Alvarez ******");
            }
        }
    }
    
}
