package dnekh.pp.carstore.employee.staff;

import dnekh.pp.carstore.Person;
import dnekh.pp.carstore.employee.Position;

public class Owner extends Person {

    private Position position;
    private double benefits;

    public Owner(String firstName, String lastName, int age, String phoneNumber, String email, double benefits) {
        super(firstName, lastName, age, phoneNumber, email);
        this.benefits = benefits;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "position=" + position +
                ", benefits=" + benefits +
                '}';
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = Position.OWNER;
    }

    public double getBenefits() {
        return benefits;
    }

    public void setBenefits(double benefits) {
        this.benefits = benefits;
    }
}
