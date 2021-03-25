/*
* This program calculates the average of 2 Tests and*  prints out if the student passed or failed.Also Find the class average
* Programmer: Student - Christian Alvarez
* Date: Friday, November 03, 2017
* Project Name: CalculateFinalGrade
*/
package calculatefinalgrade;
/*Scanner*/
import java.util.Scanner;

public class CalculateFinalGrade {

    private static void printFootings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    // 1) Declare only once a static global object ‘input’from class Scanner static 
    Scanner input = new Scanner (System.in);
        
    // 2) Declare the Global variables to be used in this project
    public static String fullName;
    public static int test1, test2, average;
    public static String status;
    public static int totalAverage = 0;
    public static int classAverage = 0;
    public static int studentsCounter = 0;
    public static int aCounter = 0;
        
    public static void main(String[] args) {
        // 1) Call the printHeadings () method
        printHeadings();
        // 2) Use for statement to loop 3 times to enter 3 students
        for (int counter = 1; counter <= 3; counter++) {
            // 3) Call the promptUser For Input Data ( ) method
            promptUserForInputData();
            
            // 4) Call the findAverageAndStatus() method
            findAverageAndStatus();
            int averagestudentsCounter = 0;
            
            // 5) Increment the student counter by 1 and add to total 
            averagestudentsCounter++;
            totalAverage += average;
            aCounter++;
            
            // 6) Call the printFootings() method
            printFootings();
        }
    } // End of main() method
    // 2) Define and code the print Headings method
    public static void printHeadings() {
        System.out.println("****************************************");
        System.out.println("*** Calculate Average of 2 Tests Project *****");
        System.out.println("*****************************************");
        System.out.println();    // print a Blank Line
    }
        // 4) Define and code the prompt User For Inputmethod
    
    public static void promptUserForInputData() {
        // 1) Prompt the user to enter Full Name
        System.out.print("Enter your Full Name: ");
        static fullName = input.nextLine();
        
        // 2) Prompt the user to enter Test1 between 0 and 100
        System.out.print("Please Enter Test 1 (between 0 and 100): ");
        
        // 3) Get or Read test 1
        test1 = input.nextInt();
        
        // 4) Call checkUserInputData()to check test 1
        checkUserInputData();
        
        // 5) Prompt the user to enter Test 2 between 0 and 100
        System.out.print("Please Enter Test 2 (between 0 and 100): ");
        
        // 6) Get or Read test 2
        test2 = input.nextInt();
        
        // 7) Call checkUserInputData()to check test 2
        checkUserInputData();
        
        // 8) Read or Get the extra new line at the endand discard it
        String extraNewLine = input.nextLine();
    }
    // 4.2) Define and code the check User Input Data()method
    public static void checkUserInputData() {
        //1) Use while statement to check for Valid Test1
        while (test1 < 0 || test1 > 100) {
            // 2)Prompt the user to enter Test 1 between 0 and 100
            System.out.print("**Invalid Test 1**.Please Enter Test 1 (between 0 and 100): ");
        
            // 3) Get or Read Test 1
            test1 = input.nextInt();
        }
        //1) Use while statement to check for Valid Test2
        while (test2 < 0 || test2 > 100) {
        // 2)Prompt the user to enter Test 2 between 0 and 100
        System.out.print("**Invalid Test 2**.Please Enter Test 2 (between 0 and 100): ");
        // 3) Get or Read Test 2
        test2 = input.nextInt();
        }
    }
    public static void findAverageAndStatus() {
        // 6) Find the Average of the 2 Tests
        average = (test1 + test2 ) / 2;
        // 7) Find out if the student is Passing or Failing
            if (average >= 70) {
                status = "Passing";}
            else {
                status = "Failing";
            }
            }
            // 8) Print out the data about the student
            System.out.println();   // Print a Blank Line
            System.out.printf("The Student %s Test 1 = %d, Test 2 = %d %n", fullName, test1, test2);
            System.out.printf("Student Average = %d and the student is %s %n", average, status);
        }
    }
}
