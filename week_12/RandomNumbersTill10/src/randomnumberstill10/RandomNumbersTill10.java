/**
 * Project Name: RandomNumbersTill10
 * Programmer: Student - Christian Alvarez
 * Date: 04-22-2021
 */

package randomnumberstill10;
// i :: import classes
import java.security.SecureRandom; // import SecureRandom

public class RandomNumbersTill10 {

    public static void main(String[] args) {
        // 1 :: Declare variable
        int randomNums;
        
        // 2 :: create SecureRandom object
        SecureRandom randomNumbers = new SecureRandom();
        
        // 3 :: print Header
        System.out.println("***** Generated Numbers are: **********" ); 
        
        // 4 Use for loop 10 times
        for (int i = 1; i <= 10; ++i) {
            // 5 :: generate 10 random numbers
            randomNums = randomNumbers.nextInt(10);
            
            // 6 :: Output the random number
            System.out.printf ("%4d", randomNums); // insert 4 spaces before each integer
        }
        
        // 7 :: print blank line
        System.out.printf("%n");
        
    }
    
}
