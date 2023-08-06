package dnekh.pp.carstore.container;

import dnekh.pp.carstore.IPersonManager;
import dnekh.pp.carstore.bluprintclasses.Person;
import dnekh.pp.carstore.client.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerData implements IPersonManager {

    private Map<String, Customer> customerData = new HashMap<>();


    @Override
    public void addPerson(Person person) {
        customerData.put(person.getId(), (Customer) person);
    }

    @Override
    public Person getPerson(String id) {
        return customerData.get(id);
    }

    @Override
    public void removePerson(String id) {
        customerData.remove(id);
    }

    @Override
    public void displayAllPersons() {
        for (Customer customer : customerData.values()) {
            System.out.println(customer);
        }
    }

    //getters and setters section

    public Map<String, Customer> getCustomerData() {
        return customerData;
    }

    public void setCustomerData(Map<String, Customer> customerData) {
        this.customerData = customerData;
    }
}
