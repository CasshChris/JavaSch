/*
 * Program Name: GenerateCarLicensePlates
 * Programmer: Student - Christian Alvarez
 * Date: 03-12-2021
 */
package generatecarlicenseplates;
// i :: import SecureRandom
import java.security.SecureRandom;

public class GenerateCarLicensePlates {
    // g.1 :: create global random object
    private static SecureRandom random = new SecureRandom();

    // g.2 :: Declare global final variables
    private static final String ALPHA_CAPS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";

    // g.3 :: Declare global variables
    private static int licensePlateLength = 8; private static int numericIndex;
    private static int alphaCapsIndex;
    private static String alphaLicensePlate = "";
    private static String numbersLicensePlate="";
    private static String carLicensePlate = "";
    private static String numbersLicensePlate2 = "";
    private static String numbersLicensePlate4 = "";

    // 1 :: Define main
    public static void main(String[] args) {
        // 1 :: use for loop generate 10 plates
        for (int plates = 1; plates <= 10; plates++) {
            // 2 :: Call generateTheLicensePlates() 
            generateTheLicensePlates(licensePlateLength, carLicensePlate);

            // 3 :: Initialize with empty variables 
            alphaLicensePlate = "";
            carLicensePlate = "";
            numbersLicensePlate2 = "";
            numbersLicensePlate4 = "";
        }
    }

    // 2 :: Define generateTheLicensePlates()
    public static void generateTheLicensePlates(int licensePlateLength, String carLicensePlate) {
        // 1 :: Add a "-" variable
        String hyphen = " ";

        // 2 :: generate first charater
        alphaCapsIndex = random.nextInt(ALPHA_CAPS.length());
        alphaLicensePlate += ALPHA_CAPS.charAt(alphaCapsIndex);

        // 3 :: Use for loop to generate 2 numbers
        for (int i = 0; i < 2; i++) {
            numericIndex = random.nextInt(NUMBERS.length());
            numbersLicensePlate2 += NUMBERS.charAt(numericIndex );

        }
        // 4 :: Use for loop to generate next 4 numbers
        for (int i = 0; i < 4; i++) {
            numericIndex = random.nextInt(NUMBERS.length());
            numbersLicensePlate4 += NUMBERS.charAt(numericIndex );
        }

        // 5 :: Combine letters & numbers
        carLicensePlate = alphaLicensePlate + numbersLicensePlate2 + hyphen + numbersLicensePlate4;

        // 6 :: Output carLicensePlate
        System.out.println("The Generated Car License Plate is: " + carLicensePlate);
    }
    
}