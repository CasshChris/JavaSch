package cartest;
/*Car*/
/*Scanner*/
// 0 :: import Scanner
import java.util.Scanner;

/*Car Class*/
public class Car {
    /*Private Variables*/
    // 1 :: Declare private instance
    private String make;
    private String model;
    private int year;
    
    /*Scanner*/
    // 2 :: Create Scanner
    Scanner input = new Scanner(System.in);

    /*Car Class*/
    // 3 :: Create 3 parameters 
    public Car(String make, String model, int year) {
        this.make = make;   // this is the keyword for current objects
        this.model = model;
        this.year = year;
    }

    // 4 :: Define getMake()
    public String getMake() {
        return this.make;
    }

    // 5 :: Define gerModel)
    public String getmodel() {
        return this.model;
    }

    //6 :: Define getYear()
    public int getYear() {
        return this.year;
    }

    // 7 :: Define setModel()
    public void setModel(String model) {
        this.model = model;
    }

    // 8 :: Define setMake()
    public void setMake(String make) {
        this.make = make;
    }

    // 9 :: Define getYear()
    public void setYear(int year) {
        while (year < 2000 || year > 2021) {
            System.out.print("please Enter a valid year (between 200 & 2021): ");
            year = input.nextInt();
        }
        this.year = year;
    }

    // 10 :: Use toString() to format
    public String toString(){       
        System.out.println();       
        return this.make + " " + this.model + " " + Integer.toString(this.year);
    }


}
