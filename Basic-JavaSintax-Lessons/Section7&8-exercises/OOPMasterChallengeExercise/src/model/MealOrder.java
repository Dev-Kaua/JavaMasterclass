package model;

public class MealOrder {
    private Burger hamburger;
    private Item drink;
    private Item sideItem;

    public MealOrder(){
        this("regular", "coke", "fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideItemType) {

        if (burgerType.equalsIgnoreCase("deluxe")){
            this.hamburger = new DeluxeBurger(burgerType, 8.5);
        }else {
            this.hamburger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item(drinkType, "drink", 1.0);
        this.sideItem = new Item(sideItemType, "side", 1.5);
    }

    public double getTotalPrice(){
        if (hamburger instanceof DeluxeBurger){
            return hamburger.getAdjustedPrice();
        }

        return hamburger.getAdjustedPrice() + drink.getAdjustedPrice() + sideItem.getAdjustedPrice();
    }

    public void printItemizedList(){
        hamburger.printItem();
        if (hamburger instanceof DeluxeBurger){
            Item.printItem(drink.getName(), 0);
            Item.printItem(sideItem.getName(), 0);
        }else {
            drink.printItem();
            sideItem.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE: $", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        hamburger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5){
        if (hamburger instanceof DeluxeBurger db){
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        }else {
            hamburger.addToppings(extra1, extra2, extra3);
        }
        hamburger.addToppings(extra1, extra2, extra3);
    }

    public void setDrinkSize(Sizes size){
        drink.setSize(size);
    }
}
