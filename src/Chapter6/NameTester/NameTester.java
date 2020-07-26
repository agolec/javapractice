package Chapter6.NameTester;

public class NameTester
{
    public static void main(String[] args)
    {
        FullName name = new FullName();

        try{
            //display the length of the name.
            System.out.println(name.getLength());
        } catch (Exception e){
            System.out.println("Exception occurred: " + e);

        }

    }
}
