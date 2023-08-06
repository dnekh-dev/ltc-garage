package dnekh.pp.carstore;

import dnekh.pp.carstore.bluprintclasses.Vehicle;


public interface ICarStorageManager {

    void addCar(Vehicle vehicle);

    Vehicle getCar(String id);

    void removeCar(String id);

    void displayAllCars();
}
