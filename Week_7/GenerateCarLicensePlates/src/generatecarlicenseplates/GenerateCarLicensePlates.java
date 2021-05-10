/* This Project will generate 10 license plates
 * Program Name: GenerateCarLicensePlates
 * Programmer: Student - Christian Alvarez
 * Date: 03-12-2021
 */
package generatecarlicenseplates;
// i :: import SecureRandom
import java.security.SecureRandom;

public class GenerateCarLicensePlates {
    /*  ------Global Variables-----     */
    // g.1 :: create global random object
    private static SecureRandom random = new SecureRandom();

    // g.2 :: Declare global final variables
    private static final String ALPHA_CAPS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String Beta_CAPS="BCDFGHJKLMNPQRSTVWXYZ";
    private static final String NUMBERS = "0123456789";

    // g.3 :: Declare global variables
    private static int licensePlateLength = 8; 
    private static int numericIndex;
    private static int alphaCapsIndex;
    private static int betaCapsIndex;
    private static String alphaLicensePlate = "";
    private static String alphaLicensePlate2 = "";
    private static String alphaLicensePlate3 = "";
    private static String betaLicensePlate2 = "";
    private static String betaLicensePlate3 = "";
    private static String numbersLicensePlate="";
    private static String carLicensePlate = "";
    private static String numbersLicensePlate2 = "";
    private static String numbersLicensePlate3 = "";
    private static String numbersLicensePlate4 = "";
    private static String numbersLicensePlate5 = "";

    /*  ------*/
    // 1 :: Define main Fuction
    public static void main(String[] args) {
        
        // 1 :: use for loop generate 10 plates
        for (int plates = 1; plates <= 10; plates++) {

            // 2 :: Call generateTheLicensePlates() & output
            generateTheLicensePlates(licensePlateLength, carLicensePlate);

            // 3 :: Initialize with empty variables 
            alphaLicensePlate = "";
            carLicensePlate = "";
            numbersLicensePlate2 = "";
            numbersLicensePlate4 = "";
        }

        /*  -------Modifictions---------    */
        System.out.printf("%n******* Modifications *********%n");
        
        // 4 :: Call generateIlliniosLicensePlates() & output Illinios style license plate
        System.out.println();
        generateIlliniosLicensePlates(licensePlateLength, carLicensePlate);
        /*  ------For debugging purposes-----
        System.out.printf("%n******** Testing Branch ********");    */
        
        // 3 :: Call generateArizonaLicensePlates & output Arizona style license plate
        generateArizonaLicensePlates(licensePlateLength, carLicensePlate);
        
        // 4 :: Call generateVowelLessLicensePlates() & output Vowel-less license plate
        generateVowelLessLicensePlates(licensePlateLength, carLicensePlate);
        System.out.println(); // blank line

        
    }

    // 2 :: Define generateTheLicensePlates()
    public static void generateTheLicensePlates(int licensePlateLength, String carLicensePlate) {
        // 1 :: Add a "-" variable
        String hyphen = "-";
        
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
    
    // 3 :: Defie generateIlliniosLicensePlates()
    public static void generateIlliniosLicensePlates(int licensePlateLength, String carLicensePlate) {
        // 1 :: Use for loop to generate first two charater
        for (int i = 0; i < 2; i++) {
            alphaCapsIndex = random.nextInt(ALPHA_CAPS.length());
            alphaLicensePlate += ALPHA_CAPS.charAt(alphaCapsIndex);
        }
        
        // 2 :: Use for loop to generate next 5 numbers
        for (int i = 0; i < 5; i++) {
            numericIndex = random.nextInt(NUMBERS.length());
            numbersLicensePlate5 += NUMBERS.charAt(numericIndex );
        }
        
        // 4 :: Combine letters & numbers
        carLicensePlate = alphaLicensePlate + " " + numbersLicensePlate5;
        
        // 5 :: Output carLicensePlate
        System.out.println("Generated Illinios Style Car License Plate is: " + carLicensePlate);
    }
    
    // 4 :: Define generateArizonaLicensePlates()
    public static void generateArizonaLicensePlates(int licensePlateLength, String carLicensePlate) {
        // 2 :: Use for loop to generate first charater
        for (int i = 0; i < 3; i++) {
            alphaCapsIndex = random.nextInt(ALPHA_CAPS.length());
            alphaLicensePlate3 += ALPHA_CAPS.charAt(alphaCapsIndex);
        }
        
        // 4 :: Use for loop to generate next 4 numbers
        for (int i = 0; i < 4; i++) {
            numericIndex = random.nextInt(NUMBERS.length());
            numbersLicensePlate4 += NUMBERS.charAt(numericIndex );
        }
        
        // 5 :: Combine letters & numbers
        carLicensePlate = alphaLicensePlate3 + " " + numbersLicensePlate4;
        
        // 6 :: Output carLicensePlate
        System.out.println("Generated Arizona Car License Plate is: " + carLicensePlate);
    }
    
    // 5 :: Define generateVowelLessLicensePlates()
    public static void generateVowelLessLicensePlates(int licensePlateLength, String carLicensePlate) {
        // 2 :: Use for loop to generate first charater
        for (int i = 0; i < 2; i++) {
            betaCapsIndex = random.nextInt(Beta_CAPS.length());
            betaLicensePlate3 += Beta_CAPS.charAt(betaCapsIndex);
        }
        
        // 4 :: Use for loop to generate next 4 numbers
        for (int i = 0; i < 3; i++) {
            numericIndex = random.nextInt(NUMBERS.length());
            numbersLicensePlate3 += NUMBERS.charAt(numericIndex );
        }
        
        for (int i = 0; i < 2; i++) {
            betaCapsIndex = random.nextInt(Beta_CAPS.length());
            betaLicensePlate2 += Beta_CAPS.charAt(betaCapsIndex);
        }
        
        // 5 :: Combine letters & numbers
        carLicensePlate = betaLicensePlate3 + " " + numbersLicensePlate3 + betaLicensePlate2;
        
        // 6 :: Output carLicensePlate
        System.out.println("Generated Vowel-Less Car License Plate is: " + carLicensePlate);
    }
    
}