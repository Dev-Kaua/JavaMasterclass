package model;

public class DishWasher extends Machine{

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("Washing the dishes...");
            hasWorkToDo = false;
        }
    }
}
