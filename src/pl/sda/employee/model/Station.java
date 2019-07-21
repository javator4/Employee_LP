package pl.sda.employee.model;

public class Station {

    private String stationName;
    private String location;


    public Station(String stationName, String location) {
        this.stationName = stationName;
        this.location = location;
    }


    public String getStationName() {
        return stationName;
    }

    public String getLocation() {
        return location;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationName='" + stationName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
