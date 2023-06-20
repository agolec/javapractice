package Chapter3.challenges.RetailItem;

import org.jetbrains.annotations.Contract;

public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    RetailItem(String description,int unitsOnHand,double price) throws NegativePrice, NegativeUnits {
        if(price < 0){
            throw new NegativePrice(price);
        }
        if(unitsOnHand < 0){
            throw new NegativeUnits(unitsOnHand);
        }
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    @Contract(pure = true)
    RetailItem(RetailItem retailObjectToCopy){
        this.description = retailObjectToCopy.description;
        this.unitsOnHand = retailObjectToCopy.unitsOnHand;
        this.price = retailObjectToCopy.price;

    }
    public String getDescription(){
        return this.description;
    }
    public int getUnitsOnHand(){
        return this.unitsOnHand;
    }
    public double getPrice(){
        return this.price;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setUnits(int unitsOnHand) throws NegativeUnits {
        if(unitsOnHand < 0){
            throw new NegativeUnits(unitsOnHand);
        } else{
            this.unitsOnHand = unitsOnHand;
        }

    }
    public void setPrice(double price) throws NegativePrice {
        if(price < 0){
            throw new NegativePrice(price);
        }else{
            this.price = price;
        }

    }
    public String toString(){
        String retailObjectString =
                "-RetailItem- " +
                "\nDescription:" + this.description +
                "\nUnits on hand:" + this.unitsOnHand +
                "\nPrice: " + this.price + "\n";

        return retailObjectString;
    }
}
