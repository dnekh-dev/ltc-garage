package dnekh.pp.carstore.bluprintclasses;

public abstract class Person {

    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String email;

    public Person(String id, String firstName, String lastName, int age, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("""
                ID - %s
                Firstname - %s
                Lastname - %s
                Age - %d
                Phone - %s
                Email - %s
                """, id, firstName, lastName, age, phone, email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phone;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
