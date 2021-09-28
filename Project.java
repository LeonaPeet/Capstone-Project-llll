package Level2_task7;

public class Project {

    // Attributes
    int number;
    String name;
    String type;
    String address;
    String erf;
    float fee;
    float paid;
    String deadline;
    Person contractor;


    // Constructor
    public Project(int number, String name, String type, String address, String erf, float fee, float paid, String deadline, Person contractor) {
        this.number = number;
        this.name = name;
        this.type = type;
        this.address = address;
        this.erf = erf;
        this.fee = fee;
        this.paid = paid;
        this.deadline = deadline;
        this.contractor = contractor;
    }

    // Setters
    public void setNumber(int newNumber) {
        number = newNumber;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setType(String newType) {
        type = newType;
    }
    public void setAddress(String newAddress) {
        address = newAddress;
    }
    public void setErf(String newErf) {
        erf = newErf;
    }
    public void setFee(float newFee) {
        fee = newFee;
    }
    public void setPaid(float newPaid) {
        paid = newPaid;
    }
    public void setDeadline(String newDeadline){
        deadline = newDeadline;
    }
    // Getters
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getAddress() {
        return address;
    }
    public String getErf() {
        return erf;
    }
    public float getFee() {
        return fee;
    }
    public float getPaid() {
        return paid;
    }
    public String getDeadline() {
        return deadline;
    }
    public Person getContractor() {
        return contractor;
    }

    // Methods
    public String toString() {
        String objectString =
                "\nProject Number: " + number +
                "\nProject Name: " + name +
                "\nProject Type: " + type +
                "\nProject Address: " + address +
                "\nProject Erf: " + erf +
                "\nProject Fee: " + fee +
                "\nProject Paid to date: " + paid +
                "\nProject Deadline: " + deadline +
                "\nContractor: " + contractor;

        return objectString;

    }
}
