package Chapter9.ProgrammingChallenges.numberOne;

import java.time.LocalDate;
import java.time.ZoneId;


public class Employee {
    String name;
    String employeeID;
    LocalDate hireDate;

    public Employee(String name, String employeeNumber, String hireDate){

    }
    public Employee(){
        name = "";
        employeeID = "000-A";
        hireDate = LocalDate.of(1970,1,1);
        System.out.println("In the Employee constructor.");
    }

    private boolean validStringLength(String employeeNumber){
        boolean isValid = true;
        final int REQUIRED_LENGTH = 5;

        //Don't need a while statement since I'm not looping. Will perform a single check in an if statement.
        //If the employeeNumber length is not 5, we do not continue.
        if(employeeNumber.length() != REQUIRED_LENGTH){
            isValid = false;
        }
        return isValid;
    }

    public void setEmployeeID(String input) {
        this.employeeID = employeeID;
    }

    public void setHireDate(LocalDate date) {
        this.hireDate = date;
    }

    public LocalDate getHireDate(){
        return this.hireDate;
    }

    //find the difference in years between when the employee was hired and the current year.
    public long getYearsOfEmployment(){
        LocalDate dateToday = LocalDate.now(ZoneId.of("America/New_York"));

        long yearsOfEmployment = java.time.temporal.ChronoUnit.YEARS.between(this.hireDate,dateToday);

        return yearsOfEmployment;
    }
}

