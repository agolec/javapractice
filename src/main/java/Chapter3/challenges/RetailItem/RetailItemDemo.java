package Chapter3.challenges.RetailItem;

public class RetailItemDemo {

    public static void main(String[] args) throws NegativePrice, NegativeUnits {
        RetailItem hammer = new RetailItem("A hammer",4,300);
        RetailItem nail = new RetailItem(hammer);

        //change the values of the nail object.
        nail.setUnits(3);
        nail.setPrice(400);
        nail.setDescription("a bag of nails.");

        nail.setUnits(-59);

        System.out.println(hammer);
        System.out.println(nail);

    }

}
