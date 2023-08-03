package dnekh.pp.carstore.employee.staff;

import dnekh.pp.carstore.employee.Employee;
import dnekh.pp.carstore.employee.Position;

public class Manager extends Employee {

    private double bonus;
    private String phoneNumberOfManager;
    private String emailOfManager;
    public Manager(String firstName, String lastName, int age, String phoneNumber, Position position, double salary) {
        super(firstName, lastName, age, phoneNumber, Position.MANAGER, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPhoneNumberOfManager() {
        return phoneNumberOfManager;
    }

    public void setPhoneNumberOfManager(String phoneNumberOfManager) {
        this.phoneNumberOfManager = phoneNumberOfManager;
    }

    public String getEmailOfManager() {
        return emailOfManager;
    }

    public void setEmailOfManager(String emailOfManager) {
        this.emailOfManager = emailOfManager;
    }
}
