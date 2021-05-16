/* Project Purpose: This project counts letter 
 * Project Name: CountVowels
 * Programmer: Student - Christian Alvarez
 * Date: 04-22-2021
 */

package countvowels;
// i :: import Scanner
import java.util.Scanner;

public class CountVowels {
// 1 :: Declare variables
public static String text;
public static int i = 0;
public static char ch;
public static int eVowelCount = 0;
public static int aVowelCount = 0;
public static int oVowelCount = 0;
public static int iVowelCount = 0;
public static int uVowelCount = 0;
/*---modifications---*/
public static int kCount = 0;
public static int jCount = 0;
public static int tCount = 0;
public static int sCount = 0;
    
    // 2 :: define main()
    public static void main(String[] args) {
        // 1 :: Call printHeader()
        printHeader();

        // 2 :: Call promptUser()
        promptUser();

        // 3 :: Call countVowels()
        countVowels();

        // 4 :: Call printVowels()
        printVowels();

        // 5 :: Call printFooter()
        printFooter();
        
    }

    // 3 :: define printHeader()
    public static void printHeader() {
        // 1 :: Print Header
        System.out.println("********** Count Vowels is String ********");
        System.out.println("");
    }
    
    public static void promptUser() {
        // 1 :: Create Scanner object
        Scanner input = new Scanner(System.in);

        // 2 :: Prompt user for string & store in text
        System.out.print("Enter a string : ");
        text = input.nextLine();

        // 3 :: Display the strings vowels
        System.out.println("The Vowels in the string are: ");
    }
    
    // 4 :: define countVowels()
    public static void countVowels() {
        // 1 :: Use for loop to look for vowels 
        for (int j = 0; j < text.length(); j++) {
            ch = text.charAt(j);
            
            // 2 :: Use switch... case to check for each vowel
            switch(ch) {
                case 'a' : case 'A' : // if "a" or "A"
                aVowelCount++;  // Add +1 to aVowelCount
                break;
                case 'e' : case 'E': // if "e" or "E"
                eVowelCount++;  // Add +1 to eVowelCount
                break;
                case 'i' : case 'I': // if "i" or "I"
                iVowelCount++;  // Add +1 to iVowelCount
                break;
                case 'o' : case 'O': // if "o" or "O"
                oVowelCount++;  // Add +1 to oVowelCount
                break;
                case 'u' : case 'U': // if "u" or "U"
                uVowelCount++;  // Add +1 to uVowelCount
                break;
                case 'k' : case 'K': // if "k" or "K"
                kCount++;   // Add +1 to kCount
                break;
                case 'j' : case 'J': // if "j" or "J"
                jCount++;   // Add +1 to jCount
                break;
                case 't' : case 'T': // if "t" or "T"
                tCount++;   // Add +1 to tCount
                case 's' : case 'S': // if "s" or "S"
                sCount++;   // Add +1 to sCount
                break;
                
            }
        }
    }
    
    // 5 :: define printVowels()
    public static void printVowels() {
        // Output count for each of the vowels
        System.out.printf("Number of 'a' Vowels = %d %n", aVowelCount);
        System.out.printf("Number of 'e' Vowels = %d %n", eVowelCount);
        System.out.printf("Number of 'i' Vowels = %d %n", iVowelCount);
        System.out.printf("Number of 'o' Vowels = %d %n", oVowelCount);
        System.out.printf("Number of 'u' Vowels = %d %n", uVowelCount);
        System.out.printf("Number of 'j' Letters = %d %n", jCount);
        System.out.printf("Number of 'k' Letters = %d %n", kCount);
        System.out.printf("Number of 't' Letters = %d %n", tCount);
        System.out.printf("Number of 's' Letters = %d %n", sCount);
        
    }

    // 6 :: define printFooter()
    public static void printFooter() {
        // 1 :: print footer
        System.out.println("\n*******************************************************");
        System.out.println("****************** Program Finished *******************");
        System.out.println("************* Programmer: Christian Alvarez ***********");
        System.out.println("*******************************************************");
    }
    
}
