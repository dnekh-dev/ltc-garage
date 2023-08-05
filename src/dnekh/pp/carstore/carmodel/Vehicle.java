package dnekh.pp.carstore.carmodel;

public abstract class Vehicle {

    private String id;
    private String carClass;
    private String carManufacturer;
    private String carModel;
    private int yearOfCarManufacturer;
    private String color;
    private boolean isUsed;
    private int carPrice;

    public Vehicle(String carClass, String carManufacturer, String carModel, int yearOfCarManufacturer, String color, boolean isUsed, int carPrice) {
        this.carClass = carClass;
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.yearOfCarManufacturer = yearOfCarManufacturer;
        this.color = color;
        this.isUsed = isUsed;
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "carClass='" + carClass + '\'' +
                ", carManufacturer='" + carManufacturer + '\'' +
                ", carModel='" + carModel + '\'' +
                ", yearOfCarManufacturer=" + yearOfCarManufacturer +
                ", color='" + color + '\'' +
                ", isUsed=" + isUsed +
                ", carPrice=" + carPrice +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getYearOfCarManufacturer() {
        return yearOfCarManufacturer;
    }

    public void setYearOfCarManufacturer(int yearOfCarManufacturer) {
        this.yearOfCarManufacturer = yearOfCarManufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }
}
