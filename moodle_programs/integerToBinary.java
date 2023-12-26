package moodle_programs;
import java.util.Scanner;
public class integerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input > 0 && input <= 225) {
            String binary = Integer.toBinaryString(input);
            System.out.println(binary);
            String paddedBinary = String.format("%8s", binary).replace(' ', '0');
            System.out.println(paddedBinary);
        } else {
            System.out.println("Enter between 1 to 225");
        }
    }
}
