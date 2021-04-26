package Chapter9.ProgrammingChallenges.numberOne;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //String input = new String();

        Employee employee = new Employee();

        setEmployeeID(employee, keyboard);
        setEmployeeHireDate(employee);

        System.out.println("Hire date of employee is: " + employee.getHireDate());

        System.out.println("Employee has been with the company for " + employee.getYearsOfEmployment() + " years.");
        System.out.println("Employee was hired on " + employee.getHireDate());


    }

    private static void setEmployeeID(Employee employee, Scanner keyboard){
        //Local variable for gathering input.
        String input;

        System.out.println("Enter a string in the format 'XXX-L'\n" +
                "Where X is a 0-9 digit, followed by -, and L is a alphanumberic letter A-M.");
        input = keyboard.nextLine();

        while(EmployeeIDValidator.isValidInput(input,keyboard) == false){
            System.out.println(EmployeeIDValidator.printError());

            input = keyboard.nextLine();
        }
        employee.setEmployeeNumber(input);
        System.out.println("Input valid.");

    }
    private static void setEmployeeHireDate(Employee employee){
        LocalDate hireDate = LocalDate.of(1980,01,01);
        employee.setHireDate(hireDate);
    }



}

