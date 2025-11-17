import model.Printer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer(50, true);
        System.out.println("Initial page count = " + printer1.getPagesPrinted());

        int pagesPrinted = printer1.printPages(5);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesPrinted, printer1.getPagesPrinted());

        pagesPrinted = printer1.printPages(10);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesPrinted, printer1.getPagesPrinted());
    }
}