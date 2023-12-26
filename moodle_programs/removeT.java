package moodle_programs;
import java.util.Arrays;
import java.util.Scanner;
class removeT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String first = input.substring(0,1);
        String middle = input.substring(1, input.length() - 1);
        String last = input.substring(input.length() - 1, input.length());
        middle = middle.replace("t", "");
        middle = middle.replace("T", "");
        String output = first+middle+last;
        System.out.println(output);
    }
}
