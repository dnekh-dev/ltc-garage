package dnekh.pp.carstore.client;

import dnekh.pp.carstore.Person;

public class Customer extends Person {

    private String modelOfCarBought;

    public Customer(String firstName, String lastName, int age, String phoneNumber, String email) {
        super(firstName, lastName, age, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "modelOfCarBought='" + modelOfCarBought + '\'' +
                '}';
    }

    public String getModelOfCarBought() {
        return modelOfCarBought;
    }

    public void setModelOfCarBought(String modelOfCarBought) {
        this.modelOfCarBought = modelOfCarBought;
    }
}
