/*
 * Program Name: GuessNumbersGame
 * Programmer: Student - Christian Alvarez
 * Date: 03-12-2021
 */

package guessnumbersgame;
// i :: import Classes 
import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumbersGame {
// g.1 :: Declare global variables
public static int guessNumber;
public static String answer = "Y";
public static int randomNumber;
public static int randomNums;
public static String endOfLine;

// g.2 :: Declare global Scanner
public static Scanner input = new Scanner(System.in);

    // 1 :: Define main()
    public static void main(String[] args) {
        // 1 :: Call printHeadings();
        printHeadings();

        // 2 :: Call promptUserToGuessTheNumber();
        promptUserToGuessTheNumber();

        // 3 :: Call printFooters();
        printFooters();

    }

    // 2 :: Define printHeadings()
    public static void printHeadings() {
        System.out.println(" ******************************************");
        System.out.println("*** Guess a Number Between 0 and 100 Game ***");
        System.out.println(" ******************************************");
        System.out.println();
    }
    
    // 3 :: Define promptUserToGuessTheNumber()
    public static void promptUserToGuessTheNumber() {
        // 1 :: Check if answer is Y or y using while loop
        while (answer.equalsIgnoreCase("Y")) {
            // 2 :: Create SecureRandom object & generate a random number betwen 1 - 10
            SecureRandom randomNumber = new SecureRandom();
            randomNums = randomNumber.nextInt(100);
    
            System.out.print("Guess the Number: ");
            guessNumber = input.nextInt();
    
            checkUserGuessedNumber();
            endOfLine = input.nextLine();
    
            System.out.print("Do you want to continue(Y/N): ");
            answer = input.nextLine();
    
        }
        
    }
    
    // 4 :: Define checkUserGuessedNumber()
    public static void checkUserGuessedNumber() {
        // 1 :: Use while loop to check if the user guessed the wrong
        while (guessNumber != randomNums) {
            // 2 :: run if randomNums is great then guessNumber
            if (guessNumber > randomNums) {
                // 3 :: tell user number is too high
                System.out.printf("Your Guess of %d is TOO HIGH. Guess a Lower Number.%n", guessNumber);
                
                // 4 :: prompt user for a lower number & store in guessNumber
                System.out.print("Please, Enter a Lower Number: ");
                guessNumber = input.nextInt();
                
            }
            // 5 :: run if randomNums is great then guessNumber
            else if (guessNumber < randomNums) {
                // 6 :: tell user number is too high
                System.out.printf("Your Guess of %d is TOO LOW. Guess a Higher Number. %n", guessNumber);
                
                // 7 :: prompt user for a lower number & store in guessNumber
                System.out.print("Please, Enter a Higher Number: ");
                guessNumber = input.nextInt();
                
            }
            if (guessNumber == randomNums){
            // 8 :: tell user that they guessed correctly
                System.out.printf("Your guess of %d is correct. %n", guessNumber);
                System.out.println();
            }
        }
    }

    // 6 :: Define printFooters()
    public static void printFooters() {
        // 1 :: output footer
        System.out.println("\n*****************************************");
        System.out.println("********* The Game is Over *********** ");
        System.out.println("**Thank you for Playing Guess a Number Game**");
        System.out.println("*******************************************");
    }

}
