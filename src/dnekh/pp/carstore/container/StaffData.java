package dnekh.pp.carstore.container;

import dnekh.pp.carstore.IPersonManager;
import dnekh.pp.carstore.bluprintclasses.Person;
import dnekh.pp.carstore.bluprintclasses.Staff;

import java.util.HashMap;
import java.util.Map;

public class StaffData implements IPersonManager {

    private Map<String, Staff> staffData = new HashMap<>();


    @Override
    public void addPerson(Person person) {
        staffData.put(person.getId(), (Staff) person);
    }

    @Override
    public Person getPerson(String id) {
        return null;
    }

    @Override
    public void removePerson(String id) {

    }

    @Override
    public void displayAllPersons() {
        for (Staff staff : staffData.values()) {
            System.out.println(staff);
        }
    }

    //getter and setters block starts here

    public Map<String, Staff> getStaffData() {
        return staffData;
    }

    public void setStaffData(Map<String, Staff> staffData) {
        this.staffData = staffData;
    }
}
