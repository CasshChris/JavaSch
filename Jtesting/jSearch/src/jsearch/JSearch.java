/* 
 * 
 * 
 * 
 */
package jsearch;
import java.util.Scanner; // import scanner
import java.util.Arrays; // import arrays

public class JSearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        /* 
        int c, n, search, array[];  
   
        System.out.println("Enter number of elements");  
        n = in.nextInt();   
        array = new int[n];  
        
        System.out.println("Enter those " + n + " elements");  
        
        for (c = 0; c < n; c++) {
          array[c] = in.nextInt();  
        }
        System.out.println("Enter value to find");
        search = in.nextInt();
        System.out.println(" ");
        
        for (c = 0; c < n; c++) {  
            if (array[c] == search) {    /* Searching element is present */ /* 
            System.out.println(search + " is present at location " + (c + 1) + ".");  
            break;  
            }
            
            if (c == n) { /* Element to search isn't present */ /* 
            System.out.println(search + " isn't present in array.");
            }
        } 
        */

        String [] price = {"14.99", "10.99", "13.99"};
        String [] Shoe = {"Nike", "Addidas", "Reabok"};
        // System.out.printf("The item \"" + itemArray[0][2] + "\" is " + itemArray[1][2] + "%n");
        
        System.out.printf("Enter Command > ");
        String inCommand = input.nextLine();

        if ("list".equals(inCommand)) {
            System.out.printf("Shoe Maker   |   Price%n");
            for (int i = 0; i < Shoe.length; i++) {
                System.out.println(Shoe[i] + "          |       " + price[i]);
            }
            
        }
    }

    public static void printHead() {
        
    }
}
