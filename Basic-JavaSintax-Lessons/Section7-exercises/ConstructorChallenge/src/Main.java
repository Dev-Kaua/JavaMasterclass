import model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer custumer1 = new Customer("Walfred", 1000, "Walf@gmail.com");
        System.out.println(custumer1.getName());
        System.out.println(custumer1.getEmailAdress());
        System.out.println(custumer1.getCreditLimit());

        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAdress());
    }
}