import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        System.out.println("-".repeat(7) + " Welcome to the grocery store list application "
                + "-".repeat(7));
        System.out.println("Please, select a option to continue: ");
        int option;
        do {
            System.out.println("0 - to shutdown\n" +
                    "1 - to add item(s) to list (comma delimited list)\n" +
                    "2 - to remove any items (comma delimited list\n" +
                    "Enter a number for which action you want to do:");
            option = scanner.nextInt();
            switch (option){
                case 0: continue;
                case 1: {
                    String[] temporaryList = selectingItems();
                    groceryList.addAll(List.of(temporaryList));
                    System.out.println("Elements added: " + Arrays.toString(temporaryList));
                    System.out.println("-".repeat(30) + "\nYour full grocery list now is: \n" +
                            groceryList.toString());
                    continue;
                }
                case 2: {
                    String[] temporaryList = selectingItems();
                    groceryList.removeAll(List.of(temporaryList));
                    System.out.println("Elements removed: " + Arrays.toString(temporaryList));
                    System.out.println("-".repeat(30) + "\nYour full grocery list now is: \n" +
                            groceryList.toString());
                    continue;
                }
                default:
                    System.out.println("Select a valid option.");
                    continue;
            }

        }while (option != 0);

        System.out.println("-".repeat(7) + " Thanks for using the grocery store list application! "
                + "-".repeat(7));
    }

    private static String[] selectingItems(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please, insert the items separated by commas: ");
        String input = s.nextLine().toUpperCase();

        return input.split(",");
    }
}