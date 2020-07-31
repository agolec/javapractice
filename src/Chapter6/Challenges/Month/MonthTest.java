package Chapter6.Challenges.Month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthTest {

    @Test
    void noArgMonthConstructor(){
        Month month = new Month();
        assertEquals(1,month.getMonthNumber());
        assertEquals("January",month.getMonthName());
    }

    @Test
    void intConstructor(){
        Month month = new Month(5);
        assertEquals(5,month.getMonthNumber());
        assertEquals("May",month.getMonthName());
    }

    @Test
    void stringConstructor(){
        Month month = new Month("March");
        assertEquals(3,month.getMonthNumber());
        assertEquals("March",month.getMonthName());
    }



    @Test
    void setMonthNumber() {
        Month monthInitializedUnderOne = new Month();
        monthInitializedUnderOne.setMonthNumber(-2);
        assertEquals(1,monthInitializedUnderOne.getMonthNumber());

        Month monthInitializedOverTwelve = new Month();
        monthInitializedUnderOne.setMonthNumber(13);
        assertEquals(1,monthInitializedUnderOne.getMonthNumber());

        Month monthInitializedBetweenOneAndTwelve = new Month();
        monthInitializedUnderOne.setMonthNumber(5);
        assertEquals(5,monthInitializedUnderOne.getMonthNumber());
    }

    @Test
    void getMonthNumber() {
        Month month = new Month(2);
        assertEquals(2,month.getMonthNumber());
    }

    @Test
    void getMonthName() {
        Month month = new Month("December");
        assertEquals("December",month.getMonthName());
    }

    @Test
    void testToString() {
        Month month = new Month("June");
        assertEquals("June",month.toString());
    }

    @Test
    void testEquals() {
        Month month = new Month("July");
        Month notEqualToMonth = new Month("June");
        Month equalToMonth = new Month(7);

        assertEquals(false,month.equals(notEqualToMonth));
        assertEquals(true,month.equals(equalToMonth));
    }

    @Test
    void greaterThan() {
        Month month = new Month("June");
        Month monthHigher = new Month("July");
        Month monthLower = new Month("February");

        assertEquals(false, month.greaterThan(monthHigher));
        assertEquals(true,month.greaterThan(monthLower));
    }

    @Test
    void lessThan() {
        Month month = new Month("June");
        Month monthHigher = new Month("July");
        Month monthLower = new Month("February");

        assertEquals(true, month.lessThan(monthHigher));
        assertEquals(false,month.lessThan(monthLower));
    }
}