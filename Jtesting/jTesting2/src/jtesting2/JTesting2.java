/**
 * this is what the program I was using to test the atm three trys 
 * 
 */
package jtesting2;
// import scanner
import java.util.Scanner;

public class JTesting2 {

    // define Main()
    public static void main(String[] args) {
        // declare variables
        String testStr = "tester"; // set the username as tester
        String inStr = ""; // for username input \
        String testNum = "tester400"; // set password as tester400
        String inNum = ""; // for password input 
        
        System.out.println("Login"); // prompt haeder

        Scanner input = new Scanner(System.in); // create scanner input object

        System.out.print("Username: "); // prompt user for username & store it in "inStr"
        inStr = input.nextLine();
        
        System.out.print("Password: "); // prompt user for password & store it in "inNum"
        inNum = input.nextLine();
        
        int count = 0;

        while( !(inStr.equalsIgnoreCase(testStr) && inNum.equalsIgnoreCase(testNum)) ) { // if user entered the wrong username && password run
            System.out.println("Wrong, try again!"); // propt user to try again
            
            System.out.print("Username: "); // prompt user for username
            inStr = input.nextLine();
            
            System.out.print("Password: "); // prompt user for password
            inNum = input.nextLine();
            
            count += 1;
            if( (inStr.equalsIgnoreCase(testStr) && inNum.equalsIgnoreCase(testNum))) {
                System.out.println("Welcom!"); // if user eneters the write login
            }
            else if (count > 2 && !(inStr.equalsIgnoreCase(testStr) && inNum.equalsIgnoreCase(testNum))) {
                System.out.println("Sorry, try again later"); // i didn't know how to put this in
            }
        } 
    }
} 
