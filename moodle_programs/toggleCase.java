package moodle_programs;
import java.util.Scanner;
public class toggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                ans += Character.toLowerCase(ch);
            else
                ans += Character.toUpperCase(ch);
        }
        System.out.println(ans);
    }
}
