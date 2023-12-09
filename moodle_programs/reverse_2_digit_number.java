package moodle_programs;
import java.util.Scanner;
public class reverse_2_digit_number {
    static String  reverse(int input) {
        String output = "";
        int temp;
        temp = input;
        if (input < 0) {
            input = -1 * input;
        }
        String s = String.format("%d", input);
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            output += ch;
        }
        if (temp < 0) {
            return '-' + output;
        }
        else {
            return (output);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(reverse(input));
    }
}
