package moodle_programs;
import java.util.Scanner;

public class biggest0fTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}