/** 
 * Project Name: American Cars Rental Console Lab 3A
 * Programmer: Student - Christian Alvarez
 * Date: 02-04-2021
 */

package americancarsrentalconsolelab3a;
// 1 :: Import Scanner class
import java.util.Scanner;

public class AmericanCarsRentalConsoleLab3A {

    public static void main(String[] args) {
        // 1 :: Declare variables
        String fullName;
        Double endingMiles, beginingMiles;
        Double daysRented;
        Double chargeByDay, chargeByMile;
        Double totalCharge;
        Double Discount;
        Double amountDue;

        // 2 :: Create "input" Object
        Scanner input = new Scanner(System.in);

        // 3 :: Print American cars Rental & Print Calculate total amount due program
        System.out.println("**********American Cars Rental**********");
        System.out.println("********                        ********"); 
        System.out.println("*******Calculate Total Amount Due*******\n");


        // 4 :: Prompt user for Full Name
        System.out.print("Enter Customers Full Name: ");

        // 4.1 :: Read & store in fullName
        fullName = input.nextLine();
        System.out.println("");


        // 5 :: Prompt user for Day Rented
        System.out.print("Enter Number of Days Rented: ");

        // 5.1 :: Read & store in daysRented
        daysRented = input.nextDouble();

        // 6 :: Prompt for ending Miles
        System.out.print("Enter Ending Miles: ");

        // 6.1 :: Read & store in endingMiles
        endingMiles = input.nextDouble();
        System.out.println("");
        
        // 7 :: Prompt for begining Miles
        System.out.print("Enter Begining Miles: ");

        // 7.1 :: Read & store in beginingMiles
        beginingMiles = input.nextDouble();
        System.out.println("");


        // 8 :: Do Calculations
        chargeByDay = daysRented * 40; // 8.1 Days charged

        chargeByMile = (endingMiles - beginingMiles) * 30; // 8.2 Miles charged

        totalCharge = chargeByDay + chargeByMile; // 8.3 total charges

        Discount = totalCharge * 0.20; // 8.4 Calculate Discount

        amountDue = totalCharge - Discount; // 8.5 Calculate amount due

        // 9 :: Output calculations
        System.out.printf("Charge by Days   =$%,.2f %n", chargeByDay); // 9.1 Days amount

        System.out.printf("Charge by Miles  =$%,.2f %n", chargeByMile); // 9.2 Miles amount

        System.out.printf("Total Charges    =$%,.2f %n", totalCharge); // 9.3 total amount (first total)

        System.out.printf("Discount         =$%,.2f %n", Discount); // 9.4 amount discounted

        System.out.printf("Total Amount Due =$%,.2f %n", amountDue); // 9.5 full amount due

        // 10 :: finish Program
        System.out.println("\n*************End of Program*************");
        System.out.println("*Programmer: Student - Christian Alvarez*");
    }
    
}
