package moodle_programs;
import java.util.Scanner;
public class dupNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }

        int[] arr = new int[size];
        int x =0;
    outer:
    for (int i :input) {
        for (int j = 0; i < x; i++) {
            if (arr[j] == i) {
                continue outer;
            }
        }
        arr[x++] = i;
    }

        for (int i : arr) {
            int count = 0;
            for (int j = 0; j < x; j++) {
                if (i == input[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Duplicate Element: "+i);
                System.exit(0);
            }
        }
        System.out.println("No duplicate element is found");
    }
}
