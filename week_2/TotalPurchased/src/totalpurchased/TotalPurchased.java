package totalpurchased;
/* import Java util */ 
import java.util.Scanner;

public class TotalPurchased {

    public static void main(String[] args) {
        // 1 :: Declare variables
        String firstItems, secondItems, thirdItems, fourthItems, fifthItems; // 1.1 Item names
        
        // Note: Instructors changes:
        // 1) Declare Double as double
        double firstItemsPrice, secondItemsPrice, thirdItemsPrice, fourthItemsPrice, fifthItemsPrice; // 1.2 Item prices
        double subTotal, salesTax, totalAmount; // 1.3 Amount charged
        double amountTendered, amountReturned; // 1.4 Amount given(tendered) by costumer

        /*Scanner*/
        // 2 :: Create "input" output
        Scanner input = new Scanner(System.in);

        /*Prompts*/
        // 3 :: Prompt user for first item
        System.out.print("Enter the First Item Purchased: ");

        // 3.1 :: Read & store in firstItems
        firstItems = input.nextLine();

        // 3.2 :: Prompt user for item price
        System.out.print("Enter the Price for " + firstItems + " $");

        // 3.3 :: Read & store in firstItemPrice
        firstItemsPrice = input.nextDouble(); 

        // Note: Instructor added. To read the extra blank enter key with numbers
        input.nextLine();
        
        // 4 :: Prompt user for second item
        System.out.print("Enter the Second Item Purchased: ");

        // 4.1 :: Read & store in secondItems
        secondItems = input.nextLine();
        
        // 4.2 :: Prompt user for item price
        System.out.print("Enter the Price for " + secondItems + " $");

        // 4.3 :: Read & store in secondItemPrice
        secondItemsPrice = input.nextDouble();

        // 4.4 :: Add extra black line - Instructor added
        input.nextLine();
        
        // 5 :: Prompt user for third item
        System.out.print("Enter the Third Item Purchased: ");

        // 5.1 :: Read & store in thirdItems
        thirdItems = input.nextLine();
        
        // 5.2 :: Prompt user for item price
        System.out.printf("Enter the Price for " +  thirdItems + " $");

        // 5.3 :: Read & store in thirdItemPrice
        thirdItemsPrice = input.nextDouble();

        // 5.4 :: Add extra black line - Instructor added
        input.nextLine();
        
        // 6 :: Prompt user for fourth item
        System.out.print("Enter the Fourth Item Purchased: ");

        // 6.1 :: Read & store in fourthItems
        fourthItems = input.nextLine();
        
        // 6.2 :: Prompt user for item price
        System.out.printf("Enter the Price for " + fourthItems + " $");

        // 6.3 :: Read & store in fourthItemPrice
        fourthItemsPrice = input.nextDouble();

        // 6.4 :: Add extra black line - Instructor added
        input.nextLine();
        
        // 7 :: Prompt user for fifth item
        System.out.print("Enter the Fifth Item Purchased: ");

        // 7.1 :: Read & store in fifthItems
        fifthItems = input.nextLine();

        // 7.2 :: Prompt user for item price
        System.out.printf("Enter the Price for " + fifthItems + " $");

        // 7.3 :: Read & store in fifthItemPrice
        fifthItemsPrice = input.nextDouble();

        // 7.4 :: Add extra black line - Instructor added
        input.nextLine();
        
        /*Calculations*/

        // 10 :: Calculate sum of prices
        subTotal = firstItemsPrice + secondItemsPrice + thirdItemsPrice + fourthItemsPrice + fifthItemsPrice;

        // 11 :: Calculate sales tax
        salesTax = subTotal * 0.10;

        // 12 :: Calculate total amount
        totalAmount = subTotal + salesTax;

        /*Prompt*/
        // 8 :: Prompt user for amount custumer gave
        System.out.print("Enter Amount Tendered by Customer: $");

        // 9 :: Read & store in amountTendered
        amountTendered = input.nextDouble();

        /*Calculations*/
        // 13 :: Calculate amount returned
        amountReturned = amountTendered - totalAmount;

        /*Output*/

        // 14 :: Output amount owed to customer
        System.out.printf("Amount to be Returned to Customer = $%,.2f ", amountReturned);

    }
    
}