package dnekh.pp.carstore;

import dnekh.pp.carstore.carmodel.Hyundai;
import dnekh.pp.carstore.carmodel.Kia;
import dnekh.pp.carstore.carmodel.Toyota;
import dnekh.pp.carstore.client.Customer;
import dnekh.pp.carstore.container.CustomerData;
import dnekh.pp.carstore.container.GarageData;
import dnekh.pp.carstore.container.StaffData;
import dnekh.pp.carstore.employee.Position;
import dnekh.pp.carstore.employee.staff.Employee;
import dnekh.pp.carstore.employee.staff.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Manager manager1 = new Manager("E101", "Mors", "Super", 7, "89089955453",
                "super_mors@super.com", 57500.);

        Employee employee1 = new Employee("E002", "Vasya", "Dubenko", 36, "8935017233",
                "super_vasya@super.com", 42000.);

        Employee employee2 = new Employee("E003", "Dmitrii", "Moskovchenko", 37, "8914556728",
                "super_moskovchenko@super.com", 45500.);

        Customer customer1 = new Customer("C0001", "Dmitrii", "Nekh", 37, "01024555453",
                "dnekh@mail.com");

        Customer customer2 = new Customer("C0002", "Aleksandr", "Duxanov", 35, "8908762416",
                "dux@mail.com");

        Toyota toyota1 = new Toyota("A101", "Sedan", "Toyota", "Camry", 2023,
                "Red", false, 54000.);

        Toyota toyota2 = new Toyota("1112", "Sedan", "Toyota", "Corolla", 2022,
                "White", false, 44000);

        Toyota toyota3 = new Toyota("1113", "Sedan", "Toyota", "Crown", 2020,
                "Blue", true, 50500);

        Hyundai hyundai1 = new Hyundai("A201", "Sedan", "Hyundai", "Sonata", 2022,
                "White", false, 42000.);

        Kia kia1 = new Kia("2111", "Sedan", "Kia", "K5", 2023,
                "Black", false, 453000);

        GarageData garageData = new GarageData();

        garageData.addCar(toyota1);
        garageData.addCar(hyundai1);
        garageData.displayAllCars();

        manager1.setPosition(Position.MANAGER);
        manager1.setSalary(77500.);
        manager1.setBonus(25000.);

        employee1.setPosition(Position.COURIER);
        employee1.setSalary(47500.);
        employee1.setBonus(15000.);

        employee2.setPosition(Position.DRIVER);
        employee2.setSalary(48200.);
        employee2.setBonus(15000.);

        StaffData staffData = new StaffData();
        staffData.addPerson(manager1);
        staffData.addPerson(employee1);
        staffData.addPerson(employee2);
        staffData.displayAllPersons();

        CustomerData customerData = new CustomerData();
        customer1.setModelOfCarBought(hyundai1.getCarManufacturer() + " " + hyundai1.getCarModel());
        customer2.setModelOfCarBought(toyota1.getCarManufacturer() + " " + toyota1.getCarModel());
        customerData.addPerson(customer1);
        customerData.addPerson(customer2);
        customerData.displayAllPersons();

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
