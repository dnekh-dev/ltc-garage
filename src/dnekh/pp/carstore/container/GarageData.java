package dnekh.pp.carstore.container;

import dnekh.pp.carstore.carmodel.Vehicle;

import java.util.Map;

public class GarageData {

    private Map<String, Vehicle> garageData;

    public GarageData(Map<String, Vehicle> garageData) {
        this.garageData = garageData;
    }

    public void addCar(Vehicle vehicle) {
        garageData.put(vehicle.getId(), vehicle);
    }

    public Vehicle getCar(String id) {
        return garageData.get(id);
    }

    public Vehicle removeCar(String id) {
        return garageData.remove(id);
    }

    public void displayAllCars() {
        for (Vehicle vehicle : garageData.values()) {
            System.out.println(vehicle);
        }
    }

    @Override
    public String toString() {
        return "GarageData{" +
                "garageData=" + garageData +
                '}';
    }

    public Map<String, Vehicle> getGarageData() {
        return garageData;
    }

    public void setGarageData(Map<String, Vehicle> garageData) {
        this.garageData = garageData;
    }
}
