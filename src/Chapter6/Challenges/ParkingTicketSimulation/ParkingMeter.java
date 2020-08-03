package Chapter6.Challenges.ParkingTicketSimulation;

/**
 * Should simulate a parking meter/structure.
 *
 * This class needs to know the following:
 *
 * The number of minutes purchased for parking.
 */
public class ParkingMeter {
    private int minutesPurchased;

    ParkingMeter(){
        minutesPurchased = 0;
    }

    ParkingMeter(int minutesPurchased){
        this.minutesPurchased = minutesPurchased;
    }
    ParkingMeter(ParkingMeter meterToCopy){
        this.minutesPurchased = meterToCopy.minutesPurchased;
    }
    public ParkingMeter getParkingMeter(ParkingMeter meter){
        return new ParkingMeter(meter);
    }

    public void setMinutesPurchased(int minutesPurchased){
        this.minutesPurchased = minutesPurchased;
    }

    public int getMinutesPurchased(){
        return minutesPurchased;
    }


}
