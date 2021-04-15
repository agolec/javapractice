package Chapter6;

public class Countable {
    private static int instanceCount = 0;

    /**
     * The constructor increments the static
     * field instanceCount. This keeps track
     * of the number of instances of this
     * class that are created.
     */

    public Countable(){
        instanceCount++;
    }
    /**
     * The getInstanceCount method returns
     * the value in the instanceCount field
     * which is the number of instances
     * of this class which have been created.
     */

    public int getInstanceCount(){
        return instanceCount;
    }

    public static void main(String [] args){
        int objectCount;

        //Create three instances of the Chapter6.Countable class.
        Countable object1 = new Countable();
        Countable object2 = new Countable();
        Countable object3 = new Countable();

        objectCount = object1.getInstanceCount();

        //getting the number of instances and printing.
        System.out.println(objectCount + " instances "
                        + "of the class were created.");

    }
}


