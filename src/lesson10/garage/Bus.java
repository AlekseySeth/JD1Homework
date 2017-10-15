package lesson10.garage;

/**
 * @author a.shestovsky
 */
public class Bus extends Car {
    private int passengerCapacity;
    public Bus(String brand, String model, int year, String colour, int passengerCapacity) {
        super(brand, model, year, colour, "bus");
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bus car = (Bus) o;

        if (getYear() != car.getYear()) return false;
        if (!getBrand().equals(car.getBrand())) return false;
        if (!getModel().equals(car.getModel())) return false;
        if (!getColour().equals(car.getColour())) return false;
        return passengerCapacity == car.passengerCapacity;
    }

    @Override
    public int hashCode() {
        int result = getBrand().hashCode();
        result = 33 * result + getModel().hashCode();
        result = 33 * result + getYear();
        result = 33 * result + getColour().hashCode();
        result = 33 * result + passengerCapacity;
        return result;
    }

    @Override
    public String toString() {
        return getColour() + " " + getCarType() + " " + getBrand() + " " + getModel() + ", " + getYear() + " release year"
                + "\nCapacity is " + passengerCapacity + " passengers";
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}