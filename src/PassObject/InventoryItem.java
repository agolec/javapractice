package PassObject;

import java.util.Scanner;

public class InventoryItem {

    //Item description and units on-hand.
    private String description;
    private int units;

    //No-arg consructor.
    public InventoryItem(){
        description = "";
        units = 0;
    }
    //Constructor meant to take in a string for the name, and string for the units.
    public InventoryItem(String name, int units)
    {
        this.description = name;
        this.units = units;
    }
    //Constructor for only a description being passed in.
    public InventoryItem(String name){
        this.description = name;
        units = 0;
    }
    /**
     * The setUnits method assigns its argument
     * to the units field.
     */
    public void setUnits(int u)
    {
        units = u;
    }
    /**
     * The getDescription method returns the
     * value in a description field.
     */

    public String getDescription()
    {
        return description;
    }

    /**
     * The getUnits method returns the value in units field.
     */
    public int getUnits()
    {
        return units;
    }
}
