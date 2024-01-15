package library;

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

public class Aggregation {
    int id;
    String name;
    Address address;

    public Aggregation(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Employee Details: \n" + "Name: " + name + "\nId: " + id + "\n\nAddress: " + "\nCity: " + address.city + "\nState: " + address.state + "\nCountry: " + address.country);
    }

    public static void main(String[] args) {

        Address savar = new Address("Savar", "Dhaka", "Bangladesh");
        Address narayanganj = new Address("Narayanganj", "Dhaka", "Bangladesh");
        Aggregation a = new Aggregation(100, "Syed Easin", savar);
        Aggregation b = new Aggregation(101, "Asif Joardar", narayanganj);

        a.display();
        System.out.println("\n\n\n");
        b.display();
    }
}
