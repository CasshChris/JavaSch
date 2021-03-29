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
        
        int c = 0; // declare a int called c to be use with if statement
        /**
         * the idea is, because the variable "c" would increase after ever time 
         * the (c < 4) if statement runs making the try again part of the program
         * run only three time giving the user three chances to login
         * 
         * but when I run the program, it continues to run after three times
         * 
         * I tried to use a for loop that says
         * "for (int c = 0; c < 3; ++c)"
         * 
         * & now I am using an if statement that says
         * "if (c < 3)"
         */
        if (c < 3) { // if (c < 3s) then run 
            if ( !(inStr.equalsIgnoreCase(testStr) && inNum.equalsIgnoreCase(testNum)) ) { // if user entered the wrong username && password run
                System.out.println("Wrong, try again!"); // propt user to try again
                
                System.out.print("Username: "); // prompt user for username
                inStr = input.nextLine();
                
                System.out.print("Password: "); // prompt user for password
                inNum = input.nextLine();
                
                ++c; // add 1 to c, that way every time trys to the (c < 3) if statement will run less times

                if( (inStr.equalsIgnoreCase(testStr) && inNum.equalsIgnoreCase(testNum))) {
                    System.out.println("Welcom!"); // if user eneters the write login
                }
                else if ( !(inStr.equalsIgnoreCase(testStr) && inNum.equalsIgnoreCase(testNum)) ) {
                    System.out.println("Sorry, try again later"); // i didn't know how to put this in
                }

            } // close (!inStr == testStr && !inNum == testNum) if statement
        } // close (c < 3) if statement 
    }
} 
