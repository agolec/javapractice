package Chapter6.Challenges.ParkingTicketSimulation;

/**
 * This class is to simulate a parked car.
 * <p>
 * This class needs to hold the following:
 * <p>
 * make
 * <p>
 * model
 * <p>
 * color
 * <p>
 * license number
 * <p>
 * number of minutes parked
 */
public class ParkedCar {

    private Colour carColour;

    private String make;

    private String model;



    //The license number of the car.
    private String licenseNumber;

    //the number of minutes the car is parked.
    private int minutesParked;

    public ParkedCar(){
        make = "";
        model = "";
        carColour = null;
        licenseNumber = "";
        minutesParked = 0;
    }

    public ParkedCar(String make, String model, Colour carColour,
                     String licenseNumber,int minutesParked){
        this.make = make;
        this.model = model;
        this.carColour = carColour;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;

    }
    public ParkedCar(ParkedCar parkedCarToCopy){

        make = parkedCarToCopy.getMake();
        model = parkedCarToCopy.getModel();
        carColour = parkedCarToCopy.getColour();
        licenseNumber = parkedCarToCopy.getLicenseNumber();
        minutesParked = parkedCarToCopy.minutesParked;
    }
    //Mutator methods.
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColour(Colour carColour){
        this.carColour = carColour;
    }
    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber = licenseNumber;
    }
    public void setMinutesParked(int minutesParked){
        this.minutesParked = minutesParked;
    }
    //Accessor methods.
    public String getMake() {
        return make;
    }
    public String getModel(){
        return model;
    }
    public Colour getColour(){
        return carColour;
    }
    public String getLicenseNumber(){
        return licenseNumber;
    }
    public int getMinutesParked(){
        return minutesParked;
    }
    public String toString(){
        return  "Make: " + this.getMake() + "\n" +
                "Model: " + this.getModel() + "\n" +
                "Colour: " + this.getColour() + "\n" +
                "License Number: " + this.getLicenseNumber() + "\n";
    }
}
