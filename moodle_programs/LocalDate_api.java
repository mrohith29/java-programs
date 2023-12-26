package moodle_programs;
import java.util.Scanner;
import java.time.*;
public class LocalDate_api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        LocalDate date = LocalDate.of(day, month, year);
        int days = date.getDayOfYear();
        System.out.println(days);
    }
}
