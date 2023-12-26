package moodle_programs;
import java.util.Scanner;
public class kthSmallestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[rows*cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            String[] in = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < cols; j++) {
                arr[index++] = Integer.parseInt(in[j]);
            }
        }
        int pos = sc.nextInt();
        for (int i=0;i<rows*cols;i++) {
            for (int j = 0; j < rows * cols - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[pos-1]);
    }
}
