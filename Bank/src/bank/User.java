package bank;

public class User {
    String name;
    String lastName;
    String email;
    String age;
    String address;

    public User( String name, String lastName, String email, String age, String address ) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public String showInfo() {
        return "Name: " + this.name + "\n" +
               "Last name: " + this.lastName + "\n" +
               "Email: " + this.email + "\n" +
               "Age: " + this.age + "\n" +
               "Address: " + this.address + "\n";
    }
}
