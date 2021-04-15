package Chapter6.Challenges.ParkingTicketSimulation;

import java.awt.*;

public class ParkTest {
    public static void main(String[] args){
        //test data is honda civic, green, 240 minutes parked.
        ParkedCar car = new ParkedCar("Honda","Civic", Colour.GREEN,"8675309",240);
        //car has 60 minutes purchased.
        ParkingMeter meter = new ParkingMeter(60);

        PoliceOfficer officer = new PoliceOfficer(car,meter);
        officer.setBadgeNumber("11-111");
        officer.setOfficerName("Tyler Durden");

        if(officer.carHasFine()){
            System.out.println(officer.generateTicket());
        }
        else{
            System.out.println("There is no ticket to print.");
        }
    }
}
