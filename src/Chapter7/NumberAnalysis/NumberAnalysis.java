package Chapter7.NumberAnalysis;

import org.jetbrains.annotations.NotNull;

public class NumberAnalysis {

    private int [] numbers;
    private int average;
    private int lowest;
    private int highest;
    private int total;

    public NumberAnalysis(){
        average = 0;
        lowest = 0;
        highest = 0;
        total = 0;
        numbers = new int [5];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 0;
        }
    }

    public NumberAnalysis(int @NotNull [] input)
    {
        numbers = new int[input.length];
        for(int i = 0; i < input.length; i++)
        {
            numbers[i] = input[i];
        }
    }

    public void setArray(int @NotNull [] input)
    {
        numbers = new int[input.length];
        for(int i =0; i < numbers.length; i++)
        {
            numbers[i] = input[i];
        }
    }

    private int calcMinimumValue()
    {
        this.lowest = numbers[0];

        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] < lowest)
            {
                lowest = numbers[i];
            }
        }
        return lowest;
    }

    private int calcMaximumValue()
    {
        highest = numbers[0];

        for(int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] > highest)
            {
                highest = numbers[i];
            }
        }
        return highest;
    }
    private int calcAverage()
    {
        int total = 0;
        try{
            for(int i = 0; i < numbers.length; i++)
            {
                total += numbers[i];
            }
            average = total / numbers.length;

        } catch (ArithmeticException e){
            System.out.println("cannot divide by 0");
        }

        return average;


    }
    private int calcTotal()
    {

        for(int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
        }
        return total;
    }

    public int getAverageValue(){
        return calcAverage();
    }
   public int getMinimumValue(){
        return calcMinimumValue();
   }
   public int getMaximumValue(){
        return calcMaximumValue();
   }
   public int getTotalValue(){
        return calcTotal();
   }

   public int getAverageField() { return this.average;}
   public int getMinimumField() { return this.lowest; }
   public int getMaximumField() { return this.highest;}
   public int getTotalField() { return this.total; }
   public int[] getEntryArrayField() { return this.numbers; }

    @Override
    public String toString()
    {

        StringBuilder message = new StringBuilder();

        message.append("The array contains the following values: { ");

        for(int i = 0; i < numbers.length; i++)
        {
            if(i != (numbers.length - 1))
            {
                message.append(" [" + numbers[i] + "],");
            }
            else {
                message.append(" [" + numbers[i] + "]");
            }
        }

        message.append(" }");
        message.append("\n\n");

        message.append("The average is: " + average + ".\n");
        message.append("The highest value is: " + highest + "\n");
        message.append("The lowest value is: " + lowest + "\n");
        message.append("The total is: " + total );

        String singleString = message.toString();

        return singleString;
    }

}
