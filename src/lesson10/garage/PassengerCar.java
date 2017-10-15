package lesson10.garage;

/**
 * @author a.shestovsky
 */
public class PassengerCar extends Car {
    private int price;
    public PassengerCar(String brand, String model, int year, String colour, int price) {
        super(brand, model, year, colour, "passenger car");
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassengerCar car = (PassengerCar) o;

        if (getYear() != car.getYear()) return false;
        if (!getBrand().equals(car.getBrand())) return false;
        if (!getModel().equals(car.getModel())) return false;
        if (!getColour().equals(car.getColour())) return false;
        return price == car.price;
    }

    @Override
    public int hashCode() {
        int result = getBrand().hashCode();
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getYear();
        result = 31 * result + getColour().hashCode();
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return getColour() + " " + getCarType() + " " + getBrand() + " " + getModel() + ", " + getYear() + " release year"
                + "\nCurrent market price is " + price + "$";
    }

    public int getPrice() {
        return price;
    }

}