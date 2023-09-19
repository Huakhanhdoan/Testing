import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BangQuyetDinh {

    @Test
    public void testValidNonEndOfMonthNonLeapYear() {
        String inputDate = "2023-09-19";
        String expectedNextDay = "2023-09-20";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testInvalidEndOfMonth() {
        String inputDate = "2023-02-28";
        String expectedNextDay = "2023-03-01";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testValidEndOfMonthNonLeapYear() {
        String inputDate = "2023-04-30";
        String expectedNextDay = "2023-05-01";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testValidNonEndOfMonthLeapYear() {
        String inputDate = "2024-02-28";
        String expectedNextDay = "2024-02-29";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testInvalidEndOfMonthLeapYear() {
        String inputDate = "2024-02-29";
        String expectedNextDay = "2024-03-01";
        String actualNextDay =Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testValidEndOfMonthLeapYear() {
        String inputDate = "2024-12-31";
        String expectedNextDay = "2025-01-01";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testInvalidDate() {
        String inputDate = "2023-02-30";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(null, actualNextDay);
    }
}