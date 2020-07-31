package Chapter6.Challenges.Month;

import org.jetbrains.annotations.NotNull;

public class Month {

    int monthNumber;

    //no-arg constructor.
    public Month() {
        monthNumber = 1;
    }

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public Month(@NotNull String monthString) {
        monthNumber = java.time.Month.valueOf(monthString.toUpperCase()).getValue();
    }

    public void setMonthNumber(int month)
    {
        if (month > 12 || month < 1)
        {
            monthNumber = 1;
        }
        else
        {
            monthNumber = month;
        }
    }

    public int getMonthNumber() {

        return monthNumber;
    }

    public String getMonthName() {
        return switch (monthNumber) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }

    public String toString() {
        return getMonthName();
    }

    public boolean equals(@NotNull Month month) {
        return this.monthNumber == month.getMonthNumber();
    }

    public boolean greaterThan(@NotNull Month month) {
        return this.monthNumber > month.getMonthNumber();
    }

    public boolean lessThan(@NotNull Month month) {
        return this.monthNumber < month.getMonthNumber();
    }


}
