package dnekh.pp.carstore;

import dnekh.pp.carstore.carmodel.Hyundai;
import dnekh.pp.carstore.carmodel.Kia;
import dnekh.pp.carstore.carmodel.Toyota;
import dnekh.pp.carstore.container.GarageData;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*GarageData garage = getGarageData();

        garage.displayAllCars();

        System.out.println("-------");

        System.out.println(garage.getCar("1112"));

        System.out.println("-------");

        garage.removeCar("1113");

        garage.displayAllCars();

        Set<String> keySet = garage.getGarageData().keySet();
        List<String> keyList = new ArrayList<>(keySet);

        for (String key : keyList) {
            System.out.println(key);
        }*/
    }

    /*private static GarageData getGarageData() {
        Toyota toyota1 = new Toyota("1111", "Sedan", "Toyota", "Camry", 2023,
                "Red", false, 54000);

        Toyota toyota2 = new Toyota("1112", "Sedan", "Toyota", "Corolla", 2022,
                "White", false, 44000);

        Toyota toyota3 = new Toyota("1113", "Sedan", "Toyota", "Crown", 2020,
                "Blue", true, 50500);

        Kia kia1 = new Kia("2111", "Sedan", "Kia", "K5", 2023,
                "Black", false, 453000);

        Hyundai hyundai1 = new Hyundai("3111", "Sedan", "Hyundai", "Sonata", 2022,
                "White", false, 42000);

        GarageData garage = new GarageData();
        garage.addCar(toyota1);
        garage.addCar(toyota2);
        garage.addCar(toyota3);
        garage.addCar(kia1);
        garage.addCar(hyundai1);
        return garage;
    }*/
}
