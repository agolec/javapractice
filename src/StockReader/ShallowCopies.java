package StockReader;

public class ShallowCopies {
    public static void main(String[] args) {

        //Create the stock object.
        StockReader company1 = new StockReader("XYZ", 200);

        //Declare a new StockReader variable.
        StockReader company2;

        //Make company2 a reference copy of the Object referred to by company1.
        company2 = company1.copy();

        //Display the objects.
        System.out.println("Company 1:\n" + company1);
        System.out.println();
        System.out.println("Company 2:\n" + company2);

        //Confirm we actually have two different objects.
        if (company1 == company2) {
            System.out.println("The company1 and company2 variables reference the same object.");
        } else {
            System.out.println("The company1 and company2 variables reference different objects.");
        }
    }
}
