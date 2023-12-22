package moodle_programs;
import java.util.Arrays;
import java.util.Scanner;
public class newStringCharacterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = Arrays.toString(sc.nextLine().split("\\s"));
        String[] inArray = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            inArray[i] = String.valueOf(input.charAt(i));
        }
        String output = "";
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i < n1 + n2; i++) {
            output+=inArray[i];
        }
        System.out.println(output);
    }
}
