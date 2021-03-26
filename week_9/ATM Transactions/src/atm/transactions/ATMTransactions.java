/**
 * Project Name: Simple ATM Machine Transaction Java Project to Display the ATM Transaction
 * Programmer: Student - Christian Alvarez
 * Date: 03-24-2021
 */
package atm.transactions;
/*imports*/
// i :: import array & scanner
import java.util.Date; // i.2 :: import Date
import java.util.Scanner; // i.3 :: import Scanner

public class ATMTransactions {
    /*Variables*/
    // v :: Declare global Var
    public static Double balance = 5000.0;
    public static Double withdraw, depost;
    public static int choice = 0;
    // v.2 :: Declare user & password global var(s)
    public final static String USERNAME = "Mary100";
    public final static String PASSWORD = "ATM";
    public static String userName = "";
    public static String passWord = "";

    /*Classes*/
    // c :: Define Classes(c)
    // c.1 :: Define Main Class
    public static void main(String[] args) {
        /*Main*/
        // Main :: Call Classes
        // Main.2 :: Call printHeadings()
        printHeadings();

        // Main.3 :: Call checkLogIn()
        checkLogIn();

        // Main.4 :: Call printATMMainMenu()
        printATMMainMenu();

        // Main.5 :: Call checkUserChoice()
        checkUserChoice();
        
        // Main.6 :: Call performATMOperation()
        performATMOperation();

        // Main.7 :: Call printFooters()
        printFooters();

    }

    // c.2 :: Define printHeadings()
    public static void printHeadings() {
        // 1 :: Create Date object
        Date date = new Date();

        // 2 :: print Header
        System.out.println(date); // 2.2 :: print date
        System.out.println("******************************************");
        System.out.println("*** Welcome to Chase Bank ATM Machine ***"); // 2.3 :: print welcome statement
        System.out.println("******************************************\n");
    }

    // c.3 :: Define checkLogIn()
    public static void checkLogIn() {
        // 1 :: prompt user for login (-Heading-)
        System.out.println("Check Log In: Check User Name and Password");

        // 2 :: Create Scanner input
        Scanner input = new Scanner(System.in);

        // 3 :: prompt user for userName
        System.out.print("Please Enter User Name: ");
        userName = input.nextLine(); // 3.2 :: read & store in userName
        
        // 4 :: prompt user for passWord
        System.out.print("Please Enter Password: ");
        passWord = input.nextLine(); // 4.2 :: read & store in passWord

        // 5 :: Use while loop if the user entered wrong login
        while ( !(userName.equalsIgnoreCase(USERNAME) && passWord.equals(PASSWORD)) ){
            // 5.2 :: prompt user for correct login
            System.out.println("Your User Name or Password are Wrong. Please Try again");

            // 5.3 :: prompt user for UserName
            System.out.print("Please Enter User Name: ");
            userName = input.nextLine(); // 5.4 read & store in userName
            
            // 5.5 :: prompt user for PassWord
            System.out.print("Please Enter Password: ");
            passWord = input.nextLine(); // 5.6 :: read & store in passWord

            // 5.7 :: Check using if statement to see if user has correct Username and Password
            // Note: User Name is case-insensitive while Password is Case sensitive
            if ( (userName.equalsIgnoreCase(USERNAME) && passWord.equals(PASSWORD)) ){
                System.out.println ("\n*** Welcome to Chase ATM Machine ***\n");
            } // close for 
        } // close while loop

    }

    // c.4 :: Define printATMMainMenu()
    public static void printATMMainMenu() {
        // 1 :: print Main Menu
        System.out.println("\n***********************************************");
        System.out.println("******* Automated Teller Machine (ATM) ********");
        System.out.println("********----------------------------***********");
        System.out.println("*********  1) Choose 1 for Withdraw  **********"); // 1.2 :: print option 1
        System.out.println("********** 2) Choose 2 for Deposit ************"); // 1.3 :: print option 2
        System.out.println("********** 3) Choose 3 for Check Balance ******"); // 1.4 :: print option 3
        System.out.println("********** 4) Choose 4 for EXIT  **************"); // 1.5 :: print option 4
        System.out.println("***********************************************\n");

    }

    // c.5 :: Define checkUserChoice()
    public static void checkUserChoice() {
        // 1 :: Create Scanner input
        Scanner input = new Scanner(System.in);

        // 2 :: Use while loop to check the users choice
        while (choice != 1 && choice != 2 && choice != 3 && choice != 4 ) {
            // 2.2 :: prompt user for choice
            System.out.print("Choose from ATM Menu the Operation you want to perform: ");
            choice = input.nextInt(); // 2.3 :: read & store in choice
        }
    }

    // c.6 :: Define performATMOperation()
    public static void  performATMOperation() {
        // 1 :: Use switch case for choice
        switch(choice) {
            case 1:
                performMoneyWithdraw();
                break;
            case 2: 
                performMoneyDeposit();
                break;
            case 3:
            performCheckBalance();
                break;
            case 4:
                performExit();
                break;
            default:
                System.out.println("** Invalid Choice. Please choose from ATM Menu**");
                break;
        }
    }

    // c.7 :: Define  performMoneyWithdraw()
    public static void  performMoneyWithdraw() {
        // 1 :: Create Scanner input 
        Scanner input = new Scanner(System.in);
        
        // 2 :: prompt user for money withdrawn
        System.out.print("Enter money to be withdrawn: ");
        withdraw = input.nextDouble(); // 2.2 :: read & store in withdraw

        // 3 :: Check using if statemnet to see if there is available balance to Withdraw money
        if (balance >= withdraw) {
            // 3.2 :: Calculate withdraw
            balance = balance - withdraw;

            // 3.3 :: 
            System.out.printf("Please collect your money $%.2f %n", withdraw); // 3.3 :: 
            System.out.printf("Your Balance is now = $%.2f %n", balance);

        }
        else {
            // 3.4 :: else, no available balance, print ‘Insufficient Balance”
            System.out.println("Insufficient Balance");
        }
        System.out.println(""); // Blank line
    }

    // c. :: Define printFooters()
    public static void printFooters() {
        // 1 :: print footer
        System.out.println("\n********************************************");
        System.out.println("*** Thank you for Choosing Chase Bank *******"); // 1.2 :: print thank you statement
        System.out.println("***Programmer: Student - Christian Alvarez***"); // 1.3 :: print student name
        System.out.println("*********************************************");
    }
    
}
