package Chapter6.Challanges.InventoryItemCopyConstructor;

public class ChallengeSixNumTwo
{
    public static void main(String[] args)
    {
        //Creating one item.
        InventoryItem bentoBako = new InventoryItem("弁当箱", 200);

        InventoryItem bentoBakoTwo;
        InventoryItem hairDryer;

        //going to use copyconstructor on bentoBakoTwo.
        bentoBakoTwo = new InventoryItem(bentoBako);

        //going to initialize hairDryer for comparison reasons.
        hairDryer = new InventoryItem("ヘアドライヤー", 200);

        if(bentoBako.equals(bentoBakoTwo)){
            System.out.println("Both objects bentoBako and bentoBakoTwo"
                            + " have the same contents.");
        }
        else
        {
            System.out.println("bentoBako and bentoBakoTwo don't have the same contents.");
        }
        if(bentoBako.referencingSameAddress(bentoBakoTwo))
        {
            System.out.println("bentoBako and bentoBakoTwo are referencing "
                    + "the same object."
            );
        }
        else
        {
            System.out.println("bentoBako and bentoBakoTwo are not referencing "
                    + "the same object.");
        }


    }
}
