/*
 * Project Name: MCQuizUsingMethods
 * Programmer: Student - Christian Alvarez
 * Date: 03-11-2021
 */

package mcquizusingmethods;
// i :: import Scanner
import java.util.Scanner;

public class MCQuizUsingMethods {
    // g.1 :: Declare Global Variables
    public static String answer = "";
    public static int correctAnswersCount = 0;
    public static int wrongAnswersCount = 0;
    public static int numberOfQuestions = 0; 
    public static int score = 0;

    // g.2 :: Create global Scanner object
    public static Scanner input = new Scanner(System.in);
    
    // 1 :: Define main class
    public static void main(String[] args) {
        // 1 :: Call headers
        printHeaders();

        // 2 :: Call question, answers, & then calculate the scores
        questionsAndAnswers();
        calculateStudentScore();

        // 3 :: Call footers
        printFooters();

    }

    // 2 :: Define printHeaders()
    public static void printHeaders() {
        // 1 :: output Header
        System.out.println("*******************************************************************");
        System.out.println("****** Java Programming Language" + " Multiple Choice Test ********");
        System.out.println("**Read Questions carefully, enter Correct answer" +
        " Letters (a,b,c,d)**");
        System.out.println("****************************************");
        System.out.println();
    }

    // 3 :: Define questionsAndAnswers()
    public static void questionsAndAnswers() {
        // 1 :: 
        answer = question1();
        answer = checkForValidAnswer(answer);

        checkAnswer1(answer);

        answer = question2();
        answer = checkForValidAnswer(answer);

        checkAnswer2(answer);

    }

    // 4 :: Define question1()
    public static String question1() {
        // 1 :: prompt user with question
        System.out.println("Q1-Every Statement in Java language must" + " terminate with: ");
        System.out.println(" \t a. Semi Colon ; ");
        System.out.println(" \t b. Comma , ");
        System.out.println(" \t c. Period . ");
        System.out.println(" \t d. Question Mark ? ");
        System.out.println();
        
        // 2 :: prompt user for answer & store in answer
        System.out.print("Enter the letter (a, b, c, d) for correct Answer: ");
        answer = input.nextLine();
        
        // 3 :: output answer
        System.out.println("The Answer is: "+ answer);
        return answer;
    }
    
    // 5 :: Define question2()
    public static String question2() {
        // 1 :: prompt user with question
        System.out.println("Q2 - Block Comments in Java language are: "); System.out.println(" \t a. // ......... // ");
        System.out.println(" \t b. /* ......... */ ");
        System.out.println(" \t c. ?? ......... ?? ");
        System.out.println(" \t d. ##.......... ## ");
        System.out.println();
        
        // 2 :: prompt user for answer & store in answer
        System.out.print("Enter the letter (a, b, c, d) for correct Answer: ");
        answer = input.nextLine();
        
        // 3 :: output answer
        return answer;
        
    }

    // 6 :: Define checkForValidAnswer()
    public static String checkForValidAnswer(String Answer) {
        // 1 :: define while loop
        while ( !((answer.equalsIgnoreCase("A")) || answer.equalsIgnoreCase("B")) || (answer.equalsIgnoreCase("C") ) || (answer.equalsIgnoreCase("D")) ) {
            // 2 :: let user know their answer is incorrect
            System.out.println("*********** Invalid Answer ************" );

            // 3 :: prompt user for correct answer & store in answer
            System.out.print("Please, Enter the letter (a, b, c, d) for correct Answer: ");
            answer = input.nextLine();
        }
        // 4 :: return answer
        return answer;

    }

    // 7 :: Define checkAnswer1()
    public static void checkAnswer1(String answer) {
        if (answer.equalsIgnoreCase ("a") ) {
            System.out.printf("Your Answer '%s' is Correct.", answer); correctAnswersCount++;
            }
        else {
            System.out.printf("Your Answer '%s' is Wrong.", answer);
            wrongAnswersCount++; 
        }

        // 
        System.out.println();
        System.out.println("*************************************");
    }

    // 8 :: Define checkAnswer2()
    public static void checkAnswer2(String answer) {
        if (answer.equalsIgnoreCase ("b") ) {
            System.out.printf("Your Answer '%s' is Correct.", answer);
            correctAnswersCount++;

        }
        else {
            System.out.printf("Your Answer '%s' is Wrong.", answer);
            wrongAnswersCount++;

        }

        System.out.println(); System.out.println("****************************************");

    }

    // 9 :: Define calculateStudentScore()
    public static void calculateStudentScore() {
        // 1 :: Calculate number questions
        numberOfQuestions = correctAnswersCount + wrongAnswersCount;
        
        // 2 :: output quiz data
        System.out.printf("Total Number of Questions = %d. %n", numberOfQuestions);
        System.out.printf("Total Number of Correct Answers = %d. %n", correctAnswersCount);
        System.out.printf("Total Number of Wrong Answers = %d. %n", wrongAnswersCount);

        // 3 :: Calculate score
        score = (100 / numberOfQuestions) * correctAnswersCount;

        // 4 :: Check if user passed
        if (score >= 70) {
            System.out.printf("Congratulations. You Passed the Quiz" + " with a Score of %d. %n", score );
        }
        else {
            System.out.printf("Sorry. You Failed the Quiz" + " with a Score of %d. %n", score);
        }
    }

    // 10 :: Define printFooters()
    public static void printFooters() {
        // 1 :: output Footer
        System.out.println();
        System.out.println("**********************************************************");
        System.out.println("***************** End Of Quiz Project ********************");
        System.out.println("******** Programmer: Student - Christian Alvarez *********");
        System.out.println("**********************************************************");
    }
    
}
