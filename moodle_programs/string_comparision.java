package moodle_programs;
import java.util.Scanner;

public class string_comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Strings are not of same length");
        }
        else {
            int count = 0;
            int index = -1;
            for (int i = 0; i < s1.length(); i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if (c1 != c2) {
                    count++;
                    index = i;
                }
            }
            if (count == 1) {
                System.out.println("String differ in exactly one position at index "+index);
            }
            else {
                System.out.println("String differ in "+count+" positions");
            }
        }
    }
}
