package dnekh.pp.carstore;

public enum CarStore {

    INSTANCE;

    private String nameOfTheStore;
    private String fullNameOfOwner;
    private String emailOfTheStore;
    private String phoneNumberOfTheStore;
    private String addressOfTheStore;

    public String getName() {
        return nameOfTheStore;
    }

    public void setName(String name) {
        this.nameOfTheStore = name;
    }

    public String getNameOfOwner() {
        return fullNameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.fullNameOfOwner = nameOfOwner;
    }

    public String getEmail() {
        return emailOfTheStore;
    }

    public void setEmail(String email) {
        this.emailOfTheStore = email;
    }

    public String getPhoneNumber() {
        return phoneNumberOfTheStore;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumberOfTheStore = phoneNumber;
    }

    public String getAddress() {
        return addressOfTheStore;
    }

    public void setAddress(String address) {
        this.addressOfTheStore = address;
    }
}
