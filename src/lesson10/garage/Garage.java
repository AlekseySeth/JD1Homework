package lesson10.garage;

import java.util.HashMap;
import java.util.Map;

/**
 * @author a.shestovsky
 */
public class Garage {

    private Map<Car, Integer> carsInGarage = new HashMap<>();

    public Garage(Map<Car, Integer> carsInGarage) {
        this.carsInGarage = carsInGarage;
    }

    public Map<Car, Integer> getCarsInGarage() {
        return carsInGarage;
    }

    public void parkIntoGarage(Car car) {
        for (Car currentCar : carsInGarage.keySet()) {
            if (car.equals(currentCar)) {
                carsInGarage.put(currentCar, carsInGarage.get(currentCar) + 1);
                System.out.println(car.getBrand() + " " + car.getModel() + " is parked in garage");
                System.out.println("The same car was already in the garage. There are "+ carsInGarage.get(currentCar)
                                     + " such cars in the garage now");
                return;
            }
        }
        carsInGarage.put(car, 1);
        System.out.println(car.getBrand() + " " + car.getModel() + " is parked in garage");
    }

    public void driveOutFromGarage(Car car) {
        for (Car currentCar : carsInGarage.keySet()) {
            if (car.equals(currentCar)) {
                if (carsInGarage.get(currentCar) == 1){
                    System.out.println(car.getBrand() + " " + car.getModel() + " has left the garage. " +
                                        "There is no more such cars left in the garage");
                    carsInGarage.remove(currentCar);
                    return;
                } else {
                    carsInGarage.put(currentCar, carsInGarage.get(currentCar) - 1);
                    System.out.println(car.getBrand() + " " + car.getModel() + " has left the garage. "
                                       + "Only " + carsInGarage.get(currentCar) + " such cars left");
                    return;
                }
            }
        }
        System.out.println("There is no such car in the garage");
    }

    public int countCarsInGarage(Car car) {
        return carsInGarage.getOrDefault(car, 0);
    }

    @Override
    public String toString() {
        return "Cars in garage:\n"+ carsInGarage;
    }
}