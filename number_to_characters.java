import java.util.Scanner;

public class number_to_characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String n = input.nextLine();
        for (int i = 0; i < n.length(); i++) {
            System.out.print(numbers[Character.getNumericValue(n.charAt(i))] + " ");
        }
    }
}