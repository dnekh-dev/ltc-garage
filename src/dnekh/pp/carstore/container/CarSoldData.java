package dnekh.pp.carstore.container;

import dnekh.pp.carstore.carmodel.Vehicle;

import java.util.Map;

public class CarSoldData {

    private Map<String, Vehicle> carSoldData;

    public CarSoldData(Map<String, Vehicle> carSoldData) {
        this.carSoldData = carSoldData;
    }

    public void addSoldCar(Vehicle vehicle) {
        carSoldData.put(vehicle.getId(), vehicle);
    }

    public Vehicle getSoldCar(String id) {
        return carSoldData.get(id);
    }

    public Vehicle removeSoldCar(String id) {
        return carSoldData.remove(id);
    }

    public void displayAllSoldCars() {
        for (Vehicle vehicle : carSoldData.values()) {
            System.out.println(vehicle);
        }
    }

    @Override
    public String toString() {
        return "CarSoldData{" +
                "carSoldData=" + carSoldData +
                '}';
    }

    public Map<String, Vehicle> getCarSoldData() {
        return carSoldData;
    }

    public void setCarSoldData(Map<String, Vehicle> carSoldData) {
        this.carSoldData = carSoldData;
    }
}
