package pl.sda.employee;

import pl.sda.employee.model.Employee;
import pl.sda.employee.model.Station;



public class Main {

    public static void main(String[] args) {
        // write your code here

        String[] names = {"Jan", "Michal", "Karol", "Piotr", "Sebastian"};
        String[] lastNames = {"Kowalski", "Nowak", "Michalski", "Cieslak", "Puczyk"};
        String[] telephones = {"53215799", "412369745", "654123987", "45987613", "986532147"};
        String[] stations = {"Prezes", "Dyrektor", "Kierownik", "Brugadzista", "Pracownik"};
        String[] locations = {"Torun", "Bydgoszcz", "Grudziadz", "Lodz", "Krakow"};

        Employee[] employee = new Employee[5];

        for (int i = 0; i < 5; i++) {

//            employee[i] = new Employee(names[i], lastNames[i], telephones[i], new Station(stations[i], locations[i]));
//            System.out.println(employee[i]);
            System.out.println("Imię: " + employee[i].getName());
            System.out.println("Nazwisko: " + employee[i].getLastName());
            System.out.println("Stanowisko: " + employee[i].getStation().getStationName());
            System.out.println("===============");

        }


    }
}
