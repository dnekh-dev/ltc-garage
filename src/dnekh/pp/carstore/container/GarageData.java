package dnekh.pp.carstore.container;

import dnekh.pp.carstore.ICarStorageManager;
import dnekh.pp.carstore.bluprintclasses.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class GarageData implements ICarStorageManager {

    private Map<String, Vehicle> garageData = new HashMap<>();

    @Override
    public void addCar(Vehicle vehicle) {
        getGarageData().put(vehicle.getId(), vehicle);
    }

    @Override
    public Vehicle getCar(String id) {
        return garageData.get(id);
    }

    @Override
    public void removeCar(String id) {
        garageData.remove(id);
    }

    @Override
    public void displayAllCars() {
        for (Vehicle vehicle : garageData.values()) {
            System.out.println(vehicle);
        }
    }

    //getters and setter block starts

    public Map<String, Vehicle> getGarageData() {
        return garageData;
    }

    public void setGarageData(Map<String, Vehicle> garageData) {
        this.garageData = garageData;
    }
}
