package model;

public class Car {
    protected String description;
    protected boolean isCarOn;
    protected int odometerInKM;
    protected boolean isCarRunning;
    protected boolean isEngineRunning;

    public Car(String description) {
        this.odometerInKM = 0;
        this.isCarRunning = false;
        this.isEngineRunning = false;
        this.isCarOn = false;
        this.description = description;
    }

    public void startEngine(){
        isCarOn = true;
        System.out.println("Engine started!");
    }

    public void drive(){
        if(!isCarOn){
            System.out.println("You need to turn on the car first");
            return;
        } else if (isCarRunning) {
            System.out.println("Car is already driving forward");
            return;
        }
        isCarRunning = true;
        runEngine();
        System.out.println("Car "+ getClass().getSimpleName() + " started running!");
    }



    protected void runEngine(){
        if(isEngineRunning){
            System.out.println("Engine is already running...");
            return;
        }
        isEngineRunning = true;
        System.out.println("Engine started running!");
    }
}
