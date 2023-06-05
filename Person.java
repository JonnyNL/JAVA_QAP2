public class Person {
    private String lastname;
    private String firstname;
    private Address home;

    // Constructor to initialize the person with lastname, firstname, and home address
    public Person(String lname, String fname, Address address) {
        this.lastname = lname;
        this.firstname = fname;
        this.home = address;
    }

    // toString method to return a string representation of the person
    public String toString() {
        return (firstname + " " + lastname + " " + home);
    }
}