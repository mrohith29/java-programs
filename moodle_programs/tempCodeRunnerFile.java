package moodle_programs;
import java.util.Scanner;

class biggestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\s+");
        int[] numbers = new int[input.length];
        if (input.length > 2) {
            System.out.println("Only two numbers are allowed");
            System.exit(0);
        }
        for (int i = 0; i < input.length; i++) {
//            numbers[i] = Integer.parseInt(input[i]);
            if (input[i].matches("[a-zA-Z]")) {
                System.out.println("invalid input only integers are alowed");
                System.exit(0);
            }
        }
//        if (input[0] > input[1]) {
//
//        }

    }
}