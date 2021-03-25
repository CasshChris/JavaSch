/*This is the test program*/
package commissionemployeetest;

public class CommissionEmployeeTest {
    
    public static void main(String[] args) {
        // 1) Instantiate a new object employee from class Commission Employee        
        CommissionEmployee employee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        /*        // 2) Modify the project to add 2 more employees
            CommissionEmployee employee2 = new CommissionEmployee
            ("Mary", "Smith", "555-55-5555", 9500, .04);
            // Also add another object employee3 and data about you        
        */        
        // 2) Get commission Employee Data        
        System.out.println("Employee Information obtained by Get Methods:\n");      
        System.out.printf("%s %s%n", "First Name is: ", employee.getFirstName() );    
        System.out.printf("%s %s%n", "Last Name is: ", employee.getLastName() );     
        System.out.printf("%s %s%n", "Social Security Number is: ",                 
        employee.getSocialSecurityNumber() );     
        System.out.printf("%s %.2f%n", "Gross Sales is: ", employee.getGrossSales() );    
        System.out.printf("%s %.2f%n", "Commission Rate is: ",                 
        employee.getCommissionRate() );     
        employee.setGrossSales(5000);     
        employee.setCommissionRate(.1);     
        System.out.printf("%n%s: %n%n%s%n", "Update employee info obtained by toString", employee);
        /* System.out.printf("%n%s: %n%n%s%n",        
        "Update employee info obtained by toString", employee2);        
        Also create 2 methods to print the headings and footers        */    
    }
}