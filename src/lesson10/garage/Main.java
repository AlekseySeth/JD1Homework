package lesson10.garage;

import java.util.HashMap;
import java.util.Map;

/**
 * @author a.shestovsky
 */
public class Main {
    public static void main(String[] args) {
        Car audiA6 = new PassengerCar("Audi", "A6", 2003, "Black", 15000);
        Car maz6501 = new Truck("MAZ", "6501", 2016, "White", 3500);
        Car neoplanSkyliner = new Bus("Neoplan", "Skyliner", 2010, "Blue", 84);
        Car ferrari = new RacingCar("Ferrari", "SF70H", 2016, "Red", 450);

        Map<Car, Integer> defaultCars = new HashMap<>();
        defaultCars.put(audiA6, 2);
        defaultCars.put(maz6501, 1);
        defaultCars.put(neoplanSkyliner, 1);
        defaultCars.put(ferrari, 1);

        Garage garage = new Garage(defaultCars);
        System.out.println(garage.toString());

        garage.parkIntoGarage(new PassengerCar("Volkswagen", "Passat", 1998, "Green", 6000));
        garage.parkIntoGarage(new PassengerCar("Volkswagen", "Passat", 1998, "Green", 6000));
        garage.parkIntoGarage(ferrari);

        garage.driveOutFromGarage(new PassengerCar("Volkswagen", "Passat", 1998, "Green", 6000));
        garage.driveOutFromGarage(new PassengerCar("Volkswagen", "Passat", 1998, "Green", 6000));

        System.out.println("Auidi A6 number of cars is " + garage.countCarsInGarage(audiA6));
    }
}