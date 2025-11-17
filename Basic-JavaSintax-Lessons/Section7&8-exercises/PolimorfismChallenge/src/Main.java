import model.Car;
import model.EletricCar;
import model.GasPoweredCar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car ferrari = new GasPoweredCar("2022 ferrari 296 GTS", 15.4, 12);
        Car tesla = new EletricCar("2020 tesla model 3", 568, 75);

        runRace(ferrari);
        runRace(tesla);

    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}