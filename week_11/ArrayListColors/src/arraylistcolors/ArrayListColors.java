/**
 * Project Name: ArrayListColors
 * Programmer: Student - Christian Alvarez
 * Date: 04-15-2021
 */

package arraylistcolors;
// i :: import classes
import java.util.ArrayList; // import ArrayList

public class ArrayListColors {

    // 1 :: Define main fundtion
    public static void main(String[] args) {
        // 1 :: Create "colors" ArrayList object
        ArrayList <String> colors = new ArrayList (10);
        
        // 2 :: Add "Red" to colors
        colors.add("Red");
        
        // 3 :: Add "Yellow" to color
        colors.add(0, "Yellow");
        
        // 4 :: tell use what the arrayList has
        System.out.println("The Array List contains the following colors:");
        
        // 5 :: Use for loop to print colors
        for (int i = 0; i <= colors.size() - 1; i++) {
            System.out.printf(" %s", colors.get(i)); 
        }
        
        // 7 :: Display color list
        display(colors, "%nDisplay Array List items %n");
        
        // 8 :: Add Green & Yellow to colors
        colors.add("Green");
        colors.add("Yellow");

        // 9 :: display colors 
        display(colors, "%nThe ArrayList with the new 2 items added %n");

        // 10 :: Remove the first instance of yellow & display colors
        colors.remove("Yellow");
        display(colors,"%nRemove the First Instance of Yellow from ArrayList%n");

        // 11 :: remove the color in the first index & display colors
        colors.remove(1);
        display(colors, "%nRemove the item at index 1 from ArrayList %n");

        // 12 :: declare colorFound & check if "red" is in colors
        String colorFound = "";
        colorFound = colors.contains("Red")?" color Found":" colors Not Found";
        System.out.printf("The color 'Red' is %s: %n", colorFound);

        // 13 :: print the size of colors
        System.out.printf("%nThe Size of the ArrayList is: %s %n", colors.size ());
        
        /*---Modifications---*/
        // 14 :: Add three colors into colors
        colors.add("Blue");
        colors.add("Grey");
        colors.add("Purple");
        
        // 15 :: Display colors
        display(colors, "%nDisplay Array List items %n");
        
        // 16 :: declare colorFound & check if "yellow" is in colors
        colorFound = colors.contains("Yellow")? "color Found": "colors Not Found";
        System.out.printf("The color 'Yellow' is %s: %n", colorFound);
        

    }

    // 2 :: Define display()
    public static void display(ArrayList<String>colors, String header) {
        // 1 :: Output header
        System.out.printf(header);

        // 2 :: 
        for (String color : colors) {
            System.out.printf(" %s", color);
        }
        System.out.println("");

    }
    
}
