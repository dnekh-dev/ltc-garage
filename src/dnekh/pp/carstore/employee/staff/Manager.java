package dnekh.pp.carstore.employee.staff;

import dnekh.pp.carstore.Person;
import dnekh.pp.carstore.employee.Position;

public class Manager extends Person {

    private Position position;
    private double salary;
    private double bonus;

    public Manager(String firstName, String lastName, int age, String phoneNumber, String email, double salary) {
        super(firstName, lastName, age, phoneNumber, email);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Manager{" +
                "position=" + position +
                ", bonus=" + bonus +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = Position.MANAGER;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
