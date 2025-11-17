package model;

public class CoffeeMaker extends Machine{

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}
