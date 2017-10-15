package lesson10.garage;

/**
 * @author a.shestovsky
 */
public class Car {
    private String brand;
    private String model;
    private int year;
    private String colour;
    private String carType;

    protected Car(String brand, String model, int year, String colour, String carType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.carType = carType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public String getCarType() {
        return carType;
    }

}