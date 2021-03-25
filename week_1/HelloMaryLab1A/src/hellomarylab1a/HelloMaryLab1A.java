/*    
  ************************************************************
Purpose of the Project: This Project will print the users first & last name
Project Name: Hello Mary
Date: Thursday, January 28, 2021
Programmer: Student – Christian
   ************************************************************
*/

package hellomarylab1a;
// 1 :: Import Scanner class
import java.util.Scanner;

public class HelloMaryLab1A {

    public static void main(String[] args) {
    // 1 :: Declare the variables for the project
    String firstName, lastName;


    // 2 :: Create "input" object
    Scanner input = new Scanner(System.in);
           
    // 3 :: Prompt the user to enter first Name
    System.out.print("Enter your First Name: \007 ");

    // 4 :: Read & store
    firstName = input.nextLine();     

    // 4.1 :: Print first name
    System.out.println("Your First Name is: " + firstName);
    
    // 5 :: Prompt the user to enter last Name
    System.out.print("Enter your Last Name: \007 ");

    // 6 :: Read & store
    lastName = input.nextLine();     

    // 6.1 :: Print last name
    System.out.println("Your Last Name is: " + lastName);
    }
    
}
