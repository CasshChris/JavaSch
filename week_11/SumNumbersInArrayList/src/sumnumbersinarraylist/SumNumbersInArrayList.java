/**
 * Project Name: SumNumbersInArrayList
 * Programmer: Student - Christian Alvarez
 * Date: 04-15-2021
 */

package sumnumbersinarraylist;
// i :: import classes 
import java.util.Scanner; // import Scanner
import java.util.ArrayList; // import ArrayList
import java.util.Collections; // import Collections

public class SumNumbersInArrayList {
// global variables
public static ArrayList <Integer> numberArrayList = new ArrayList <Integer>();
public static Scanner input = new Scanner (System.in);
public static int number;
public static int sum = 0;
public static double average;
public static String answer = "y";
    
    // 1 :: Define main
    public static void main(String[] args) {
        // 1 :: Call printHeaders()
        printHeaders();
        
        // 2 :: Use while statement 
        while (answer.equalsIgnoreCase("Y")) {
            // 3 :: Call promptUserForInput()
            promptUserForInput();
            
            // 4 :: Call printPopulatedArray()
            printPopulatedArray();

            // 5 :: Call sumAndAverageNumbersInArray()
            sumAndAverageNumbersInArray();

            // 6 :: Call sortArrayAndPrintMaxandMin()
            sortArrayAndPrintMaxandMin();

            // 7 :: Read End of line enter key
            input.nextLine();
            
            // 8 :: prompt user if they want to ran the program again & store answer in "answer"
            System.out.print("Do you want to Run the program again (Y/N): ");
            answer = input.nextLine();

            // 9 :: Output the answer
            System.out.println("The answer is: " + answer);

            // 10 :: if answer is inncorrect break
            if ( !(answer.equalsIgnoreCase("Y"))) {
                break;
            }

            // 11 :: Call printFooters()
            printFooters();

        }
        
    }
    
    // 2 :: Define printHeaders()
    public static void printHeaders() {
        // 1 :: print header
        System.out.println("********** Print Nice Headings ********\n");

    }
    
    // 3 :: Define promptUserForInput()
    public static void promptUserForInput() {
        // 1 :: Define variable
        int arrayListSize = 0;

        // 2 :: Clear numberArrayList from items
        numberArrayList.clear();

        // 3 :: Output 
        System.out.println("The Array Size is Fixed to: " + arrayListSize);
        System.out.println("So Enter: " + arrayListSize + " Numbers Only.");

        for (int i = 0; i < arrayListSize; i++) {
            // 4 :: Prompt user to enter number
            System.out.print("Please, Enter the number for element:" +(i+1) + " ---> ");
            number = input.nextInt();
            
            // 5 :: 
            while (number < 0 || number > 100) {
                System.out.println("**** Invalid Number ****");
                System.out.print("Please enter a number between 0 and 100:" +(i+1) + " ---> ");
                number = input.nextInt();

            }
            // 6 :: 
            numberArrayList.add(number);
        }
        System.out.println("********************************");
    }
    
    // 4 :: Define printPopulatedArray()
    public static void printPopulatedArray() {
        // 1 :: Output array list
        for (int k = 0; k < numberArrayList.size(); k++ ) {
            System.out.printf (" %d %n", numberArrayList.get(k));
            System.out.println();
        }
    }
    
    // 5 :: Define sumAndAverageNumbersInArray()
    public static void sumAndAverageNumbersInArray() {
        // 1 :: Sort "Collection" array
        Collections.sort(numberArrayList);
        
        // 2 :: Print numberArrayList
        System.out.println("******* The Sorted Array List **********");
        System.out.println(numberArrayList);
        
        // 3 :: declare sum variable & calculate sum
        sum = 0;
        for ( int m = 0; m < numberArrayList.size(); m++) {
            sum += numberArrayList.get(m);
        }
        
        // 4 :: 
        average = (double) sum / numberArrayList.size();
        System.out.println("The sum of the number of array = " + sum);
        System.out.printf("The Average of the number of array = %.2f %n", average);
        
    }
    
    // 6 :: Define sortArrayAndPrintMaxandMin()
    public static void sortArrayAndPrintMaxandMin() {
        // 1 :: Sort "Collection" array
        Collections.sort(numberArrayList);

        // 2 :: 
        System.out.println("The Minimum number is: " + numberArrayList.get(0));

        // 3 :: 
        int lastNumber = numberArrayList.get(numberArrayList.size()-1);

        // 4 :: 
        System.out.println("The Maximum number is: " + lastNumber);

    }
    
    public static void printFooters() {
        // 1 :: print Footer
        System.out.println("\n******** Print Nice Footers *******");

    }

}
