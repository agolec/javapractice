package StockReader;

public class Main {
    public static void main(String[] args)
    {
        //Create a stock object. for Toyota Motor Corporation.
        //The trading symbol is TM and the current
        //price per share as of July 2020 is 127.06 USD.
        StockReader toyota = new StockReader("TM", 127.06);
        StockReader mamiya = new StockReader("Mamiya-Op Co Ltd", 79.91);
        StockReader mamiya2 = new StockReader("Mamiya-Op Co Ltd", 79.91);

        System.out.println(toyota.toString());

        System.out.println("Checking equality for Mamiya and Mamiya2");
        printEqualityCheck(mamiya, mamiya2);

        System.out.println("Checking equality for toyota and Mamiya");
        printEqualityCheck(toyota, mamiya);
    }

    private static void printEqualityCheck(StockReader stock1, StockReader stock2) {
        if(stock1.equals(stock2))
        {
            System.out.println("Both objects are the same.");
        }
        else
        {
            System.out.println("Both objects are not the same.");
        }
    }
}
