/**
 * Project Name: DivisibleBy3Or5And3And5
 * Programmer: Student - Christian Alvarez
 * Date: 04-22-2021
 */

package divisibleby3or5and3and5;
import java.text.BreakIterator;
// i :: import Scanner
import java.util.Scanner;

public class DivisibleBy3Or5And3And5 {
    // 1 :: Create Scanner object
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // 1 ::Call MainMenu()
        MainMenu();

        // 2 :: Call userChoice()
        userChoice();

    }

    public static void MainMenu() {
        // 1 :: print Main Menu
        System.out.println("*************************************************************");
        System.out.println("********** Print Numbers Divisable by User Input ************");
        System.out.println("*************************************************************");
        System.out.println("***************                           *******************");
        System.out.println("*************** Choose From the Following *******************");
        System.out.println("******** 1) Press 1 to Print number Divisible by 3 **********");
        System.out.println("******** 2) Press 2 to Print number Divisible by 5 **********");
        System.out.println("******** 3) Press 3 to Print number Divisible by 3 & 5 ******");
        System.out.println("******** 4) Press 4 to Print number Divisible by 7 **********");
        System.out.println("******** 5) Press 5 to Print number Divisible by 11 **********");
        System.out.println("******** 6) Press 6 to Print number Divisible by 17 **********");
        System.out.println("******** 7) Press 7 to Print number Divisible by 19 **********");
        System.out.println("******** 8) Press 8 to Reprint Main Menu *********************");
        System.out.println("******** 9) Press 9 to Quit Program **************************");
        System.out.println("*************************************************************\n");
    }
    
    public static void userChoice() {
        // 1 :: prompt user for choice & store in "choice"
        System.out.println("\nEnter your choice from Main Menu: ");
        String choice = input.nextLine();

        // 2 :: Run Users choice
        switch (choice) {
            case "1": // if choice = 1 
            printDivisibleBy3();
            break;
            case "2": // if choice = 2
            printDivisibleBy5();
            break;
            case "3": // if choice = 3
            printDivisibleBy3And5();
            break;
            case "4": // if choice = 4
            printDivisibleBy7();
            break;
            case "5": // if choice = 5
            printDivisibleBy11();
            break;
            case "6": // if choice = 6
            printDivisibleBy11();
            break;
            case "7": // if choice = 7
            printDivisibleBy11();
            break;
            case "8": // if choice = 8
            MainMenu();
            break;
            case "9": // if choice = 9
            System.exit(0); // close Program
        }
        
    }

    public static void printDivisibleBy3() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if Divisible by 3
            if (count % 3 == 0){
                count++;
            }
            System.out.print(" " + count);
        }
        
    }

    public static void printDivisibleBy5() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if Divisible by 5
            if (count % 5 == 0){
                count++;
            }
            System.out.print(" " + count);
        }
    }

    public static void printDivisibleBy3And5() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if Divisible by 3 & 5
            if ((count % 3 == 0) && (count % 5 == 0)){
                count++;
            }
            System.out.print(" " + count);
        }
    }
    
    public static void printDivisibleBy7() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if Divisible by 7
            if (count % 7 == 0){
                count++;
            }
            System.out.print(" " + count);
        }
    }
    
    public static void printDivisibleBy11() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if Divisible by 11
            if (count % 11 == 0){
                count++;
            }
            System.out.print(" " + count);
        }
    }
    
    public static void printDivisibleBy13() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if Divisible by 13
            if (count % 13 == 0){
                count++;
            }
            System.out.print(" " + count);
        }
    }
    
    public static void printDivisibleBy17() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if Divisible by 17
            if (count % 17 == 0){
                count++;
            }
            System.out.print(" " + count);
        }
    }
    
    public static void printDivisibleBy19() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if Divisible by 19
            if (count % 19 == 0){
                count++;
            }
            System.out.print(" " + count);
        }
    }
    
    public static void printEvenNumbers() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if even
            if (count % 2 == 0){
                count++;
            }
            System.out.print(" " + count);
        }

    }
    
    public static void printOddNumbers() {
        // 1 :: declare variable
        int count = 0;

        // Create range
        for (int i = 0; i < 100; i++) {
            // if odd
            if (count % 2 != 0){
                count++;
            }
            System.out.print(" " + count);
        }
    }
    
    public static void printFooter() {
        // 1 :: print footer
        System.out.println("**********************************************************");
        System.out.println("******************** End of Program **********************");
        System.out.println("************** Programmer: Christian Alvarez *************");
        System.out.println("**********************************************************");

    }

    
}
