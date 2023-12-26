package Hakerrank;
import java.util.Scanner;
public class input_types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // for integer input
        double b = sc.nextDouble(); // for double input
        sc.nextLine(); // to clear the buffer
        String c = sc.nextLine(); // for string input
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
