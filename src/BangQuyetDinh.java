import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BangQuyetDinh {

    @Test
    public void testValidNonEndOfMonthNonLeapYear() {
        // Đầu vào hợp lệ, không phải cuối tháng, không phải năm nhuận => Ngày tiếp theo
        String inputDate = "15-10-2021";
        String expectedNextDay = "16-10-2021";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testValidEndOfMonthLeapYear() {
        // Đầu vào hợp lệ, cuối tháng, năm nhuận => Ngày tiếp theo
        String inputDate = "29-02-2020";
        String expectedNextDay = "01-03-2020";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testValidEndOfMonthNonLeapYear() {
        // Đầu vào hợp lệ, cuối tháng, không phải năm nhuận => Ngày tiếp theo
        String inputDate = "28-02-2021";
        String expectedNextDay = "01-03-2021";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testValidNonEndOfMonthLeapYear() {
        // Đầu vào hợp lệ, không phải cuối tháng, năm nhuận => Ngày tiếp theo
        String inputDate = "19-01-2020";
        String expectedNextDay = "20-01-2020";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedNextDay, actualNextDay);
    }

    @Test
    public void testInvalidEndOfMonthLeapYear() {
        // Đầu vào không hợp lệ, cuối tháng, năm nhuận => Lỗi (Không hợp lệ)
        String inputDate = "30-02-2020";
        String expectedError = "Invalid date";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedError, actualNextDay);
    }

    @Test
    public void testInvalidEndOfMonthNonLeapYear() {
        // Đầu vào không hợp lệ, cuối tháng, không phải năm nhuận => Lỗi (Không hợp lệ)
        String inputDate = "29-02-2021";
        String expectedError = "Invalid date";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedError, actualNextDay);
    }

    @Test
    public void testInvalidNonEndOfMonth() {
        // Đầu vào không hợp lệ, không phải cuối tháng, không phải năm nhuận => Lỗi (Không hợp lệ)
        String inputDate = "13-13-2020";
        String expectedError = "Invalid date";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedError, actualNextDay);
    }

    @Test
    public void testInvalidNonEndOfMonthNonLeapYear() {
        // Đầu vào không hợp lệ, không phải cuối tháng, không phải năm nhuận => Lỗi (Không hợp lệ)
        String inputDate = "32-2-2021";
        String expectedError = "Invalid date";
        String actualNextDay = Main.calculateNextDay(inputDate);
        assertEquals(expectedError, actualNextDay);
    }
}