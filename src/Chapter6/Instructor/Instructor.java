package Chapter6.Instructor;

public class Instructor
{
    private String  lastName,
                    firstName,
                    officeNumber;
    /**
     * This constructor accepts arguments for the
     * last name, first name, and office number.
     */

    public Instructor(String lname, String fname, String office)
    {
        lastName = lname;
        firstName = fname;
        officeNumber = office;
    }
    //Copy constructor
    public Instructor(Instructor objectToCopy)
    {
        lastName = objectToCopy.lastName;
        firstName = objectToCopy.firstName;
        officeNumber = objectToCopy.officeNumber;
    }

    /**
     * The toString method returns a string containing the
     * instructor information.
     */
    public String toString()
    {
        //Create a string representing the object.
        String str = "Last Name: " + lastName
                + "\nFirst Name: " + firstName
                + "\nOffice Number: " + officeNumber;
        //Return the string.
        return str;
    }

}
