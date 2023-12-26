package moodle_programs;
import java.util.Scanner;
public class shift_alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
//        StringBuilder sb = sc.;
//        String sb1 = sb.toString();
        StringBuilder nsb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)) {
                nsb.append((char) (c + 1));
            } else {
                nsb.append(c);
            }
        }
        System.out.println(nsb);
    }
}
