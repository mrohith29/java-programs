package moodle_programs;
import java.util.Scanner;
public class largest_power_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int po3 = 1; // since least power is 3^0 = 1
        while (po3 <= input) {
            po3 = po3 * 3;
        }
        System.out.println("The power of 3 less than the x is = " + po3/3);
    }
}
