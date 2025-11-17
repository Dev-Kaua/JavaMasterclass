package Model;

public class BankAccount {
    private int accountNumber;
    private double accountBallance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBallance() {
        return accountBallance;
    }

    public void setAccountBallance(double accountBallance) {
        this.accountBallance = accountBallance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositValue){
        if (depositValue >= 0){
            accountBallance += depositValue;
        }else {
            System.out.println("this deposit value is invalid.");
        }
    }

    public BankAccount(int accountNumber, double accountBallance, String customerName,
                       String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBallance = accountBallance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void withdrawFunds(double withdrawValue){
        if(withdrawValue <= accountBallance){
            accountBallance -= withdrawValue;
        }else{
            System.out.println("Your ballance is $"+ accountBallance + "\nIt is lower than $" + withdrawValue);
        }
    }

    public void showAccountStatus(){
        System.out.println("\n------ ACCOUNT STATUS ------\n");
        System.out.println("Account number: "+ accountNumber + "\nClient name: "+ customerName +
                "\nAccount ballance: $" + accountBallance + "\nEmail: "+ email +
                "\nPhone number: " + phoneNumber);
    }
}
