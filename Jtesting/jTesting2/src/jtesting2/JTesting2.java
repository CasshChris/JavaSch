package jtesting2;
import java.util.Scanner;

public class JTesting2 {

    public static void main(String[] args) {
        String testStr = "bool";
        String inStr = "";
        String testNum = "33";
        String inNum = "";
        
        System.out.println("Login");

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        inStr = input.nextLine();
        
        System.out.print("Password: ");
        inNum = input.nextLine();
        
        int c = 0;
        
        if (c <= 4) {
            if ( !(inStr.equalsIgnoreCase(testStr) && inNum.equalsIgnoreCase(testNum)) ) {
                System.out.println("Wrong, try again!");
                ++c;
                
                System.out.print("Username: ");
                inStr = input.nextLine();

                System.out.print("Password: ");
                inNum = input.nextLine();

                if( (inStr.equalsIgnoreCase(testStr) && inNum.equalsIgnoreCase(testNum))) {
                    System.out.println("Welcom!");
                }
                else if ( !(inStr.equalsIgnoreCase(testStr) && inNum.equalsIgnoreCase(testNum)) ) {
                    System.out.println("Sorry, try again later");
                }

            }
        }
    }
} 
