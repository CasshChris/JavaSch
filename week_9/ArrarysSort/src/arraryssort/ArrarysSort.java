package arraryssort;
/*Arrays*/
// import Arrays class
import java.util.Arrays;

public class ArrarysSort {

    public static void main(String[] args) {
        // 1 :: Print Header
        System.out.println("Using for statement to print elements in array\n");
        
        // 2 :: Declare String Array
        String [] names = {"Mary", "David", "Bob", "Cathy", "Ziggy", "Adam"};
        
        // 3 :: Use for Statement
        for (int i = 0; i< names.length; ++i){
            System.out.println(names[i]);
        }
        
        System.out.println();
        
        // 4 :: Sort array
        Arrays.sort(names);
        
        // 5 :: Print Header
        System.out.println("Using Arrays.sort method to sotrt the array names\n");
        
        // 5 :: Use for Statement
        for (int i = 0; i< names.length; ++i){
            System.out.println(names[i]);
        }

    }
    
}
