package model;

public class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.printf("All %d cylinders have been fired up, Ready! %n", cylinders);
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}
