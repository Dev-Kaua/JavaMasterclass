package model;

public class Item {
    private String name;
    private Sizes size = Sizes.Medium;
    private String type;
    private double price;

    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice(){
        return switch (size){
            case Small -> getBasePrice() - 0.5;
            case Large -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public static void printItem(String name, double price){
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }
}
