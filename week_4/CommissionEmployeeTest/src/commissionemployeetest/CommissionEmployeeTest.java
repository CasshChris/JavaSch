/*
 * Project Name: Commission Employee Test
 * Programmer: Student - Christian Alvarez
 * Date: 03-25-2021
 */
package commissionemployeetest;

public class CommissionEmployeeTest {

    public static void main(String[] args) {
        // 1 :: 
        CommissionEmployee employee = new CommissionEmployee ("Sue", "Jones", "222-22-2222", 10000, .06);

        System.out.println("Employee Information obtained by Get Methods:\n"); System.out.printf("%s %s%n", "First Name is: ", employee.getFirstName() );
        System.out.printf("%s %s%n", "Last Name is: ", employee.getLastName() );
        System.out.printf("%s %s%n", "Social Security Number is: ", employee.getSocialSecurityNumber() );
        System.out.printf("%s %.2f%n", "Gross Sales is: ", employee.getGrossSales() );
        System.out.printf("%s %.2f%n", "Commission Rate is: ", employee.getCommissionRate() );
        employee.setGrossSales(5000); employee.setCommissionRate(.1);
        System.out.printf("%n%s: %n%n%s%n", "Update employee info obtained by toString", employee);
    
}
