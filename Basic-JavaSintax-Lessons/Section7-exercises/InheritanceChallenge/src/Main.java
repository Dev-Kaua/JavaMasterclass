import model.HourlyEmployee;
import model.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
        SalariedEmployee pandini = new SalariedEmployee("Gustavo Pandini", "23/11/2006",
                "10/12/2025", 31500.00);
        HourlyEmployee pedro = new HourlyEmployee("Pedro Balistieri", "27/10/2005",
                "19/10/2025", 21.50);

        System.out.println(pedro.toString());
        pedro.getDoublePay();

        System.out.println("\n\n" + pandini.toString());
        pandini.terminate("25/11/2026");
        pandini.retire();
        System.out.println("\n\nNew Pandini's toString: \n" + pandini.toString());

    }
}