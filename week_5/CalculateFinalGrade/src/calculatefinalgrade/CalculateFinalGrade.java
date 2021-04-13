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
    public static String status;
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

    // Define printHeadings()
    public static void printHeadings() {
        // 1 :: print header
        System.out.println("************************************************");
        System.out.println("***** Calculate Average of 2 Tests Project *****");
        System.out.println("************************************************");
        System.out.println();    // print a Blank Line
    }

    // Define promptUserForInputDate()
    public static void promptUserForInputData() {
        // 1 :: Prompt user for full name
        System.out.print("Enter your Full Name: ");
        fullName = input.nextLine();

        // 2 :: Prompt user for test 1 & store it
        System.out.print("Please enter test 1(Between 0 - 100): ");
        test1 = input.nextInt();

        // 3 :: Prompt user for test 1 & store it
        System.out.print("Please enter test 2 (Between 0 - 100): ");
        test2 = input.nextInt();

        // 4 :: Call checkUserInputData
        checkUserInputData();

        String extraNewLine = input.nextLine();
    }

    // Define checkUserInputData()
    public static void checkUserInputData() {
        // 1 :: use while loop to check if test 1 is vaild
        while (test1 < 0 || test1 > 100) {
            // 1.2 :: prompt user for test 1 score & store
            System.out.print("**Invaild Test 1** Please enter test 1(Between 0 - 100): ");
            test1 = input.nextInt();
        }
        
        // 2 :: use while loop to check if test 2 is vaild
        while (test2 < 0 || test2 > 100) {
            // 2.2 :: prompt user for test 2 score & store
            System.out.print("**Invaild Test 2** Please enter test 2(Between 0 - 100): ");
            test2 = input.nextInt();
        }
    }
    
    // Define findAverageAndStatus()
    public static void findAverageAndStatus() {
        // 1 :: Calculate average
        average = (test1 + test2) / 2;
        
        // 2 :: find if student is passing or failing
        if (average >= 70) {
            status = "Passing";
        }
        else {
            status = "Failing";
        }

        // 3 :: output to the user
        System.out.println(); // blank line
        System.out.printf("The student %2 test 1 = %d, test 2 = %d %n", fullName, test1, test2);
        System.out.printf("Student Average = %d and the sudents is %s %n", average, status);
    }

    // Define footings
    public static void printFootings() {
        // 1 :: Calculate class average
        classAverage = totalAverage / studentCounter;

        // 2 :: output data to user
        System.out.printf("Total number of student = %d %n", studentCounter);
        System.out.printf("Class average = %d %n", classAverage);
        System.out.printf("A students =%d %n", aCounter);

        // 3 :: print footer
        System.out.println(); // Blank line
        System.out.println("***************************************************");
        System.out.println("*************** End of Program ********************");
        System.out.println("***** Programmer: Christian Alvarez - Student******");
        System.out.println("***************************************************");
    }

}