/**
 * Project Name: Date & Time
 * Programmer: Student - Christian Alvarez
 * Date: 02-01-2021
 */
package dateandtime;
// import Date & SimpleDateFormat
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateAndTime {

    public static void main(String[] args) {
        //1) Create an instance object called ‘dateFormat’ from class SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        
        //2) Create an instance object called ‘date’ from the class Date
        Date date = new Date();
        
        // 3) Print out the Date
        System.out.println(date);
        
        // 4) Print out the dateFormat               
        System.out.println(dateFormat.format(date));
        
        // prints in format 02/03/2019
        //5) Create an instance object calledtimeFormat from classSimpleDateFormat
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        
        // 4) Print out the timeFormat
        System.out.println(timeFormat.format(date)); // prints in format 22:57:40
    }
    
}
