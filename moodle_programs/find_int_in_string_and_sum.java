package moodle_programs;
import java.util.Arrays;
import java.util.Scanner;
public class find_int_in_string_and_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for (String word : str.split(" ")) {
            try {
                int num = Integer.parseInt(word);
                sum += num;
            } catch (Exception e) {

            }
        }
        System.out.println(sum);
        }
}
