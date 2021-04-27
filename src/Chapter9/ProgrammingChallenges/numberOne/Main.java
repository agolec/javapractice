package Chapter9.ProgrammingChallenges.numberOne;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //String input = new String();

        ProductionWorker employee = new ProductionWorker(1,40);

        setEmployeeID(employee, keyboard);
        setEmployeeHireDate(employee);

        System.out.println("Hire date of employee is: " + employee.getHireDate());

        System.out.println("Employee has been with the company for " + employee.getYearsOfEmployment() + " years.");
        System.out.println("Employee was hired on " + employee.getHireDate());

        //System.out.println("The smployee's shift is: " + employee.getShift());
        //System.out.println("The hourly pay is: " + employee.getHourlyPay());

        setEmployeeShift(employee, keyboard);

        setEmployeeHourlyRate(employee, keyboard);

        System.out.println("Employee Shift is: " + employee.getShift());
        System.out.println("Employee Hourly Rate is: " + employee.getHourlyRate());
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
        employee.setEmployeeID(input);
        System.out.println("Input valid.");

    }
    private static void setEmployeeHireDate(Employee employee){
        LocalDate hireDate = LocalDate.of(1980,01,01);
        employee.setHireDate(hireDate);
    }

    private static void setEmployeeShift(ProductionWorker employee, Scanner keyboard){
        String input = "";

        System.out.println("Enter your shift. \n" +
                "Enter 1 for 'day' shift.\n" +
                "2 for night shift.");

        input = keyboard.nextLine();


        while(!EmployeeIDValidator.areCharactersDigits(input)){
            System.out.println("Input is not a digit. Enter 1 for day shift or 2 for night shift: ");
            input = keyboard.nextLine();
        }

        while((Integer.parseInt(input) != 1) && (Integer.parseInt(input) != 2)){
            System.out.println(employee.printShiftInputError() + "\nInput value is \'" + input + "\'.");

            input = keyboard.nextLine();

            while(!EmployeeIDValidator.areCharactersDigits(input)){
                System.out.println("Input is not a digit. Enter 1 for day shift or 2 for night shift: ");
                input = keyboard.nextLine();
            }
        }

        employee.setShift(Integer.parseInt(input));

        System.out.println("entered employee shift.");
    }

    private static void setEmployeeHourlyRate(ProductionWorker employee, Scanner keyboard){
        String input = "";

        System.out.println("Enter your hourly rate: ");
        input = keyboard.nextLine();

        while(!EmployeeIDValidator.areCharactersDigits(input)){
            System.out.println("Input is not a proper format. Re enter this");
            input = keyboard.nextLine();

        }
        employee.setHourlyPay(Double.parseDouble(input));

    }



}

