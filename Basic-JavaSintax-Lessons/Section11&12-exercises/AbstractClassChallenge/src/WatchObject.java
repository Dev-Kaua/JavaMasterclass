public class WatchObject extends ProductForSale{

    public WatchObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is one of our exclusive pieces!");
        System.out.printf("The price for this watch is %6.2f %n", price);
        System.out.println(description);
    }
}
