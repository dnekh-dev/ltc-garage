package dnekh.pp.carstore.employee.staff;

import dnekh.pp.carstore.employee.Employee;
import dnekh.pp.carstore.employee.Position;

public class Staff extends Employee {

    private String phoneNumberOfEmployee;
    public Staff(String firstName, String lastName, int age, String phoneNumber, Position position, double salary) {
        super(firstName, lastName, age, phoneNumber, position, salary);
    }

    public String getPhoneNumberOfEmployee() {
        return phoneNumberOfEmployee;
    }

    public void setPhoneNumberOfEmployee(String phoneNumberOfEmployee) {
        this.phoneNumberOfEmployee = phoneNumberOfEmployee;
    }
}
