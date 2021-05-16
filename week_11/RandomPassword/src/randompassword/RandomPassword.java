/* 
 * Project Name: RandomPassword
 * Progranmmer: Student - Christian Alvarez
 * Date: 04-15-2021
 */

package randompassword;
import java.security.SecureRandom; // i :: import SecureRandom

public class RandomPassword {
// 1 :: Create SecureRandom object
private static SecureRandom random = new SecureRandom();

// 2 :: Declare final global variables
private static final String ALPHA_CAPS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
private static final String NUMERIC = "0123456789";
private static final String SPECIAL_CHARS = "!#$%&*_+-/";

// 3 :: Declare global variables
private static String passwordGenerated;
private static int passwordLength = 10;
private static String stringPassed = ALPHA_CAPS;
// private static String stringPassed = ALPHA + ALPHA_CAPS + NUMERIC;

    // 1 :: Define main()
    public static void main(String[] args) {
        // 1 :: Call printHeaders()
        printHeaders();

        // 2 :: Call generateThePassword()
        generateThePassword(passwordLength, stringPassed);

        // 3 :: Call printFooters()
        printFooters();

    }

    // 2 :: Define printHeaders()
    public static void printHeaders() {
        System.out.println("*******************************************");
        System.out.println("**** The Password Generated is Below ******");
        System.out.println("*******************************************\n");

    }

    // 3 :: Define generateThePassword()
    public static void generateThePassword(int passwordLength, String passWord) {
        // 1 :: Declare password 
        String password = "";

        // 2 :: Use for loop to generater
        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(passWord.length());
            password += passWord.charAt(index);
        }

        // 3 :: Output generated password
        System.out.println("The Generated Password is: " + password);
        System.out.println();
        
    }

    // 4 :: Define printFooters()
    public static void printFooters() {
        // 1 :: Print 
        System.out.println("\n***********************************************");
        System.out.println("**************** End of Project ***************");
        System.out.println("*** Programmer: Student - Christian Alvarez ***");
        System.out.println("***********************************************\n");
    }
    
}
