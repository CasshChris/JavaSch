/**
 * Project Name: ShoeStoreIventoryManager
 * Programmer: Student - Christian Alvarez
 * Date: 03-13-2021
 */

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
public final static String USERNAME = "user";
public final static String PASSWORD = "password";

// 3 :: Declare login 
public static String userName = "";
public static String passWord = "";

// 4 :: Define main()
    public static void main(String[] args) {
        // 1 :: add items to shoes and prices
        shoes.add("Nike Reg");
        shoes.add("Nike Air");
        shoes.add("Vans");
        prices.add("45.99");
        prices.add("67.99");
        prices.add("75.99");

        // 1 :: Call printHead()
        printHead();
        
        // 2 :: Call loginCheck()
        loginCheck();
        
        // 3 :: Call mainMenu()
        mainMenu();
        
        // 4 :: Call promptUser()
        promptUser();
    }

    public static void printHead() {
    // 1 :: Create Date object
    Date date = new Date();
    
    // 2 :: print header
    System.out.println(date + "\n"); // 2.2 :: print date
    System.out.println("******************************************************");
    System.out.println("***** Welcome to ShoeMart Inventory Manager **********"); // 2.3 :: print welcome statement
    System.out.println("******************************************************\n");
    System.out.println("Username = \"user\"");
    System.out.println("Password = \"password\"\n\n");
}

    // 2 :: Define mainMenu()
    public static void mainMenu() {
    // 1 :: print main menu
    System.out.println("\n******************************************************");
    System.out.println("***************** Choose a action ********************");
    System.out.println("***** Enter \"List\" to print Inventory ****************");
    System.out.println("***** Enter \"Add\" to Add Item to Inventory ***********");
    System.out.println("***** Enter \"Remove\" to Remove Item to Inventory *****");
    System.out.println("***** Enter \"--help\" to get the Manual ***************");
    System.out.println("***** Enter \"--Quit\" to exit the Program *************");
    System.out.println("******************************************************\n");
    
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
            System.out.println("\n***** Welcome " + USERNAME + " *****\n");
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
        // 1 :: declare variable
        boolean promptLoop = true;

        // 2 :: check if promptLoop 
        while (promptLoop == true) {
            // 3 :: Prompt user for items
            System.out.print("\nEnter Action > ");
            String action = input.nextLine();
            System.out.println(); // blank line

            // 4 :: Use switch... case to do use action
            switch (action) {
                case "list": case "List": case "LIST":
                listItems();
                break;
                case "add": case "Add": case "ADD":
                addItems();
                break;
                case "remove": case "Remove": case "REMOVE":
                removeItems();
                break;
                case "--help": case "--Help":
                printHelpItems();
                break;
                case "--quit": case "--Quit":
                System.exit(0);
            }

        }



    }

    // 5 :: Define listItems()
    public static void listItems() {
    for (int i = 0; i < shoes.size(); i++) {
        // 
        System.out.println((i + 1) + " " + shoes.get(i) + " " + prices.get(i));
    }

}

    // 6 :: deifne addItems
    public static void addItems() {
    // 1 :: Prompt user for item Name, store in itemAdd, & add to shoes array
    System.out.print("Enter the Items Name > ");
    String itemAdd = input.nextLine();
    shoes.add(itemAdd);
    
    // 2 :: Prompt user for item Price, store in itemAddPrice, & add to prices array
    System.out.print("\nEnter the Items Price > ");
    String itemAddPrice = input.nextLine();
    prices.add(itemAddPrice);
    
}

    // 7 :: define removeItems()
    public static void removeItems() {
        // 1 :: list item before prompting
        listItems();
        System.out.println();
        
        // 2 :: prompt user for item number
        System.out.print("\nEnter the Number of the Item to be Removed > ");
        int itemRemove = input.nextInt();
        shoes.remove(itemRemove - 1);
    }
    
    // 8 :: deine printHelpItems()
    public static void printHelpItems() {
        // 1 :: Print help
        System.out.println("These are the rule or \"Syntax\" of the ShoeMart Inventory Management Software\n");
        System.out.println("\"list\"\n");
        System.out.println("\"list\" allows you to show add the items in the inventory along with the items price.\n\n");
        System.out.println("\"add\"\n");
        System.out.println("\"add\" allows you to add a item to the inventory\n\n");
        System.out.println("\"remove\"\n");
        System.out.println("\"remove\" allows user to remove item for inventory\n\n");
        System.out.println("\"Quit\"\n");
        System.out.println("\"Quit\" exits the program\n\n");
        
    }

}
