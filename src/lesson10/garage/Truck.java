package lesson10.garage;

/**
 * @author a.shestovsky
 */
public class Truck extends Car {
    private int carryingCapacity;
    public Truck(String brand, String model, int year, String colour, int carryingCapacity) {
        super(brand, model, year, colour, "truck");
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truck car = (Truck) o;

        if (getYear() != car.getYear()) return false;
        if (!getBrand().equals(car.getBrand())) return false;
        if (!getModel().equals(car.getModel())) return false;
        if (!getColour().equals(car.getColour())) return false;
        return carryingCapacity == car.carryingCapacity;
    }

    @Override
    public int hashCode() {
        int result = getBrand().hashCode();
        result = 32 * result + getModel().hashCode();
        result = 32 * result + getYear();
        result = 32 * result + getColour().hashCode();
        result = 32 * result + carryingCapacity;
        return result;
    }

    @Override
    public String toString() {
        return getColour() + " " + getCarType() + " " + getBrand() + " " + getModel() + ", " + getYear() + " release year"
                + "\nCarrying capacity is " + carryingCapacity + "kg";
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}