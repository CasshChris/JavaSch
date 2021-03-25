package commissionemployeetest;

public class CommissionEmployee extends Object {

        // 1) Declare the instance fields
        private final String firstName;
        private final String lastName;
        private final String socialSecurityNumber;
        
        /*Add 2 new Fields (Address and cellPhone of type String) to Commission Employee*/
        private double grossSales;  // this is gross weekly Sales
        private double commissionRate;  // commission Percentage// Create the Constructor for all the arguments above
        
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate ) {
        // 2) implicit call to Object default constructor occurs here
        // 3) Check if grossSales is invalid, then throw exception
        if (grossSales < 0.0 ) {
            throw new IllegalArgumentException ("Gross Sales Must be >= 0.0 " );        
        }         
            // 4) Check if commissionRate is invalid, then throw an exception         
            if (commissionRate <= 0.0 || commissionRate >= 1.0 ) {
                throw new IllegalArgumentException ("commissionRate Must be >= 0.0  and < 1.0" );
            }
        }
        
        // 5) Assign the values to the instantiated fields
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName(){
         return firstName;
    }

    public String getLastName(){
         return lastName;
    }

    public String getSocialSecurityNumber(){
         return socialSecurityNumber;
    }

    public void setGrossSales(double grossSales){
        if (grossSales < 0.0){
            throw new IllegalArgumentException ("Gross Sales Must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    // 6) Define and code the commissionRate method to set
    // the employee commissionRate
    public void setCommissionRate(double commissionRate){
        if (commissionRate <= 0.0 || commissionRate >= 1.0 ) {
            throw new IllegalArgumentException ("commissionRate Must be >= 0.0  and < 1.0" );
        }
    this.commissionRate = commissionRate;
    }

    // 7) Define and code the commissionRate method to get
    // the employee commissionRate
    public double getCommissionRate(){
        return commissionRate;
    }

    // 8) Define and code the tostring method of Commission Employee object
    // Indicate that this method overrides a superclass method
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "Commission employee:", firstName, lastName, "Social security number", socialSecurityNumber, "gross sales", grossSales, "commission Rate", commissionRate);
    }
}
}
