/*
Project Name: CalculateBMI
This project calculates BMI (Body Mass Index)
The program prompts user to input the First and Last Name.
It also prompts the user to input the Weight in Pounds and Height in Feet and then Height again in Inches. It calculates the BMI and prints out whether the person is Normal or Overweight.
To calculate BMI = weight * 703 / (height * height);
If the calculated BMI is < 25, then the person is Normal and if the calculated BMI is > 25, then the person is Overweight.
Programmer: Student - Christian Alvarez
Date: 02/03/2021
*/
package calculatebmi;

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {
        // 1 :: Create the object input from class Scanner
        Scanner input = new Scanner (System.in);
        
        // 2 :: Print Header for the project
        System.out.println("******************");
        System.out.println("** Calculate BMI (Body Mass Index) **");
        System.out.println("** Normal is BMI Less or Equal to 25 **");
        System.out.println("** Overweight is BMI Greater than 25 **");
        System.out.println("******************\n");
        
        // 3 :: Declare the variables to be used
        String firstName, lastName, fullName;
        double weight;
        int heightInFeet;
        int heightInInches;
        double height;
        double bmi;
        
        // 4 :: Prompt user for first Name
        System.out.print("Enter your First Name: ");
        
        // 4.1 :: Read & store first name
        firstName = Input.nextLine();
        
        // 5 :: Prompt user for last Name
        System.out.print("Please, enter your Last Name: ");

        // 5.1 :: Read & store last name
        lastName = Input.nextLine();
        
        // 6 :: Prompt user for weight in pounds
        System.out.print("Enter your weight in pounds: ");

        // 6.1 :: Read & store weight
        weight = Input.nextDouble();
        
        // 7 :: Prompt user for height in feet
        System.out.print("Please, enter your Height in Feet: ");

        // 7.1 :: Read & store height in feet
        heightInFeet = input.nextInt();
        
        // 8 :: Prompt user for height in inches
        System.out.print("Enter your Remaining Height in Inches: ");

        // 8.1 :: Read & store for height in inches
        heightInInches = input.nextInt();
        
        // 9 :: Calculate the height in inches (1 feet = 12 inches)
        height = heightInFeet * 12 + heightInInches;
        
        // 10 :: Calculate BMI (Body Mass Index)
        bmi = weight * 703 / (height*height);
        
        // 11 :: Join first Name, space and last Name
        fullName = firstName + " " + lastName;
        
        // 12 :: Print BMI 
        System.out.printf("Your BMI is: %.2f %n",bmi);
        
        // 13 :: Check if the user is Normal
        if (bmi <= 25){
            System.out.println("You are Normal.");  
        }
        // 14 :: Check if the user is overweight
        if (bmi > 25){
            System.out.println("You are OverWeight.");
        }
        // 15 :: Print all the information using printf
        System.out.printf("%s. Your weight is %.2f pounds. "
                + "Your Height is %.2f inches %n"
                + "and your BMI is %.2f.%n", fullName, weight, height, bmi);
        
        // 16 :: Print the Footer of the project
        System.out.println();   // Prints a Blank line
        System.out.println("**************************");
        System.out.println("********* Porgrammer: Student - Christian Alvarez **************");
        System.out.println("**************************");
        
    }
}