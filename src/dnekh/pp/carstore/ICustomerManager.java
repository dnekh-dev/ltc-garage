package dnekh.pp.carstore;

import dnekh.pp.carstore.client.Customer;

public interface ICustomerManager {

    void addCustomer(Customer customer);
    Customer getCustomer(String id);
    void removeCustomer(String id);
    void displayAllCustomers();
}
