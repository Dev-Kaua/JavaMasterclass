import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    private static ArrayList<ProductForSale> productList = new ArrayList<>();


    public static void main(String[] args) {
        productList.add(new ArtObject("Oil painting", 1350, "Impressionistic work by" +
                " ABF painted in 2010"));
        productList.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced" +
                " in 1950"));
        productList.add(new WatchObject("Rolex", 4990, "Rolex Datejust, a entry" +
                " model in terms of price for a rolex"));
        productList.add(new WatchObject("Tommy Hilfiger", 149, "A silver made classic" +
                " model with dark blue work in it's background"));

        ArrayList<ProductForSale> orderItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Welcome to the store system");
        do {
            System.out.println("-".repeat(30));
            System.out.println("Insert a option:");
            System.out.println("1 - print all the products for sale");
            System.out.println("2 - print all the products in my Order list");
            System.out.println("3 - add an item to my order");
            System.out.println("4 - remove an item from my order");
            System.out.println("0 - exit");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    listProductsAvailiable();
                    break;
                case 2: {
                    if (orderItems.isEmpty()){
                        System.out.println("Your order list is empty...");
                    }else {
                        for (var item : orderItems){
                            System.out.println("-".repeat(30));
                            item.showDetails();
                        }
                    }
                    break;
                }
                case 3: {
                    listProductsAvailiable();
                    System.out.println("Insert the index of the item you wish to add: ");
                    int choosenItem = scanner.nextInt();
                    orderItems.add(productList.get(choosenItem));
                    break;
                }
                case 4: {
                    listProductsAvailiable();
                    System.out.println("Insert the index of the item you wish to remove: ");
                    int choosenItem = scanner.nextInt();
                    orderItems.remove(productList.get(choosenItem));
                    break;
                }
                case 0: {
                    System.out.println("Ending system...");
                    break;
                }
                default:
                    System.out.println("Please, select a valid option!");
                    break;
            }
        }while (option != 0);
    }

    public static void listProductsAvailiable(){
        int index = 0;
        for (var item : productList){

            System.out.println("-".repeat(30));
            System.out.println("Item index: " + index);
            item.showDetails();
            index++;
        }
    }

}
