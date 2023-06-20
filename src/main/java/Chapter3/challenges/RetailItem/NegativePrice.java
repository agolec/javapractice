package Chapter3.challenges.RetailItem;

public class NegativePrice extends Exception{
    NegativePrice(double price){
        super("Error: Negative value given for 'price': " + price);
    }
}
