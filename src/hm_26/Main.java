package hm_26;

public class Main {
    public static void main(String[] args) {

        User user = new User("Piter");
        Address address = new Address("Maasbree", "Krayel", "20B");
        user.setAddress(address);
        System.out.println("User address: " + user.getAddress());
    }
}
