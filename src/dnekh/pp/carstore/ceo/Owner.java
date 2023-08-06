package dnekh.pp.carstore.ceo;

import dnekh.pp.carstore.bluprintclasses.Person;


public class Owner extends Person{

    private double benefits;

    public Owner(String id, String firstName, String lastName, int age, String phoneNumber, String email) {
        super(id, firstName, lastName, age, phoneNumber, email);
    }


    @Override
    public String toString() {
        return "Owner{" +
                "benefits=" + benefits +
                '}';
    }

    public double getBenefits() {
        return benefits;
    }

    public void setBenefits(double benefits) {
        this.benefits = benefits;
    }
}
