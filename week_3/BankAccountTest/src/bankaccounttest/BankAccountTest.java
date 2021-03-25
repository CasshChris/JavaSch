/**
 *  Project Name: Create Bank Account Class
 *  Programmer: Student - Christian Alvarez
 *  Date: 02-04-2021
 */
package bankaccounttest;
/*Scanner*/
// Import Scanner
import java.util.Scanner;

public class BankAccountTest {

    /*Main*/
    // Main :: Define Main()
    public static void main(String[] args) {
        // Main.1 :: Create Scanner input
        Scanner input = new Scanner(System.in);

        // Main.2 :: Create BankAccount Object
        BankAccount bankAccount1 = new BankAccount();

        // Main.3 :: Print inital "null" value by calling getFirstName
        System.out.printf("Initial value of First Name is : %s %n", bankAccount1.getFirstName());

        // Main.4 :: Prompt the User to Enter Last Name
        System.out.print("Please, Enter the user Last Name: ");

        // Main.5 :: Read & store in LastName
        String userLastName = input.next();

        // Main.6 :: Call setLastName() to store user last name in
        bankAccount1.setLastName(userLastName);
        
        // Main.7 ::  Print LastName stored in BankAccount object 
        System.out.printf("First Name of the object bank account is:%s%n", bankAccount1.getLastName());

    }
    
}
