package Chapter3.challenges.RetailItem;

public class NegativeUnits extends Exception {
    NegativeUnits(int unitsGiven){
        super("Error: Negative units. Units provided: " + unitsGiven);
    }
}
