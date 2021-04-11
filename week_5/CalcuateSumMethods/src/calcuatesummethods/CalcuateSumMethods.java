package calcuatesummethods;
/*Scanner*/
//0 :: Import Scanner
import java.util.Scanner;

public class CalcuateSumMethods {
    //1) Create a Global 'input' object for Scanner class
    public static Scanner input = new Scanner(System.in);
    // 2) Declare Global static variables to be used by all methods
    public static String firstName;
    public static String lastName;
    public static int firstNumber, secondNumber;
    public static int result;

    public static void main(String[] args) {
        //1) Call printHeadings() methodsto print the headings
        printHeadings();

        //2) Call promptUserForInput() methodsto prompt user for input
        promptUserForInput();

        // 3) Call the calculateSum() methodto find sum of the numbers
        calculateSum();

        // 4) Call the subtract() methodto subtract the numbers
        calculateSubtract();

        //5) Call printFootings() methodto print the footers
        printFootings();

    }  
        // End of main() method
    // 1) Define and Code printHeadings() method
    public static void printHeadings() {
        System.out.println("\n Calculate Sum of 2 Numbers using Methods \n");
    }
        // 2) Define and Code promptUserForInput() method
        public static void promptUserForInput() {
            //3) Prompt the user to Enter his/her First Name
            System.out.print("Enter your First Name: ");

            //4) Read what user typed on keyboard & store in First Name variable
            firstName = input.nextLine();

            //5) Echo back what the user entered
            System.out.println("Your First Name is : " + firstName);

            //6) Prompt the user to Enter his/her First Name
            System.out.print("Enter your Last Name: ");

            //7) Read what user typed on keyboard & store in Last Name variable
            lastName = input.nextLine();

            //8) Echo back what the user entered
            System.out.println("Your Last Name is : " + lastName);

            //9) Prompt the user to Enter the First Number
            System.out.print("Enter the First Number: ");

            //10) Read what user typed on keyboard & store in First Number variable
            firstNumber = input.nextInt();

            //11) Echo back what the user entered
            System.out.println("Your First Number is : " + firstNumber);

            //12) Prompt the user to Enter the Second Number
            System.out.print("Enter the Second Number: ");

            //13) Read what user typed on keyboard & store in First Number variable
            secondNumber = input.nextInt();

            //14) Echo back what the user entered
            System.out.println("Your Second Number is : " + secondNumber);
        }

            // 3) Define and Code sum() methodto sum the numbers
            public static void calculateSum() {
                //15) Find the Sum of the two numbers
                result = firstNumber + secondNumber;

                //16) Print out First and Last name
                System.out.println("The user Full Name is: " + firstName + " " + lastName);
                //17) Print out the Sum of the First and Second Numbers
                System.out.println("The Sum of the two numbers is: " + result);
            }

            // 4) Define and Code the subtract() method
            public static void calculateSubtract() {
                //15) Find the Subtraction of the two numbers
                result = firstNumber -secondNumber;
                //16) Print out First and Last name(Full Name)
                System.out.println("The user Full Name is:"+firstName+" "+lastName);
                //17) Print out the Sum of the First and Second Numbers
                System.out.println("The Subtraction of the two numbers is: " + result);
            }

            // 5) Define and Code printFootings() method
            public static void printFootings() {
                System.out.println("\n******** End Of Project *********\n");
            }
}
