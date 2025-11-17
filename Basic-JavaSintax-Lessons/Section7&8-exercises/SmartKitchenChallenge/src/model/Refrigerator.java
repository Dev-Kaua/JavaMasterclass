package model;

public class Refrigerator extends Machine{


    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering food!");
            hasWorkToDo = false;
        }
    }
}
