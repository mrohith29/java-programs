package moodle_programs;
//import java.util.Arrays;
import java.util.Scanner;
public class displayDups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] in = sc.nextLine().split(" ");
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = Integer.parseInt(in[i]);
        }

        int[] arr = new int[size];
        int x = 0;
        outer:
        for (int i : input) {
            for (int j = 0; j < x; j++) {
                if (i == arr[j]) {
                    continue outer;
                }
            }
            arr[x++] = i;
        }

        int[] output = new int[size-x];
        int y = 0;
        for (int i : arr) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (i == input[j]) {
                    count++;
                }
            }
            if (count > 1) {
                output[y++] = i;
            }
        }

        if (y > 0) {
            if (y == 1) {
                System.out.println("List of Duplicates: ["+output[0]+"]");
            }
            else {
                System.out.print("List of Duplicates: ["+output[0]);
                for (int i = 1; i < y; i++) {
                    System.out.print(", "+output[i]);
                }
                System.out.print("]");
            }
        }
        else {
            System.out.println("Duplicates: []");
        }
    }
}
