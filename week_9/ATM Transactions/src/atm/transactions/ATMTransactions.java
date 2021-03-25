/**
 * Project Name: Simple ATM Machine Transaction Java Project to Display the ATM Transaction
 * Programmer: Student - Christian Alvarez
 * Date: 03-24-2021
 */
package atm.transactions;
/*imports*/
// i :: import array & scanner
import java.util.Arrays; // i.2 :: import Arrays
import java.util.Scanner; // i.3 :: import Scanner

public class ATMTransactions {
    /*Variables*/
    // v :: Declare global Var
    public static Double balance = 5000.0;
    public static Double withdraw, depost;
    public static int choice = 0;
    // v.2 :: Declare user & password global var(s)
    public final static String USERNAME = "Mary100";
    public final static String PASSWORD = "ATM";
    public static String userName = "";
    public static String passWord = "";

    /*Classes*/
    // c :: Define Classes(c)
    // c.2 :: Define Main Class
    public static void main(String[] args) {
        /*Main*/
        // Main :: Call Classes
        // Main.2 :: Call printHeadings()
        printHeadings();

        // Main.3 :: Call checkLogIn()
        checkLogIn();

        // Main.4 :: Call printATMMainMenu()
        printATMMainMenu();

        // Main.5 :: Call checkUserChoice()
        checkUserChoice();
        
    }
    
}
