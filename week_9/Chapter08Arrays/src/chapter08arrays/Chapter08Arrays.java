/**
 * Project Name: Chapter 08 Arrays
 * Programmer: Student - Christian Alvarez
 * Date: 03-19-2021
 */
package chapter08arrays;

public class Chapter08Arrays {

    public static void main(String[] args) {
        // 
        String [] daysOfWeek = {"Monday", "Tuesday", "Wedneaday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};

        int [] scores = {100, 77, 99, 88, 55, 44, 66, 58, 84};

        System.out.println("I will print the days of the week\n");
        
        for ( int i = 0; i < 7; ++i){
            System.out.println(daysOfWeek[i]);
        }

        System.out.println();

        System.out.println("I will print the scores\n");
        
        for ( int s = 0; s < 7; ++s){
            System.out.println(scores[s]);
        }

        System.out.println();

        System.out.println("Use .length property to print the days of the week\n");
        
        for ( int i = 0; i < daysOfWeek.length; ++i){
            System.out.println(daysOfWeek[i]);
        }

        System.out.println();
        
        System.out.println("Use .length property to print the scores\n");
        
        for ( int s = 0; s < scores.length; ++s){
            System.out.println(scores[s]);
        }

        System.out.println();
        
        System.out.println("Print Array using enhanced for statement\n");

        for (String day : daysOfWeek){
            System.out.println(day);
        }

        System.out.println();
        
        System.out.println("Print Array using enhanced for statement\n");

        for (int score : scores){
            System.out.println(score);
        }
    }
}
