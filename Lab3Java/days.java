import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        LocalDate inputDate = GetDateFromUser();
        LocalDate currentDate = LocalDate.now();

        long daysSince = CalculateDaysBetween(inputDate, currentDate);

        System.out.println("It has been " + daysSince + " days since " + FormatDate(inputDate) + ".");
    }

    private static LocalDate GetDateFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date (YYYY-MM-DD): ");
        String DateString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(DateString, formatter);
    }

    private static long CalculateDaysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    private static String FormatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        return date.format(formatter);
    }
}
