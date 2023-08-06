package dnekh.pp.carstore;

import dnekh.pp.carstore.bluprintclasses.Staff;

public interface IEmployeesManager {

    void addEmployee(Staff staff);
    Staff getEmployee(String id);
    void removeEmployee(String id);
    void displayAllEmployees();
}
