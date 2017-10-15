package lesson10.garage;

/**
 * @author a.shestovsky
 */
public class RacingCar extends Car {
    private int maxSpeed;
    public RacingCar(String brand, String model, int year, String colour, int maxSpeed) {
        super(brand, model, year, colour, "racing car");
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RacingCar car = (RacingCar) o;

        if (getYear() != car.getYear()) return false;
        if (!getBrand().equals(car.getBrand())) return false;
        if (!getModel().equals(car.getModel())) return false;
        if (!getColour().equals(car.getColour())) return false;
        return maxSpeed == car.maxSpeed;
    }

    @Override
    public int hashCode() {
        int result = getBrand().hashCode();
        result = 34 * result + getModel().hashCode();
        result = 34 * result + getYear();
        result = 34 * result + getColour().hashCode();
        result = 34 * result + maxSpeed;
        return result;
    }

    @Override
    public String toString() {
        return getColour() + " " + getCarType() + " " + getBrand() + " " + getModel() + ", " + getYear() + " release year"
                + "\nMaximum speed is " + maxSpeed + "km/h";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}