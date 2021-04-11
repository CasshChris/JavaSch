/**
 * Project Name: Calculate Final Grade
 * Programmer: Christian Alvarez -Student
 * Date: 03-04-2021
 */
package calculatefinalgrade;
// i :: import Scanner
import java.util.Scanner;

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
        // Main :: print heading
        printHeadings();
        
        // Main.2 :: Use for loop 3 times for 3 students
        for (int counter = 1; counter <= 3; counter++) {
            // Main.2.2 :: prompt user for input
            promptUserForInputData();

            // Main.3 :: Call findAverageAndStatus() method
            findAverageAndStatus();
        }
    }
        
}