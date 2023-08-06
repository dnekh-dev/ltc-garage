package dnekh.pp.carstore.container;

import dnekh.pp.carstore.ICarStorageManager;
import dnekh.pp.carstore.bluprintclasses.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class CarSoldData implements ICarStorageManager {

    private Map<String, Vehicle> carSoldData = new HashMap<>();



    @Override
    public void addCar(Vehicle vehicle) {
        carSoldData.put(vehicle.getId(), vehicle);
    }

    @Override
    public Vehicle getCar(String id) {
        return carSoldData.get(id);
    }

    @Override
    public void removeCar(String id) {
        carSoldData.remove(id);
    }

    @Override
    public void displayAllCars() {
        for (Vehicle vehicle : carSoldData.values()) {
            System.out.println(vehicle);
        }
    }

    //getters and setters section

    public Map<String, Vehicle> getCarSoldData() {
        return carSoldData;
    }

    public void setCarSoldData(Map<String, Vehicle> carSoldData) {
        this.carSoldData = carSoldData;
    }
}
