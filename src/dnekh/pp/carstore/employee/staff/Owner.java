package dnekh.pp.carstore.employee.staff;

import dnekh.pp.carstore.employee.Employee;
import dnekh.pp.carstore.employee.Position;

public class Owner extends Employee {

    private double benefits;
    private String phoneNumberOfOwner;
    private String emailOfOwner;

    public Owner(String firstName, String lastName, int age, String phoneNumber, Position position, double salary) {
        super(firstName, lastName, age, phoneNumber, Position.OWNER, salary);
    }

    public double getBenefits() {
        return benefits;
    }

    public void setBenefits(double benefits) {
        this.benefits = benefits;
    }

    public String getPhoneNumberOfOwner() {
        return phoneNumberOfOwner;
    }

    public void setPhoneNumberOfOwner(String phoneNumberOfOwner) {
        this.phoneNumberOfOwner = phoneNumberOfOwner;
    }

    public String getEmailOfOwner() {
        return emailOfOwner;
    }

    public void setEmailOfOwner(String emailOfOwner) {
        this.emailOfOwner = emailOfOwner;
    }
}
