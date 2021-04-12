/**
 * Project Name: Calculate Final Grade
 * Programmer: Christian Alvarez -Student
 * Date: 03-04-2021
 */
package calculatefinalgrade;
// i :: import Scanner
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class CalculateFinalGrade {
    /*Global*/
    // 1 :: Create global "input" object
    static Scanner input = new Scanner(System.in);

    // 2 :: Declare global Var
    public static String fullName;
    public static int test1, test2, average;
    public static String statis;
    public static int totalAverage = 0;
    public static int classAverage = 0;
    public static int studentCounter = 0;
    public static int aCounter = 0;

    public static void main(String[] args) {
        /*Main*/
        // Main :: print heading
        printHeadings();
        
        // Main.2 :: Use for loop 3 times for 3 students
        for (int counter = 1; counter <= 3; counter++) {
            // Main.2.2 :: prompt user for input
            promptUserForInputData();

            // Main.2.3 :: Call findAverageAndStatus() method
            findAverageAndStatus();

            // Main.2.4 :: Increase counters +1 & add total average
            studentCounter++;
            totalAverage += average;
            aCounter++;
        }

        // Main.3 :: Call footers
        printFootings();

    }

    public static void printHeadings() {
        // 1 :: print header
        System.out.println("************************************************");
        System.out.println("***** Calculate Average of 2 Tests Project *****");
        System.out.println("************************************************");
        System.out.println();    // print a Blank Line
    }

    public static void promptUserForInputData() {
        // 1 :: prompt user for full name
        System.out.print("Enter your Full Name: ");
        fullName = input.nextLine();

        // 2 :: prompt user for test 1 & store it
        System.out.print("Please enter test 1( Between 0 - 100): ");
        test1 = input.nextInt();

        // 3 :: 
    }
        
}