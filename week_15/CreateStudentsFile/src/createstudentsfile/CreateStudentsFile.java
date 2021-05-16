/* Project Purpose: Prompt user for students name & test scores & output to students.txt
 * Project Name: CreateStudentsFile
 * Programmer: Student - Christian Alvarez
 * Date: 05-13-2021
 */

package createstudentsfile;
// i :: import classes for project
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.lang.SecurityException;
import java.util.Scanner;

public class CreateStudentsFile {

    public static void main(String[] args) throws FileNotFoundException {
        // 1 :: Declare variables
        String firstName, lastName;
        int firstTest, secondTest;
        String moreNames = "Y";

        // 2 :: Create & open student file
        try (Formatter output = new Formatter ("students.txt")) {
            // 3 :: Create Scanner object
            Scanner input = new Scanner (System.in);

            // 4 :: Use while statement to check if there are more students 
            while (moreNames.equals("Y")) {
                // 5 :: Use try & catch statment of exceptions
                try {
                    // 6 :: Prompt user for first name & store in firstName
                    System.out.print ("Enter student First Name: ");
                    firstName = input.nextLine();

                    // 7 :: Prompt user for last name & store in lastName
                    System.out.print ("Enter student Last Name: ");
                    lastName = input.nextLine();
                    
                    System.out.print ("Enter First Test: ");
                    firstTest = input.nextInt();

                    // 9 :: Prompt user for second test
                    System.out.print ("Enter Second Test: ");
                    secondTest = input.nextInt();

                    // 10 :: User output.format to output to student file
                    output.format ("%s %s %d %d %n", firstName, lastName, firstTest, secondTest);
                    input.nextLine();
                    
                    // 11 :: Prompt user if they want to add more users & store in moreNames
                    System.out.print ("Do you have More Students to Enter (Y/N): ");
                    moreNames = input.nextLine();
                }
                // 11 :: Use catch statement for invalid input
                catch (NoSuchElementException e) {
                    System.err.println("Invalid Input, please Try Again");
                    input.nextLine();
                }
            }
        }
        // 12 :: Use a second catch statement to catch File Not Found Exception
        catch (SecurityException | FileNotFoundException | FormatterClosedException se){
            se.printStackTrace();
        }

    }
    
}
