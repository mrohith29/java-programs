package moodle_programs;

import java.util.Scanner;

class biggest0fTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().strip().split("\\s+");
        int[] numbers = new int[input.length];
        if (input.length > 2) {
            System.out.println("Only two numbers are allowed");
            System.exit(0);
        } else {

            // numbers[i] = Integer.parseInt(input[i]);
            for (String s : input) {
                if (s.matches("[^0-9]+")) {
                    System.out.println("invalid input only integers are allowed");
                    System.exit(0);
                }

            }
            for (int i = 0; i < 2; i++) {
                numbers[i] = Integer.parseInt(input[i]);
            }
            if (numbers[0] == numbers[1]) {
                System.out.println("numbers are equal");
            } else if (numbers[0] > numbers[1]) {
                System.out.println(numbers[0] + " is greater");
            } else {
                System.out.println(numbers[1] + " is greater");
            }

        }
    }
}