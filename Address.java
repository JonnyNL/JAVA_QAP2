public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructor to initialize the address with street, city, state, and zip
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // toString method to return a string representation of the address
    public String toString() {
        return(street + ", " + city + ", " + state + ", " + zip);
    }
}