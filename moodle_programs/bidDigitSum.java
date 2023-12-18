package moodle_programs;
import java.util.Scanner;

public class bidDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().strip();
//        input = input.strip();
        if (input.matches("\\d+")) {
            int num = Integer.parseInt(input);
            int sum = 0;
            while(num != 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            System.out.println(sum);
        }
        else {
            if (input.matches("[a-zA-Z]+")) {
                System.out.println("Only digits are allowed");
            }
            else {
                System.out.println("Special characters are not allowed");
            }
        }
    }
}