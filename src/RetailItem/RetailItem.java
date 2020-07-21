package RetailItem;

import java.text.DecimalFormat;

public class RetailItem
{
    /**
     *
     */

    private String description; //Item Description.
    private int itemNumber;     //Item number.
    private CostData cost;           //Cost Data.

    /**
     * RetailItem class constructor
     */

    public RetailItem(String desc, int itemNum,
                      double wholesale, double retail)
    {
        description = desc;
        itemNumber =itemNum;
        cost = new CostData(wholesale, retail);
    }

    /**
     * RetailItem class toString method.
     */
    public String toString(){
        String str;

        //Create a DecimalFormat object to format output.
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        str = "Description: " + description
                + "\nItem Number: " + itemNumber
                + "\nWholesale Cost: $"
                + dollar.format(cost.wholesale)
                + "\nRetail Price: $"
                + dollar.format(cost.retail);

        return str;
    }

    private class CostData
    {
        public double wholesale,    //wholesale cost
                        retail;     //retail cost

        /**
         * CostData class constructor.
         */

        public CostData(double w, double r)
        {
            wholesale = w;
            retail = r;
        }
    }
}
