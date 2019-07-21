package pl.sda.employee.model;

public class Employee {

    private String name;
    private String lastName;
    private String telephonee;
    private Station station;

    public Employee(String name, String lastName, String telephonee, Station station) {
        this.name = name;
        this.lastName = lastName;
        this.telephonee = telephonee;
        this.station = station;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephonee() {
        return telephonee;
    }

    public Station getStation() {
        return station;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTelephonee(String telephonee) {
        this.telephonee = telephonee;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", telephonee='" + telephonee + '\'' +
                ", station=" + station +
                '}';
    }
}
