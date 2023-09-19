import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PhanHoachTuongDuong {

        @Test
        public void testValidNonEndOfMonthNonLeapYear() {
            String inputDate = "2023-09-19";
            String expectedNextDay = "2023-09-20";
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
        public void testValidEndOfMonthDecember() {
            String inputDate = "2023-12-31";
            String expectedNextDay = "2024-01-01";
            String actualNextDay = Main.calculateNextDay(inputDate);
            assertEquals(expectedNextDay, actualNextDay);
        }

        @Test
        public void testInvalidEndOfMonth() {
            String inputDate = "2023-02-28";
            String expectedNextDay = "2023-03-01"; // Sửa lỗi, ngày tiếp theo của ngày cuối tháng 2 là ngày 1 tháng 3
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