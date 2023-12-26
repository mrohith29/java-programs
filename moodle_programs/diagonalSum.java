package moodle_programs;
import java.util.Scanner;
public class diagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] mat = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (sc.hasNextInt()) {
                    mat[i][j] = sc.nextInt();
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += mat[i][i];
            sum += mat[i][size - i - 1];
        }
        if (size % 2 == 1) {
            sum -= mat[size / 2][size / 2];
        }

        System.out.println(sum);
    }
}
