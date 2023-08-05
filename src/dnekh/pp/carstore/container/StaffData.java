package dnekh.pp.carstore.container;

import dnekh.pp.carstore.Staff;
import dnekh.pp.carstore.employee.staff.Employee;

import java.util.Map;

public class StaffData {

    private Map<Integer, Staff> staffData;

    public StaffData(Map<Integer, Staff> staffData) {
        this.staffData = staffData;
    }

    public void addEmployee(Employee employee) {
        staffData.put(employee.getId(), employee);
    }

    public Staff getStaff(int id) {
        return staffData.get(id);
    }

    public Staff removeEmployee(int id) {
        return staffData.remove(id);
    }

    public void displayAllEmployees() {
        for (Staff staff : staffData.values()) {
            System.out.println(staff);
        }
    }

    public Map<Integer, Staff> getStaffData() {
        return staffData;
    }

    public void setStaffData(Map<Integer, Staff> staffData) {
        this.staffData = staffData;
    }
}
