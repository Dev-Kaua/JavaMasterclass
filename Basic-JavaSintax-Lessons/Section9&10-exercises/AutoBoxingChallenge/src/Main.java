import model.Bank;
import model.Branch;
import model.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob", 1000.0);
        System.out.println(bob);

        Branch mastercard = new Branch("Mastercard");
        mastercard.addCustomerTransaction("Bob", 1500);

        Bank itau = new Bank("Itau");
        itau.addBranch("Mastercard");
        itau.addCustomer("Mastercard", "Bob", 2000);
        System.out.println(itau);
    }
}