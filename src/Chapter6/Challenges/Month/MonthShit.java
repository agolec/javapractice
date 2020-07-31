package Chapter6.Challenges.Month;

public class MonthShit
{
    public static void main(String[] args)
    {
        Month monthOne = new Month(7);

        System.out.println("first objects month number: "
                            + monthOne.toString());

        System.out.println("The month name is "
                            + monthOne.getMonthName() + ".");

        System.out.println("Setting up another object or whatever." +
                "Using the string contructor");
        String monthString = "May";


        Month monthTwo = new Month(monthString);

        System.out.println("Are these objects equal?\n"
                        + monthTwo.equals(monthOne));
        //should be true
        System.out.println("Is monthOne greater than monthTwo?\n"
                        + monthOne.greaterThan(monthTwo));
        //should be false
        System.out.println("Is monthOne less than monthTwo\n"
                        + monthOne.lessThan(monthTwo));

        //third month object. Going to equal the fuck out of monthOne.
        Month monthThree = new Month("JULY");

        //should be true
        System.out.println("Is monthThree equal to MonthOne?\n"
                        +   monthThree.equals(monthOne));


    }
}
