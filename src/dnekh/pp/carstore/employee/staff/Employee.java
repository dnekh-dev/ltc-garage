package dnekh.pp.carstore.employee.staff;

import dnekh.pp.carstore.Person;
import dnekh.pp.carstore.employee.Position;

public class Employee extends Person {

    private Position position;
    private double salary;
    private double bonus;

    public Employee(String firstName, String lastName, int age, String phoneNumber, String email) {
        super(firstName, lastName, age, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "position=" + position +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
