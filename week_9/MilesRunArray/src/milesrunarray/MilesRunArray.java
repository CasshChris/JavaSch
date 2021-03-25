/**
 * Project Name: Calculate miles run in a week using array
 * Programmer: Student - Christian Alvarez
 * Date: 03-24-2021
 */
package milesrunarray;
/*imports*/
// i :: import array & scanner
import java.util.Arrays; // i.2 :: import Arrays
import java.util.Scanner; // i.3 :: import Scanner

public class MilesRunArray {
    /*Variables*/
    // v :: Declare global var's
    public static String [] daysOfTheWeekArray = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; // v.2 :: store days of the week (global)
    public static int [] milesRunArray = new int[7]; // v.3 :: store miles run array (global)
    public static int totalMilesRun = 0; // v.3 :: store total miles run (global)
    public static Double averageMilesRun = 0.0; // v.4 :: store average miles run (global)

    /*Classes*/
    // c :: Define Classes(c)
    // c.2 :: Define Main()
    public static void main(String[] args) {
        /*Main*/
        // Main :: Call methods
        // Main.2 :: Call header method
        printHeadings();

        // Main.3 :: Call prompt method & prompt user for Miles run
        promptUserToEnterMilesRun();

        // Main.4 :: Call printArrayPassedToMethod() using daysOfTheWeekArray argument
        printArrayPassedToMethod(daysOfTheWeekArray);

        // Main.5 :: Call findTotalMilesRun() method
        findTotalMilesRun();

        // Main.6 :: Call findAverageMilesRun() method
        findAverageMilesRun();

        // Main.7 :: Call findHighestMilesRun() method
        findHighestMilesRun();

        // Main.8 :: Call findLowestMilesRun() method
        findLowestMilesRun();

        // Main.9 :: Call footings method
        printFootings();
    }
    
    // c.3 ::  Define printHeadings()
    public static void printHeadings() {
        // 1 :: prompt heading
        System.out.println("*********************************************");
        System.out.println("*** Calculate Miles Run in a Week Project ***"); // 1.2 :: Name of project
        System.out.println("*********************************************\n");
    }

    // c.4 :: Define promptUserToEnterMilesRun()
    public static void promptUserToEnterMilesRun() {
        /*Scanner*/
        // 1 :: Create Scanner input
        Scanner input = new Scanner(System.in);

        // 2 :: User for loop to store input to Array
        for (int i = 0; i < daysOfTheWeekArray.length; ++i) {
            System.out.printf("Enter number of Miles run on day %d %s: ", i + 1, daysOfTheWeekArray[i]); // 2.2 :: prompt user for each day of the week
            milesRunArray[i] = input.nextInt(); // 2.3 :: read & store
        } // close for loop #1
        
        // 3 :: print contect of array using for loop
        for (int i = 0; i < daysOfTheWeekArray.length; ++i) {
            System.out.printf("Miles Run on day %d %s = %d %n" , i + 1, daysOfTheWeekArray[i], milesRunArray[i]); // 3.3 :: print array content
        } // close for loop #2
    }
    
    // c.5 :: Defive findTotalMilesRun();
    public static void findTotalMilesRun() {
        // 1 :: use for loop
        for (int i = 0; i < milesRunArray.length; i++) {
            totalMilesRun+= milesRunArray[i]; // 1.2 :: loop & total Miles run in array
        } // close for loop

        // 2 :: print total mile run in a week
        System.out.printf("Total Miles Run in a Week = %d %n", totalMilesRun);
    }

    // c.6 :: Define findAverageMilesRun()
    public static void findAverageMilesRun() {
        // 1 :: find average of miles run
        averageMilesRun = (double) totalMilesRun / milesRunArray.length;

        // 2 :: print average of mile run
        System.out.printf("Average Miles Run in a Week = %.2f %n", averageMilesRun);
    }

    // c.7 :: Define findHighestMilesRun()
    public static void findHighestMilesRun() {
        // 1 :: sort milesRunArray
        Arrays.sort(milesRunArray);

        // 2 :: declare len var & do calculation
        int len = milesRunArray.length - 1;
        
        // 3 :: print highest amount of mile run
        System.out.printf("The Highest Miles Run in a Week = %d %n", milesRunArray[len]);
    }
    
    // c.8 :: Define findLowestMilesRun()
    public static void findLowestMilesRun() {
        // 1 :: sort milesRunArray
        Arrays.sort(milesRunArray);
        
        // 2 :: declare len var & do calculation
        int len = milesRunArray.length - 1;
        
        // 3 :: print lowest amount of mile run
        System.out.printf("The Lowest Miles Run in a Week = %d %n", milesRunArray[0]);
    }
    
    // c.9 :: Define printFootings()
    public static void printFootings() {
        System.out.println("********************************************************");
        System.out.println("****************** End of the Job **********************");
        System.out.println("********* Programmer: Student Christian Alvarez*********");
    }
    
    // c.10 :: Define printArrayPassedToMethod()
    public static void printArrayPassedToMethod(String[] daysOfTheWeekArray) {
        System.out.println("****** Printing the Days of the Week *******\n");
        
        for (int d = 0; d < daysOfTheWeekArray.length; d++) {
            System.out.printf("%s %n",daysOfTheWeekArray[d]);
        }
    }
}
