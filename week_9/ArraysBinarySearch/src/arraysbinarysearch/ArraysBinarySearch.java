/**
 * Project Name: Array Binary Search
 * Programmer: Student - Chrisitan Alvarez
 * Date: 03-19-2021
 */
package arraysbinarysearch;
/*Arrays & Scanne*/
// i :: import classes
import java.util.Arrays; // i.2 :: import Arrays
import java.util.Scanner; // i.3 :: import Scanner

public class ArraysBinarySearch {

    public static void main(String[] args) {
        // 1 :: Create Scanner
        Scanner input = new Scanner(System.in);

        // 2 :: Declare Var
        String strNamesSearch;

        // 3 :: Print Header
        System.out.println("Using for statement to print elements in array");
        
        // 4 :: Declare String Array
        String [] names = {"Mary", "David", "Bob", "Cathy", "Ziggy", "Adam"};
        
        // 5 :: Sort array
        Arrays.sort(names);

        // 6 :: Print Header
        System.out.println("Using Arrays.sort method to search in the array names");

        // 7 :: Use for Statement
        for (int i = 0; i< names.length; ++i){
            // 7.2 :: Print names
            System.out.println(names[i]);
        }
        
        System.out.println(); // Blank Line
        
        // 8 :: Print Header
        System.out.println("Using .binarySearch() method to find items in array");
        
        // 9 :: Prompt user for name to search
        System.out.print("Emter the name to search: ");
        strNamesSearch = input.nextLine();
        
        // 10 :: Use .binarySearch() & store in strNamesSearch
        int n = Arrays.binarySearch(names, strNamesSearch);
        
        // 11 :: Use if Statement
        if (n < 0){
            // 11.2 :: Print if Name not found
            System.out.printf("Name '%s' is not found. %n", strNamesSearch);
        }
        else {
            // 11.3 :: Print if Name found
            System.out.printf("Name '%s' is found at position %d. %n", strNamesSearch, n);
        }

    }
    
}
