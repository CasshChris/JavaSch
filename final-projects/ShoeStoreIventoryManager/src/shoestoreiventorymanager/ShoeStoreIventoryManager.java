
package shoestoreiventorymanager;
/*----import-----*/
import java.util.Scanner; // import Scanner 
import java.util.ArrayList; // import ArrayList
import java.util.Date; // import Date

public class ShoeStoreIventoryManager {
// 1 :: declare objects
public static Scanner input = new Scanner(System.in);
public static ArrayList <String> shoes = new ArrayList(10);
public static ArrayList <String> prices = new ArrayList(10);

// 2 :: declare login variables
public final static String USERNAME = "rootUser";
public final static String PASSWORD = "rootPassword";

// 3 :: Declare login 
public static String userName = "";
public static String passWord = "";

    // 4 :: Define main()
        // 1 :: Call header
        //displayHead();

        // 2 :: Call loginCheck()
        //loginCheck();

        // 3 :: Call promptUser()
        //promptUser();

    }

    // 2 :: Define displayHead()
    public static void displayHead() {
        // 1 :: Create Date object
        Date date = new Date();
        
        // 2 :: 
        System.out.println(date + "\n"); // 2.2 :: print date
        System.out.println("*********************************************");
        System.out.println("*** Welcome to ShoeMart Inventory Manager ***"); // 2.3 :: print welcome statement
        System.out.println("*********************************************\n");
    }

    // 3 :: Define loginCheck()
    public static void loginCheck() {
        // 1 :: prompt user for login (-Heading-)
        System.out.println("Please Enter Username and Password");
        
        // 3 :: prompt user for userName
        System.out.print("Please Enter Username: ");
        userName = input.nextLine(); // 3.2 :: read & store in userName
        
        // 4 :: prompt user for passWord
        System.out.print("Please Enter Password: ");
        passWord = input.nextLine(); // 4.2 :: read & store in passWord
        
        // 5 :: use count to limit time users can login
        int count = 0;
        
        // 5.2 :: Use while loop if the user entered wrong login
        while ( !(userName.equalsIgnoreCase(USERNAME) && passWord.equals(PASSWORD) ) && count <= 2 ) {
            // 5.3 :: prompt user for correct login
            System.out.println("Your User Name or Password are Wrong. Please Try again");
            
            // 5.4 :: prompt user for UserName
            System.out.print("Please Enter User Name: ");
            userName = input.nextLine();
            
            // 5.6 :: prompt user for PassWord
            System.out.print("Please Enter Password: ");
            passWord = input.nextLine(); // 5.7 :: read & store in passWord
            
            // 5.8 :: +1 to count, meaning no less time user can sign in
            count += 1;
            
            // 5.9 :: Check using if statement to see if user has correct Username and Password
            // Note: User Name is case-insensitive while Password is Case sensitive
            if ( (userName.equalsIgnoreCase(USERNAME) && passWord.equals(PASSWORD)) ){
                System.out.printf("%n*** Welcome " + USERNAME + " ***%n");
            }
            // 5.10 :: tell user they have no more tries to login
            else if (count == 2) {
                System.out.println("\nIncorrect login info");
                System.out.println("Sorry, try again later\n");
                System.exit(0);
            }
        } 
    }
    
    // 4 :: Define promptUser()
    public static void promptUser() {
        // 1 :: Prompt user for items
        System.out.println("%n");

    }

    // 5 :: Define 
    public static void listOptions() {
        // 1 :: 
    }

}
