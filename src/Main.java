import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        String nextDay = calculateNextDay(inputDate);
        System.out.println("Ngày tiếp theo là: " + nextDay);

        scanner.close();
    }

    public static String calculateNextDay(String currentDate) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(currentDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(Calendar.DAY_OF_MONTH, 1);

            String nextDay = dateFormat.format(calendar.getTime());

            return nextDay;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
