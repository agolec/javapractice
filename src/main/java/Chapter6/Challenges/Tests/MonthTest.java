package Chapter6.Challenges.Tests;

import Chapter6.Challenges.Month.Month;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class MonthTest {



    @Test
    public void noArgMonthConstructor(){
        Month month = new Month();
        
        assertEquals(1,month.getMonthNumber());
        assertEquals("January",month.getMonthName());
    }

    @Test
    public void When_MayGivenAsMonthNumberInConstructor_MonthEqualsMay(){
        Month month = new Month(5);

        assertEquals(5,month.getMonthNumber());
        assertEquals("May",month.getMonthName());
    }

    @Test
    public void Should_MonthBeMarch_WhenStringConstructorPassedStringMarch(){
        Month month = new Month("March");

        assertEquals(3,month.getMonthNumber());
        assertEquals("March",month.getMonthName());
    }

    @Test
    public void Should_MonthEqualOne_WhenNumberUnderOneGivenToConstructor() {
        Month month = new Month();
        month.setMonthNumber(-2);

        assertEquals(1,month.getMonthNumber());
    }

    @Test
    public void Should_MonthEqualOne_WhenNumberOverTwelveGivenToIntConstructor(){
        Month month = new Month();
        month.setMonthNumber(13);

        assertEquals(1,month.getMonthNumber());
    }
    @Test
    public void Should_MonthEqualWhatUserEntered_WhenNumberBetweenOneAndTwelve(){
        Month month = new Month();
        month.setMonthNumber(5);

        assertEquals(5,month.getMonthNumber());
    }

    @Test
    public void getMonthNumber() {
        Month month = new Month(2);

        assertEquals(2,month.getMonthNumber());
    }

    @Test
    public void getMonthName_doesDecemberStringConstructorReturnDecemberMonthName_True() {
        Month month = new Month("December");

        assertEquals("December",month.getMonthName());
    }
    @Test
    public void getMonthName_doesDecemberIntConstructorReturnDecemberMonthName_True() {
        Month month = new Month(12);

        assertEquals("December",month.getMonthName());
    }

    @Test
    public void toString_doesJuneInStringConstructorReturnJuneIntoString_True() {
        Month month = new Month("June");

        assertEquals("June",month.toString());
    }

    @Test
    public void When_JulyComparedToJune_equalsIsFalse() {
        Month month = new Month("July");
        Month notEqualToMonth = new Month("June");

        assertEquals(false,month.equals(notEqualToMonth));
    }
    //Should different combinations of constructor calls be made
    //here to run this method against all combinations of
    //an object that's been constructed by String and int constructors?
    @Test
    public void When_JulyComparedToJuly_equalsIsTrue() {
        Month month = new Month("July");
        Month equalToMonth = new Month(7);

        assertEquals(true,month.equals(equalToMonth));
    }


    @Test
    public void When_JuneComparedToJuly_GreaterThanIsFalse() {
        Month month = new Month("June");
        Month monthHigher = new Month("July");

        assertEquals(false, month.greaterThan(monthHigher));
    }

    @Test
    public void When_JuneComparedToFebruary_GreaterThanIsTrue() {
        Month month = new Month("June");
        Month monthLower = new Month("February");

        assertEquals(true,month.greaterThan(monthLower));
    }

    @Test
    public void When_JuneComparedToJuly_lessThanComparisonIsTrue() {
        Month month = new Month("June");
        Month monthHigher = new Month("July");

        assertEquals(true, month.lessThan(monthHigher));
    }
    @Test
    public void When_JuneComparedToMarch_lessThanComparisonIsFalse(){
        Month month = new Month("June");
        Month monthLower = new Month("February");

        assertEquals(false,month.lessThan(monthLower));
    }
}