/*    
  ************************************************************
Purpose of the Project: This Project will print the users first, last name, schoolName
Project Name: New Hadra Pizza Palace
Date: Thursday, January 28, 2021
Programmer: Student – Christian Alvarez
   ************************************************************
*/


package newhadrapizzapalacelab1;
// 1 :: Import Scanner class
import java.util.Scanner;

public class NewHadraPizzaPalaceLab1 {

    public static void main(String[] args) {
        // 1 :: Declare the variables for the project
        String firstName, lastName, schoolName;

        // 2 :: Create "input" object
        Scanner input = new Scanner (System.in);

        // 3 :: Prompt user for fist name 
        System.out.print("Enter your First Name: \007");

        // 4 :: Read & store firstName
        firstName = input.nextLine();

        // 4.1 :: Print stored variable
        System.out.println(firstName);

        // 5 :: Prompt user for last name 
        System.out.print ("Enter your Last Name: \007");

        // 6 :: Read & store firstName
        lastName = input.nextLine();

        // 6.1 :: Print stored variable
        System.out.println(lastName);

        // 7 :: Prompt user for school name 
        System.out.print("Enter your School Name: \007");

        // 8 :: Read & store schoolName
        schoolName = input.nextLine();

        // 8.1 :: Print stored variable
        System.out.println(schoolName);
    }
    
}
