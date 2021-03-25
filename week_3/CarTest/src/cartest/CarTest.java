/*
 * Project Name: Create Car Class 
 * Programmer: Student - Christian Alvarez 
 * Date: 02-04-2021
 */

/*main file*/
package cartest;

/*Scanner*/
import java.util.Scanner;

public class CarTest {

    /*Main Class*/
    // Main :: Define main class
    public static void main(String[] args) {
        // Main.1 :: Call printHeadings
        printHeadings();

        // Main.2 :: Call createCarClass
        createCarClass();

        // Main.3 :: Print footings
        printFootings();
    }

    /*printHeadings*/
    // 1 :: Define printHeadings()
    public static void printHeadings() {
        // 1.1 :: Print Header
        System.out.println("\n*************************************");
        System.out.println("\n**********Car Class Project**********");
        System.out.println("\n*************************************");
    }
    /*createCarClass*/
    // 2 :: Define createCarClass()
    public static void createCarClass() {
        // 2.1 :: Declare Var
        boolean quit = false;
        String model, make = null;
        int year;
        String toQuit;

        // 2.2 :: Create Scanner input
        Scanner input = new Scanner(System.in);

        // 2.3 :: Create empty constutor
        Car myCar = new Car("", "", 0);

        /*Wile loop*/
        // 2.4 :: Use while loop until user presses "Q" for quit
        while (!quit) {
            /*Prompts*/
            System.out.print("Please, Enter car Make: ");
            make = input.nextLine();

            System.out.print("Please, Enter car Model: ");
            model = input.nextLine();

            System.out.print("Please, Enter car Year: ");
            year = input.nextInt();

            myCar.setMake(make);
            myCar.setModel(model);
            myCar.setYear(year);
            
            input.nextLine();

            System.out.println("The following are information about thecar:" + myCar);
            System.out.print ("Press 'Q' to Quit or any other key to continue: ");

            toQuit = input.nextLine();  

            /*If Statment*/
            //  Check if the user pressed ‘Q’ to quit            
            if (toQuit.equalsIgnoreCase("Q")) {
                quit = true;
              }
        }
    }

    public static void printFootings() {
       System.out.println("\n*************************************");
       System.out.println("*****End of Job: Christian Alvarez*****");
       System.out.println("\n*************************************");
    }

    
}
