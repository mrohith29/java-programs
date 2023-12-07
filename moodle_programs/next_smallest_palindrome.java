package moodle_programs;
import java.util.Scanner;
public class next_smallest_palindrome {
    static long palindrome_finder(long num) {
        long temp = num;
        do {
            temp++;
        }while (!palindrome(temp));

        return temp;
    }

    static boolean palindrome(long x) {
            String s = String.format("%d", x);
            String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char t = s.charAt(i);
            s1 += t;
        }

        return s.equals(s1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(palindrome_finder(num));
    }
}
