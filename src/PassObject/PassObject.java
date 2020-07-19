package PassObject;

import java.util.Scanner;

public class PassObject
{
    public static void main(String[] args) {
        //Create an Inventory Item.
        InventoryItem item = new InventoryItem("Wrench", 20);

        /// Pass the object to the DisplayItem method.
        displayItem(item);

        System.out.print(("Setting up for new object.\n"));

        InventoryItem obj2;


        //The getData method will return an instance of an InventoryItem object.

        obj2 = getData();

        System.out.println("Here is the result of getData(): \n"
            + "Description: " + obj2.getDescription() + "\n"
            + "Units: " + obj2.getUnits() + "\n"
            + "Bye!");


    }

    /**
     * The following method accepts an InventoryItem
     * object as an argument and displays it's contents.
     */
    public static void displayItem(InventoryItem item)
    {
        System.out.println("Description: " + item.getDescription());
        System.out.println("Units: " + item.getUnits());
    }

    public static InventoryItem getData()
    {
        String desc;
        int units;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a description: ");
        desc = keyboard.nextLine();

        System.out.println("Enter units: ");
        units = keyboard.nextInt();

        return new InventoryItem(desc, units);
    }
}
