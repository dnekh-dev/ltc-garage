package dnekh.pp.carstore.container;

import dnekh.pp.carstore.bluprintclasses.Staff;

import java.util.HashMap;
import java.util.Map;

public class StaffData {

    private Map<Integer, Staff> staffData = new HashMap<>();


    public void addStaff(Staff staff) {
        staffData.put(staff.getId(), staff);
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
