package Chapter10.FileExists;

import util.FileUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileExistenceDemo {
    public static void main(String[] args) {
        String fileName = "alwaysWrong";
        int months = 0;
        double oneMonth;
        double totalSales = 0.0;
        double averageSales;

        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        Scanner inputFile = FileUtil.openFile(fileName);

        boolean fileExists = FileUtil.doesFileExist(inputFile);

        while (!fileExists) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("ERROR: " + fileName + " does not exist.\n" +
                    "Enter another file name: ");
            fileName = keyboard.nextLine();
            inputFile = FileUtil.openFile(fileName);

            fileExists = FileUtil.doesFileExist(inputFile);


        }
        while(inputFile.hasNext()){
            try{
                //get a month's sales amount.
                oneMonth = inputFile.nextDouble();
                totalSales += oneMonth;
                months++;
            } catch(InputMismatchException e){
                //Display an error message if non-numeric data is encountered.
                System.out.println("Nonnumeric data " +
                                "encountered in the file: " +
                                e.getMessage());

                System.out.println("Invalid record to be skipped.");
                inputFile.nextLine();
            }
        }
        inputFile.close();

        averageSales = totalSales / months;

        System.out.println("Number of months: " + months);
        System.out.println("Total sales: $" + totalSales);
        System.out.println("Average Sales: $" + averageSales);
    }

}
