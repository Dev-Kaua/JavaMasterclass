import model.Item;
import model.MealOrder;
import model.Sizes;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("coke", "drink", 1.50);
        coke.printItem();
        coke.setSize(Sizes.Large);
        coke.printItem();

        MealOrder deluxeMeal = new MealOrder("deluxe", "coke",
                "onion rings");
        deluxeMeal.addBurgerToppings("MEAT", "BACON", "LETTUCE", "CHEESE", "SALAMI");
        deluxeMeal.setDrinkSize(Sizes.Large);
        deluxeMeal.printItemizedList();
    }
}