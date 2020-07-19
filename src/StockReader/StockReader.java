package StockReader;

public class StockReader
{
    private String symbol;      //Trading symbol of the stock.
    private double sharePrice;  //Current price per share.

    /**
     * Constructor accepts arguments for the stock's trading
     * symbol and share price.
     */

    public StockReader(String sym, double price)
    {
        symbol = sym;
        sharePrice = price;
    }

    /**
     * getSymbol method
     */
    public String getSymbol()
    {
        return symbol;
    }
    public double getSharePrice()
    {
        return sharePrice;
    }

    /**
     * toString method.
     */
    public String toString()
    {
        String str = "Trading symbol: " + this.symbol +
                    "\nShare price: " + this.sharePrice;

        return str;
    }
    public boolean equals(StockReader object2)
    {
        boolean status = false;

        //determine whether the first object is equal to the second.
        if(symbol.equals(object2.symbol) &&
            sharePrice == object2.sharePrice)
            status = true;
        else
            status = false;

        return status;

    }


}
