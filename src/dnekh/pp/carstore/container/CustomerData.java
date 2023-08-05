package dnekh.pp.carstore.container;

import dnekh.pp.carstore.client.Customer;

import java.util.Map;

public class CustomerData {

    private Map<Integer, Customer> customerData;

    public CustomerData(Map<Integer, Customer> customerData) {
        this.customerData = customerData;
    }

    public void addCustomer(Customer customer) {
        customerData.put(customer.getId(), customer);
    }

    public Customer getCustomer(int id) {
        return customerData.get(id);
    }

    public Customer removeCustomer(int id) {
        return customerData.remove(id);
    }

    public void displayAllCustomers() {
        for (Customer customer : customerData.values()) {
            System.out.println(customer);
        }
    }

    @Override
    public String toString() {
        return "CustomerData{" +
                "customerData=" + customerData +
                '}';
    }

    public Map<Integer, Customer> getCustomerData() {
        return customerData;
    }

    public void setCustomerData(Map<Integer, Customer> customerData) {
        this.customerData = customerData;
    }
}
