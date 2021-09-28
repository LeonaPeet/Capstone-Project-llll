package Level2_task7;

public class Person {

    // Attributes
    String name;
    String cellNumber;
    String email;
    String address;

    // Constructor
    public Person(String name, String cellNumber, String email, String address) {
        this.name = name;
        this.cellNumber = cellNumber;
        this.email = email;
        this.address = address;
    }

    // Setters
    public void setName(String newName) {
        name = newName;
    }
    public void setCellNumber(String newCellNumber) {
        cellNumber = newCellNumber;
    }
    public void setEmail(String newEmail) {
        email = newEmail;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    // Getters
    public String getName() {
        return name;
    }
    public String getCellNumber() {
        return cellNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
        // Methods
    public String toString() {
        String objectString =
                "\nName: " + name +
                "\nCell Number: " + cellNumber +
                "\nEmail: " + email +
                "\nAddress: " + address;

        return objectString;
    }
}

