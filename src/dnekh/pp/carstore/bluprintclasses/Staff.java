package dnekh.pp.carstore.bluprintclasses;

import dnekh.pp.carstore.bluprintclasses.Person;
import dnekh.pp.carstore.employee.Position;

public abstract class Staff extends Person {

    private Position position;
    private double salary;
    private double bonus;

    public Staff(int id, String firstName, String lastName, int age, String phoneNumber, String email, double salary) {
        super(id, firstName, lastName, age, phoneNumber, email);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Staff{" +
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
