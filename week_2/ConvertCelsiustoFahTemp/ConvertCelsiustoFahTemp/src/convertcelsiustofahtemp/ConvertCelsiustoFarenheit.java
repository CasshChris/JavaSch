/*
Purpose of the project: This interactive project will convert celsius
temperatures to Farenheit. It prompts the user to enter the celsius temperature
and it will be converted into farenhteit temperature and will be printed to console.
Project Name: Convert Celsius To Farenheit
Date: Monday 02-04-2021
Programmer Name: Student - Christian Alvarez
*/
package convertcelsiustofahtemp ;

// 0 :: Import all classes from java.util
import java.util.*;

public class ConvertCelsiustoFarenheit {
    
    public static void main(String[] args) {
    // 1 :: Header of the project
    System.out.println("***** Convert from celcius to fahrenheit *****");
    System.out.println("******* Programmer Name: Christian Alvarez *******");
    System.out.println("");
    
    // 2 :: Declare variables
    double celsius, fahrenheit;
    double celsius2, fahrenheit2;
    
    
    // 3 :: Create object Scanner class
    Scanner input = new Scanner(System.in);
    
    // 4 :: Prompt user for celsius temperature
    System.out.print("Please, enter temperature in celsius: ");
    
    // 4.1 :: Read & store calsius
    celsius = input.nextDouble();
    
    // 5 :: Calculate & covert fahrenheit to celsius
    fahrenheit = (celsius * 9.0 / 5.0) + 32;
    
    // 6 :: Print out convertion to console
    System.out.println("Based on the celsius temperature given, the fahrenheit "
            + "temperature is: " + fahrenheit);
    
    // 7 :: Prompt user for fahrenheit temperature
    System.out.print("Please, enter temperature in fahrenheit: ");
    
    // 7.1 :: Read & store fahrenheit2
    fahrenheit2 = input.nextDouble();
    
    // 8 :: Calculate & convert celsius to fahrenheit
    celsius2 = (fahrenheit2 - 32) * 5.0 / 9.0;
    
    // 9 :: Print celsius
    System.out.println("Based on the fahrenheit temperature given, the celsius "
            + "temperature is: " + celsius2);
    
    // 10 :: Print blank line
    System.out.println("");
    
    // 11 :: Footer of the project
    System.out.println("");
    System.out.println("************* End of the project *************");
    System.out.println("***** Programmer Name: Christian Alvarez *****");
    }
    
}
