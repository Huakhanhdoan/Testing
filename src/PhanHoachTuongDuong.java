import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PhanHoachTuongDuong {

        @Test
        public void testValidNonEndOfMonthNonLeapYear() {
            String inputDate = "19-09-2023";
            String expectedNextDay = "20-09-2023";
            String actualNextDay = Main.calculateNextDay(inputDate);
            assertEquals(expectedNextDay, actualNextDay);
        }

        @Test
        public void testValidNonEndOfMonthLeapYear() {
            String inputDate = "29-02-2024";
            String expectedNextDay = "01-03-2024";
            String actualNextDay = Main.calculateNextDay(inputDate);
            assertEquals(expectedNextDay, actualNextDay);
        }

        @Test
        public void testValidEndOfMonthDecember() {
            String inputDate = "31-12-2023";
            String expectedNextDay = "01-01-2024";
            String actualNextDay = Main.calculateNextDay(inputDate);
            assertEquals(expectedNextDay, actualNextDay);
        }

        @Test
        public void testInvalidEndOfMonth() {
            String inputDate = "28-02-2023";
            String expectedNextDay = "01-03-2023";
            String actualNextDay = Main.calculateNextDay(inputDate);
            assertEquals(expectedNextDay, actualNextDay);
        }

        @Test
        public void testInvalidDate() {
            String inputDate = "30-02-2023";
            String actualNextDay = Main.calculateNextDay(inputDate);
            assertEquals("Invalid date", actualNextDay);
        }

}