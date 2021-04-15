package Chapter6.Challanges.InventoryItemCopyConstructor;

/**
 * For chapter 6 programming challenge 2.
 */

/**
 * Add a copy constructor to InventoryItem class. This constructor should
 * accept an InventoryItem object as it's argument.
 *
 * The constructor should assign to the 'description' field the value in
 * the argument's description field, and assign the 'units' field the value
 * in the argument's units field.
 *
 * As a result, a new object will bea copy of the argument object.
 *
 */
public class InventoryItem
{
    private String description;
    private int units;

    /**
     * no-arg constructor
     */

    public InventoryItem()
    {
        description =  "";
        units = 0;
    }

    /**
     * The following constructor accepts a String argument that is
     * assigned to the description field.
     */

    public InventoryItem(String d)
    {
        description = d;
        units = 0;
    }

    /**
     * The following constructor accepts a String argument that is
     * assigned to the description field, and an int argument that is
     * assigned to the units field.
     */
    public InventoryItem(String d,int u)
    {
        description = d;
        units = u;
    }

    //copy constructor for assignment.
    public InventoryItem(InventoryItem item)
    {
        description = item.getDescription();
        units = item.getUnits();
    }

    /**
     * The setDescription method assigns its argument to the
     * description field.
     */
    public void setDescription(String d)
    {
        description = d;
    }

    /**
     * The setUnits method assigns its argument to the units field.
     */
    public void setUnits(int u)
    {
        units = u;
    }

    /**
     * The getDescription method returns the value in the
     * description field.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * The getUnits method returns the value in the units field.
     */

    public int getUnits()
    {
        return units;
    }

    public boolean equals(InventoryItem itemTwo)
    {
        boolean status;

        //Determine whether this object's description and units are the same
        //as the InventoryItemTwo object.
        if(description.equals(itemTwo.getDescription()) &&
           units == itemTwo.getUnits())
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;
    }
    public boolean referencingSameAddress(InventoryItem itemTwo)
    {
        boolean status;

        if(this == itemTwo)
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;
    }
}
