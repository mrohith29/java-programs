package moodle_programs;
import java.util.Scanner;
public class twinCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ch = sc.nextLine();
        String x;
        String y;
        Boolean accpt = false;
        for (int i = 0; i < input.length() - 1; i++) {
            x = new String(String.valueOf(input.charAt(i)));
            y = new String(String.valueOf(input.charAt(i+1)));
            if (input.charAt(i) == ch.charAt(0) && input.charAt(i+1) == ch.charAt(0)) {
                accpt = true;
                break;
            }
        }
        if (accpt) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
