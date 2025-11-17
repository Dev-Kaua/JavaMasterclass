package model;

public class EletricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize;

    public EletricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("BEV -> switch %d kWh battery on, ready! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }
}
