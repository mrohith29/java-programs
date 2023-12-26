package moodle_programs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class uniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            if (sc.hasNextInt()) {
                input[i] = sc.nextInt();
            }
        }

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i : input) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (input[j] == i) {
                    count++;
                }
            }

            if (count == 1) {
                al.add(i);
            }
        }

        if (!al.isEmpty()) {
            for (int k : al) {
                System.out.print(k+" ");
            }
        }
        else {
            System.out.println("No unique elements");
        }
    }
}
