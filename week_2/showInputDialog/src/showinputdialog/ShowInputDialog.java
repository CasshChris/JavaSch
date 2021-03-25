/*
* Programmer: Student – Christian Alvarez
* Date: 02/03/2021
*/
package showinputdialog;
// 0 :: import JOptionPane
import javax.swing.JOptionPane;

public class ShowInputDialog {

    public static void main(String[] args) {
    // 1 :: Declare the variables to be used in the project        
    String firstName, lastName;        
    String strFirstNumber, strSecondNumber;        
    int firstNumber, secondNumber;        
    int Sum, Subraction, Product, Average;

    /*Prompts*/
    // 2 :: Prompt user for first Name
    firstName = JOptionPane.showInputDialog("Enter your First Name: ");

    // 2.1 :: Prompt user for last Name
    lastName = JOptionPane.showInputDialog("Enter your Last Name: ");

    // 4 :: Prompt user for first number
    strFirstNumber = JOptionPane.showInputDialog("Enter the First Integer Number: ");

    // 5 :: Prompt user for second number
    strSecondNumber = JOptionPane.showInputDialog("Enter the Second Integer Number: ");
    
    // 6 :: firstNumber = Integer.parseInt(strFirstNumber);
    firstNumber = Integer.parseInt(strFirstNumber);

    // 7 :: secondNumber = Integer.parseInt(strSecondNumber);
    secondNumber = Integer.parseInt(strSecondNumber);

    /*Calculations*/
    // 8 :: Calculate the sum of 2 numbers
    Sum = firstNumber + secondNumber;

    // 8.1 :: Calculate the Subtraction of 2 numbers
    Subraction = firstNumber - secondNumber;

    // 8.2 :: Calculate the Product of 2 Numbers
    Product = firstNumber * secondNumber;

    // 8.3 :: Calculate the Average of 2 numbers
    Average = (firstNumber + secondNumber) / 2;

    /*Output*/
    // 9 :: output sum
    JOptionPane.showMessageDialog(null,"The Sum of the Two Numbers = " + Sum + "\n" + "The Subtraction of the Two Numbers = " + Subraction + "\n" + "The Product of the Two Numbers = "
    + Product + "\n" + "The Average of the Two Numbers = " + Average);

    /*Cobiming*/
    // 10 :: Combine fisrName & lastName in fullName
    String fullName = firstName + " " + lastName;

    /*Output*/
    // 11 :: Output fullName & Sum
    JOptionPane.showMessageDialog(null,"Your Full Name is: "+ fullName + "\n" + "The Sum of " + firstNumber + " and " + secondNumber + " = " + Sum + "\n" + "The Subtraction of " + firstNumber + " and " + secondNumber + " = " + Subraction 
    + "\n" + "The Product of " + firstNumber + " and " + secondNumber + " = " + Product + "\n" + "The Average of " + firstNumber + " and " + secondNumber + " = " + Average);
    
    }
    
}
