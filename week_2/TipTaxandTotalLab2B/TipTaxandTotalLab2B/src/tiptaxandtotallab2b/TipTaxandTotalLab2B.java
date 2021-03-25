/*
* Project Name: TipTaxandTotalLab2B
* This projects purpose is to calculate total price of some food. It will charge the sales tax, tip amount, & first total giving the sum of the charge of the food. This project will also calculate the amount that 
* is to be returned to the costumers based on the amount tendered
* Programmer: Student - Christian Alvarez
* Date: 02/03/2021
*/
package tiptaxandtotallab2b;
/*Import java Scanner*/
import java.util.Scanner;

public class TipTaxandTotalLab2B {

    public static void main(String[] args) {
        
        /*Variables*/
        // 1 :: Declare variables
        Double salesTaxAmount, tipAmount;
        Double foodCharges;
        Double totalAmountDue;
        Double amountTendered;
        Double amountReturnd;

        /*Scanner*/
        // 2 :: Create "input" object
        java.util.Scanner input = new Scanner(System.in);

        /*Output*/
        // 3 :: Program Header
        System.out.println("*** Calculate Tip, Tax and Total Amount Due Program ****");

        /*Prompt*/
        // 4 :: Prompt user for food charges
        System.out.print("Enter the Charges for the Food: $");

        // 4.1 :: Read & store in foodCharges
        foodCharges = input.nextDouble();

        /*Calculations*/
        // 5 :: Do tip Calculation
        tipAmount = foodCharges * 0.15;

        // 5.1 :: Do sales tax Calculation
        salesTaxAmount = foodCharges * 0.07;

        // 5.2 :: Do total Calculations
        totalAmountDue = foodCharges + tipAmount + salesTaxAmount;

        /*Output*/
        // 6 :: Output amount given
        System.out.printf("Food Charges Amount is = $%,.2f %n", foodCharges);

        // 6.1 :: Output tip amount
        System.out.printf("Tip Amount is = $%,.2f %n", tipAmount);

        // 6.2 :: Output sales amount
        System.out.printf("Sales Tax Amount is = $%,.2f %n", salesTaxAmount);

        // 6.3 :: Output total amount due
        System.out.printf("Total Amount Due is = $%,.2f %n", totalAmountDue);

        /*Prompt*/
        // 7 :: Prompt user for amount given(tendered)
        System.out.print("Enter Amount tendered by Customer: $");

        // 7.1 :: Read & store in amountTendered
        amountTendered = input.nextDouble();

        /*Calculation*/
        // 8 :: Calculate amount returned
        amountReturnd = amountTendered - totalAmountDue;

        /*Output*/
        // 9 :: Output amount returned
        System.out.printf("Amount to be returned to Customer = $%,.2f %n", amountReturnd);

        /*Footer*/
        // 10 :: Program footer
        System.out.println("********End of Program*********");

        // 11 :: Programmer name
        System.out.print("********Programmer: Student - Christian Alvarez*******");

    }
    
}
