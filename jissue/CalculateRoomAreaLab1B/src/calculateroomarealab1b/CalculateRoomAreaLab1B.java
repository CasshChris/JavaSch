package calculateroomarealab1b;
// Import Scanner
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
        lenghtinFeet = input.nextLine();

        // 4.1 :: Print number given (LIF)
        System.out.printf("The room Lenght is %d", lenghtinFeet);

        // 5 :: Prompt user for width
        System.out.print("Enter the Width of roon in Feet: ");

        // 6 :: Read & store widthinFeet
        widthinFeet = input.nextLine();

        // 6.1 :: Print number given (WIF)
        System.out.printf("The room Width is %d", widthinFeet);

        // 7 :: Calculate lenghtinFeet * widthinFeet
        product = lenghtinFeet * widthinFeet

        // 8 :: Print "Product" (printf is being used)
        System.out.printf("The room Area in Feet: %d", product);

        // 9 :: Repeat info 
        System.out.printf("The room Lenght is %d", lenghtinFeet);
        System.out.printf("The room Width is %d", widthinFeet);
        System.out.printf("The room Area in Feet: %d", product);
    }
    
}
