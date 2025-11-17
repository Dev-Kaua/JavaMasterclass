package model;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenState(boolean coffeeFlag, boolean iceBoxFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(iceBoxFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

}
