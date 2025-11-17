import Model.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(001, 0, "Jeff",
                "BigJeff@gmail.com", "(47) 99283-2211");

        bankAccount1.showAccountStatus();

        bankAccount1.withdrawFunds(300);
        bankAccount1.depositFunds(5250);
        bankAccount1.withdrawFunds(433.85);

        bankAccount1.showAccountStatus();
    }
}