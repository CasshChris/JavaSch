/* Purpose: Print Student's name 10 times using for loop
 * Project Name: ForPrintYourName
 * Programmer: Student - Christian Alvarez
 * Date: 03-05-2021
 */
package forprintyourname;

public class ForPrintYourName {

    public static void main(String[] args) {
        // 1 :: Output header
        System.out.println("********** Write Your Full Name to Console 10 Times *************");
        System.out.println(); // Blank line
        
        // 2 :: Declare variables
        int i;
        
        // 3 :: Use for loop to print student name 10 times 
        for (i = 0; i <= 10; i++) {
            System.out.println("Chrsitian Alvarez");
        }
        
        // 4 :: Output footer 
        System.out.println(); // Blank line
        System.out.println("********************* End Of Program ****************************");
        System.out.println("********** Programmer: Student - Christian Alvarez **************");

    }
    
}
