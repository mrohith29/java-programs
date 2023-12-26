package moodle_programs;
import java.util.Scanner;
import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            BigInteger fact = BigInteger.ONE;
            if (num == 0) {
                System.out.println(1);
            }
            else {
                for (int i = num; i > 0; i--) {
                    fact = fact.multiply(BigInteger.valueOf(i));
                }
                System.out.println(fact);
            }
        } else {
            System.out.println("Please enter only numbers");
        }
    }
}