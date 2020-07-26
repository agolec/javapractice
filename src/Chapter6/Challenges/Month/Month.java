package Chapter6.Challenges.Month;

public class Month
{
    int monthNumber;

    //no-arg constructor.
    public Month()
    {
        monthNumber = 1;
    }

    public Month(int monthNumber)
    {
        this.monthNumber = monthNumber;
    }
    public Month(String monthString)
    {
        monthString = monthString.toUpperCase();

        switch(monthString){
            case "JAN":
            case "JANUARY":
                monthNumber = 1;
                break;
            case "FEB":
            case "FEBRUARY":
                monthNumber = 2;
                break;
            case "MAR":
            case "MARCH":
                monthNumber = 3;
            case "APR":
            case "APRIL":
                monthNumber = 4;
                break;
            case "MAY":
                monthNumber = 5;
                break;
            case "JUN":
            case "JUNE":
                monthNumber = 6;
            case "JUL":
            case "JULY":
                monthNumber = 7;
                break;
            case "AUG":
            case "AUGUST":
                monthNumber = 8;
                break;
            case "SEP":
            case "SEPTEMBER":
                monthNumber = 9;
                break;
                case "OCT":
            case "OCTOBER":
                monthNumber = 10;
                break;
            case "NOV":
            case "NOVEMBER":
                monthNumber = 11;
                break;
            case "DEC":
            case "DECEMBER":
                monthNumber = 12;

        }
    }
    public void setMonthNumber(int month)
    {
        if(month > 12 || month < 1)
        {
            monthNumber = 1;
        }
        else
        {
            monthNumber = month;
        }
    }

    public int getMonthNumber()
    {
        return monthNumber;
    }

    public String getMonthName()
    {
        switch(monthNumber){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
            }
    }

    public String toString()
    {
        return getMonthName();
    }

    public boolean equals(Month month)
    {
        return this.monthNumber == month.getMonthNumber();
    }

    public boolean greaterThan(Month month)
    {
        return this.monthNumber > month.getMonthNumber();
    }

    public boolean lessThan(Month month)
    {
        return this.monthNumber < month.getMonthNumber();
    }


}
