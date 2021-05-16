/* 
 * Preject Name: PrintMultiplicationTable
 * Programmer: Student - Christian Alvarez
 * Date: 04-15-2021
 */
package printmultiplicationtable;

public class PrintMultiplicationTable {

    public static void main(String[] args) {
        // 1 :: 
        System.out.println("\n********* Printing Multiplication Table **********\n");
        
        // 2 :: 
        for (int row = 1; row <= 10; ++row) {
            for (int column = 1; column <= 10; ++column) {
                System.out.printf("%5d",row * column);
            }
            System.out.println();
        }

        System.out.println("\n************** End of Program ********************\n");
        System.out.println("**** Programmer: Student - Christian Alvarez *****\n\n");
        
    }

}