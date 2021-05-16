/*
 * Project Name: ConvertReturnChangeBills
 * Programmer: Student - Christian Alvarez
 * Date: 03-05-2021
 */


package convertfromdecimal;
/*---- Imports ----*/
import java.util.Scanner;  // Import Scanner

public class ConvertFromDecimal {

    public static void main(String[] args) {
        int integerNumber ;
        String strIntegerNumber ;
        String binaryNumber;
        String octalNumber;
        String hexNumber;

        // 2 :: Create Scanner object 
        Scanner input = new Scanner(System.in);

        // 3 :: Prompt the user to enter Number to Convert to other bases
        System.out.print ("Enter the Integer Number to Find Conversion up to: ");
        integerNumber = input.nextInt();

        // 4 :: 
        binaryNumber = Integer.toString(integerNumber, 2);
        System.out.println(integerNumber+ " in Base 2 is = " + binaryNumber);

        // 5 :: 
        octalNumber = Integer.toString(integerNumber, 8);
        System.out.println(integerNumber + " in Base 8 is = " + octalNumber);

        // 6 :: 
        hexNumber = Integer.toString(integerNumber, 16);
        System.out.println(integerNumber + " in Base 16 is = " + hexNumber);

        System.out.println("Integer Number" +"\t"+ "Binary Number" +"\t" 
        + "Octal Number" +"\t"+ "Hex Number");
        System.out.println("---------------------------------------------------------"); // Harizon Line

        for (int i = 0; i <= integerNumber; ++i) {
            binaryNumber = Integer.toString(i, 2);

            octalNumber = Integer.toString(i, 8);

            hexNumber = Integer.toString(i, 16);
            
            System.out.println(i +"\t\t"+ binaryNumber +"\t\t"+ octalNumber+"\t\t"+ hexNumber);
 
        }

    }
    
}
