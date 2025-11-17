package model;

public class HybridCar extends Car{
    private double avgKmPerLiter;
    private int cylinders;
    private int batterySize;

    public HybridCar(String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("All %d cylinders have been fired up, Ready! %n", cylinders);
        System.out.printf("BEV -> switch %d kWh battery on, ready! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}
