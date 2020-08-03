package Chapter6.Challenges.ParkingTicketSimulation;

/**
 * This class should simulate a parking ticket.
 *
 * It's reponsibilities are:
 *
 * To report the make, model, color, and license number of an illegally parked
 * car.
 *
 * To report the amount of the fine:
 *
 *                  -   $25 for the first hour or partial hour parked, plus $10
 *                  -   for each additional hour or part of an hour the car is
 *                  -   parked.
 *
 * To report the name and badge number of the officer issuing the ticket.
 *
 */
public class ParkingTicket {

    ParkedCar car;
    PoliceOfficer officer;
    ParkingMeter meter;
    int amountOfFine;

    private final int FIRST_HOUR_FEE = 25;
    private final int ADDITIONAL_HOURS_FEE = 10;


    ParkingTicket(ParkedCar car,PoliceOfficer officer, ParkingMeter meter){
        this.car = new ParkedCar(car);
        this.officer = new PoliceOfficer(officer);
        this.meter = new ParkingMeter(meter);
        amountOfFine = 0;
        this.calculateFine();
    }

    ParkingTicket(){
        this.car = null;
        this.officer = null;
        this.meter = null;
        amountOfFine = 0;
    }
    public String reportCarSpecs(){
        return car.toString();
    }
    public String reportFine() {
        return this.toString();
    }
    public String reportOfficerDetails() {
        return officer.toString();

    }
    private void calculateFine(){
        int timeOverParked = car.getMinutesParked() - meter.getMinutesPurchased();

        if(timeOverParked <= 60){
            amountOfFine = FIRST_HOUR_FEE;
        }
        else{
            amountOfFine = FIRST_HOUR_FEE + (ADDITIONAL_HOURS_FEE * ((timeOverParked - 60)/60));
        }
    }
    public String toString(){
        return "Fine is $:" + amountOfFine + ".";
    }



}
