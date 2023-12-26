package moodle_programs;
import java.util.Scanner;
import java.time.*;
public class code9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        int x = date.lengthOfMonth();
//        System.out.println(x);
        LocalDate lastDate = LocalDate.of(year, month, x);

        System.out.println(date.getDayOfWeek());
        System.out.println(lastDate.getDayOfWeek());
    }
}
