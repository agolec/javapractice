package Chapter6.Challenges.ParkingTicketSimulation;

import org.jetbrains.annotations.NotNull;

/**
 * This clas should simulate a police officer inspecting parked cars.
 *
 * Responsibilities of this class:
 *
 * To know the police officer's name and badge number.
 *
 * To example a ParkedCar object and ParkingMeter object and determine
 * whether that car's time has expired.
 *
 * To issue a parking ticket (generate a ParkingTicket object) if the
 * car's time has expired.
 *
 */
public class PoliceOfficer {

    private ParkedCar carUnderInspection;
    private ParkingMeter meterUnderInspection;
    private ParkingTicket ticket;

    String name;
    String badgeNumber;

    public PoliceOfficer(ParkedCar car, ParkingMeter meter){
        carUnderInspection = new ParkedCar(car);
        meterUnderInspection = new ParkingMeter(meter);

    }
    public PoliceOfficer(){
        this.name = "";
        this.badgeNumber = "";
    }
    public PoliceOfficer(String name, String number){
        this.name = name;
        this.badgeNumber = number;
    }
    public PoliceOfficer(PoliceOfficer officerReference){
        this.name = officerReference.getOfficerName();
        this.badgeNumber = officerReference.getBadgeNumber();
    }

    public boolean carHasFine(){
        if(carUnderInspection.getMinutesParked() > meterUnderInspection.getMinutesPurchased()){
            return true;
        } else {
            return false;
        }
    }

    public String generateTicket(){
       {
            ticket = new ParkingTicket(carUnderInspection,this,meterUnderInspection);

            return ticket.reportCarSpecs() +
            ticket.reportOfficerDetails() +
            ticket.toString();
       }
    }

    public String getOfficerName(){
        return name;
    }
    public void setOfficerName(String name){
        this.name = name;
    }
    public void setBadgeNumber(String badge){
        this.badgeNumber = badge;
    }
    public String getBadgeNumber(){
        return badgeNumber;
    }
    public String toString(){
        return "Badge Name: " + this.getOfficerName() + "\n"
                + "Badge Number: " + this.getBadgeNumber() + "\n";
    }

}
