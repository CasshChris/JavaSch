/* 
 * Project Name: SimpleVendingMachine
 * Progranmmer: Student - Christian Alvarez
 * Date: 04-15-2021
 */

package simplevendingmachine;
// i :: import Classes
import java.util.Scanner; // i.2 :: import Scanner
import java.util.Date; // i.3 :: import Date

public class SimpleVendingMachine {
// 1 :: Declare Feilds
public static double depositedAmount = 0.0;
public static double drinkPrice = 0.0;
public static int drinkSelected = 0;

// 2 :: Declare 2 static final const variable
public static final double COKE_DRINK_PRICE = 0.75;
public static final double PEPSI_DIET_DRINK_PRICE = 1.00;

    // 1 :: Define main
    public static void main(String[] args) {
        // 1 :: Call method 
        printHeadings();
        promptUserToDepositCoins();
        promptUserToSelectDrink();
        chooseTheDrink();
        getChangeBack();
        printFooters();

    }

    // 2 :: Define printHeadings()
    public static void printHeadings() {
        // 1 :: Create Date object
        Date date = new Date();

        System.out.println(date);
        System.out.println("***************************************************");
        System.out.println("************ American Vending Machines ************");
        System.out.println("************\t\t\t*************");
        System.out.println("* Please, Deposit the Right Coins, Make Selection *");
        System.out.println("******* 1) Coke price: $0.75 **********************");
        System.out.println("******* 2) Pepsi Diet price: $1.00 ****************");
        System.out.println("******* 3) Lemonade price: $1.20 ******************");
        System.out.println("***************************************************");

    }

    // 3 :: Define promptUserToDepositCoins()
    public static void promptUserToDepositCoins() {
        // 1 :: Create Scanner object
        Scanner input = new Scanner(System.in);
        
        // 2 :: Prompt user for deposit
        System.out.print("Please, Deposit the Right amount of Money: ");
        depositedAmount = input.nextDouble();
        
    }
    
    // 4 :: Define promptUserToSelectDrink()
    public static void promptUserToSelectDrink() {
        // 1 :: Create Scanner object
        Scanner input = new Scanner(System.in);

        // 2 :: Check if drinkSelected is not 1, 2, & 3
        while (drinkSelected != 1 && drinkSelected != 2 && drinkSelected != 3) {
            // 3 :: Prompt user to select drink & store in drinkSelected
            System.out.print("Please, Be Sure to Select the Drink: ");
            drinkSelected = input.nextInt();
        }
        // 4 :: Call calculateAmountDue()
        calculateAmountDue();
    }

    // 5 :: Define calculateAmountDue()
    public static void calculateAmountDue() {
        switch (drinkSelected) {
            case 1:
                drinkPrice = COKE_DRINK_PRICE;
                break;
            case 2:
                drinkPrice = PEPSI_DIET_DRINK_PRICE;
                break;
            default:
                System.out.println("Please Make a Selection: 1 or 2");
                break;


        }
    }

    // 6 :: Define chooseTheDrink()
    public static void chooseTheDrink() {
        if (depositedAmount >= drinkPrice) {
            System.out.printf("Your Change is: %.2f %n", depositedAmount - drinkPrice);
        }
        else {
            System.out.println("Insert More Coins");
            getChangeBack();
        }
    }

    // 7 :: Define getChangeBack()
    public static void getChangeBack() {
        System.out.printf("You were Refunded: %.2f %n", depositedAmount - drinkPrice);
        depositedAmount = 0;
    }

    // 8 :: Define printFooters()
    public static void printFooters() {
        System.out.println("*******************************************");
        System.out.println("******* Thank you for your Business *******");
        System.out.println("*******************************************");
    }
    
}
