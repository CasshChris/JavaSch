/*
 * Project Name: CalculateSumUsingMethods
 * Programmer: Student - Christian Alvarez
 * Date: 03-11-2021
 */


package calculatesumusingmethods;

public class CalculateSumUsingMethods {

    // 1 :: Define Main class
    public static void main(String[] args) {
        // 1 :: Call Header
        printHeadings();
        
        // 2 :: Declare Variables
        int firstNumber = 10;
        int secondNumber = 2;
        int result;
        
        // 3 :: Calculate Sum & output to result
        result = calculateSum(firstNumber, secondNumber); // Call calculateSum()
        System.out.printf("The Sum of %d and %d is = %d. %n", firstNumber, secondNumber, result);
        
        // 4 :: Calculate Difference & output to result
        result = calculateDifference(firstNumber, secondNumber); // Call calculateDiffernce()
        System.out.printf("The Difference is %d. %n", result);

        // 5 :: Calculate Product & output to result        
        result = calculateProduct(firstNumber, secondNumber); // Call calculateProduct()
        System.out.printf("The Product is %d. %n", result);
        
        // 6 :: Calculate Division & output to result        
        result = calculateDivision(firstNumber, secondNumber); // Call calculateDivision()
        System.out.printf("The Quotient is %d. %n", result);
        
        // 7 :: Calculate Average & output to result        
        result = calculateAverage(firstNumber, secondNumber); // Call calculateAverage()
        System.out.printf("The Average is %d. %n", result);
        
    }
    
    // 2 :: Define printHeadings()
    public static void printHeadings() {
        // 1 :: Print Header
        System.out.println("**Using Methods in Java Language**");
        System.out.println();
        
    }
    
    // 3 :: Define calculateSum()
    public static int calculateSum(int n1, int n2) {
        // 1 :: Define Sum
        int sum;

        // 2 :: Calculate Sum & return Sum
        sum = n1 + n2;
        return sum;
        
    }
    
    // 4 :: Define calculateDifference()
    public static int calculateDifference(int n1, int n2) {
        // 1 :: Define 
        int difference;

        // 2 :: Calculate Difference & return Difference
        difference = n1 - n2;
        return difference;
        
    }
    
    // 5 :: Define calculateProduct()
    public static int calculateProduct(int n1, int n2) {
        // 1 :: Define Product
        int product;
        
        // 2 :: Calculate Product & return Product
        product = n1 * n2;
        return product;
        
    }
    
    // 6 :: Define calculateDivision()
    public static int calculateDivision(int n1, int n2) {
        // 1 :: Define Division
        int division;
        
        // 2 :: Calculate Division & return Division
        division = n1 / n2;
        return division;
        
    }
    
    // 7 :: Define calculateAverage()
    public static int calculateAverage(int n1, int n2) {
        // 1 :: Define Average
        int average;
        
        // 2 :: Calculate Average & return Average
        average = (n1 + n2) / 2;
        return average;
         
    }
    
}
