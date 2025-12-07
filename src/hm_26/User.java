package hm_26;

public class User {
    private String name;
    private Address address;

    public User(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
