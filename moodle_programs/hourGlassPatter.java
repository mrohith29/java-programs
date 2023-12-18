package moodle_programs;
import java.util.Scanner;
public class hourGlassPatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            int x = i+1;
            for (int j =0; j < n - i; j++) {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        for (int i=0;i<n-1;i++){
            for (int j = n-1; j > i+1; j--) {
                System.out.print(" ");
            }
            int x = n-i-1;
            for (int j =n; j > n-i-2; j--) {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
