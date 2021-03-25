/*    
************************************************************
    Purpose of the Project: This Project will calculator the area of a room
    Project Name: Calculate Room Area 
    Date: Thursday, January 28, 2021
    Programmer: Student – Christian Alvarez
************************************************************
*/

package calculateroomarealab1b;
// 1 :: Import Scanner class
import java.util.Scanner;

public class CalculateRoomAreaLab1B {

    public static void main(String[] args) {
        // 1 :: Declare the variables for the project
        int lenghtinFeet, widthinFeet;
        int product;


        // 2 :: Create "input" object
        Scanner input = new Scanner (System.in);

        // 3 :: Prompt user for lenght
        System.out.print("Enter the Lenght of room in Feet: ");

        // 4 :: Read & store lenghtinFeet
        lenghtinFeet = input.nextInt();

        // 4.1 :: Print number given (LIF)
        System.out.printf("The room Lenght is %d \n", lenghtinFeet);

        // 5 :: Prompt user for width
        System.out.print("Enter the Width of roon in Feet: ");

        // 6 :: Read & store widthinFeet
        widthinFeet = input.nextInt();

        // 6.1 :: Print number given (WIF)
        System.out.printf("The room Width is %d\n", widthinFeet);

        // 7 :: Calculate lenghtinFeet * widthinFeet
        product = lenghtinFeet * widthinFeet;

        // 8 :: Print "Product" (printf is being used)
        System.out.printf("The room Area in Feet: %d\n", product);

        // 9 :: Repeat info 
        System.out.println("\n******Print the Room informtion Agian********");
        System.out.printf("The room Lenght is %d \n", lenghtinFeet);
        System.out.printf("The room Width is %d \n", widthinFeet);
        System.out.printf("The room Area in Feet: %d \n", product);
        System.out.println("*********************************************");
    }
    
}
