package dnekh.pp.carstore.employee.staff;

import dnekh.pp.carstore.Person;
import dnekh.pp.carstore.Staff;
import dnekh.pp.carstore.employee.Position;

public class Employee extends Staff {


    public Employee(int id, String firstName, String lastName, int age, String phoneNumber, String email, double salary) {
        super(id, firstName, lastName, age, phoneNumber, email, salary);
    }
}
