package moodle_programs;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class breakStringToTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputString = sc.nextLine().trim().split("[\\s!?,._'@]+");
//        StringTokenizer input = new StringTokenizer(inputString);
        String[] output;
//        for(str: inputString) {
//            System.out.println(str);
//        }
        System.out.println(Arrays.stream(inputString).count());
//        StringTokenizer output = new StringTokenizer(inputString);
        System.out.println();
    for(String str: inputString) {
        System.out.println(str);
    }
    }
}
