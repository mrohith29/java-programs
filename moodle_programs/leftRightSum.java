package moodle_programs;
import java.util.Scanner;
public class leftRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String []in = sc.nextLine().split(" ");
        int[] input = new int[size];
        for (int i = 0; i < size; i++) {
            input[i] = Integer.parseInt(in[i]);
        }
        for (int i = 0; i < size; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum+=input[j];
            }
            for (int j = i + 1; j < size; j++) {
                rightSum+=input[j];
            }
            System.out.print(Math.abs(leftSum-rightSum)+" ");
        }
    }
}
