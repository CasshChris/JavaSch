/* 
 * 
 * 
 * 
 */
package jsearch;
import java.util.Scanner; // import scanner
import java.util.Arrays; // import Arrays
import java.util.Date; // import Date

public class JSearch {
    // 1 :: declare login variables
    public final static String USERNAME = "rootUser";
    public final static String PASSWORD = "rootPassword";

    //2 Declare login 
    public static String userName = "";
    public static String passWord = "";

    // 3 :: Create global Scanner Object
    public static Scanner input = new Scanner(System.in);

    // 4 :: 
    public static String [] price = {"14.99", "10.99", "13.99"};
    public static String [] Shoe = {"Nike", "Addidas", "Reabok"};

    // 4 :: Define Main Function
    public static void main(String[] args) {
        // 1 :: Call printHeader()
        printHeader();
        
        // 2 :: loginCheck()
        loginCheck();
        
        // 3 :: Call MainMenu()
        MainMenu();

    }
    
    // 5 :: Define printHeader()
    public static void printHeader() {
        // 1 :: Create Date object
        Date date = new Date();
        
        // 2 :: print Header
        System.out.println(date + "\n"); // 2.2 :: print date
        System.out.println("*********************************************");
        System.out.println("*** Welcome to ShoeMart Inventory Manager ***"); // 2.3 :: print welcome statement
        System.out.println("*********************************************\n");
    }
    
    // 6 :: Define loginCheck()
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
        while ( !(userName.equalsIgnoreCase(USERNAME) && passWord.equals(PASSWORD) ) && count <= 2 ){
            // 5.3 :: prompt user for correct login
            System.out.println("Your User Name or Password are Wrong. Please Try again");
            
            // 5.4 :: prompt user for UserName
            System.out.print("Please Enter User Name: ");
            userName = input.nextLine(); // 5.5 read & store in userName
            
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
    
    // 7 :: Define MainMenu()
    public static void MainMenu() {
        // 1 :: Call listMenu()
        listOptions();
        
        // 2 :: prompt user for a command & store in inCommand
        System.out.printf("%nEnter Command > ");
        String inCommand = input.nextLine();
        
        if ("list-item".equalsIgnoreCase(inCommand)) {
            System.out.printf("Shoe Maker   |   Price%n");
            for (int i = 0; i < Shoe.length; i++) {
                System.out.println((i + 1)  + " - " + Shoe[i] + "          |       " + price[i]);
            }
            
        }
        else if ("add-item".equalsIgnoreCase(inCommand)) {
            // 1 :: prompt user for new item name & store in inputItem
            System.out.printf("%nEnter item name > ");
            String inputItem = input.nextLine();
            
            int i;
            String newItem[] = new String[Shoe.length + 1];
            for (i = 0; i < Shoe.length; i++) {
                newItem[i] = Shoe[i];
            }
            
            newItem[i] = inputItem;
            
            System.out.printf(Shoe[4]);
            
        }
        
        
    }
    
    public static void listOptions() {
        // 1 :: print app options
        
    }

    

}

/* 
int c, n, search, array[];  

System.out.println("Enter number of elements");  
n = in.nextInt();   
array = new int[n];  

System.out.println("Enter those " + n + " elements");  

for (c = 0; c < n; c++) {
  array[c] = in.nextInt();  
}
System.out.println("Enter value to find");
search = in.nextInt();
System.out.println(" ");

for (c = 0; c < n; c++) {  
    if (array[c] == search) {    /* Searching element is present 
    System.out.println(search + " is present at location " + (c + 1) + ".");  
    break;  
    }
    
    if (c == n) { /* Element to search isn't present  
    System.out.println(search + " isn't present in array.");
    }
} 
*/