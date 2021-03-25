package bankaccounttest;

public class BankAccount {
    // 1 :: Declare Var
    private String firstName;
    private String lastName;

    // 2 :: Define getFirstName
    public String getFirstName() {
        // 2.2 :: Return fistName
        return firstName;
    }

    // 3 :: Define setFirstName()
    public void setFirstName (String firstName){
        // 3.2 :: Store the parameter in firstName field
        this.firstName = firstName;
    }

    // 4 ::  Define getLastName()
    public String getLastName() {
        // 4.2 :: Return lastName
        return lastName;
    }

    // 5 :: Define setLastName()
    void setLastName(String userLastName) {
        // 5.2 :: Store the parameter in firstName field
        this.lastName = lastName;
    }


}
