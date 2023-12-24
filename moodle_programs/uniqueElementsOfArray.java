package moodle_programs;
import java.util.Scanner;
public class uniqueElementsOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] input = sc.nextLine().split(" ");
        int max = 0;
        for (int i=0;i< input.length-1;i++) {
            if (Integer.parseInt(input[i]) > Integer.parseInt(input[i+1])){
                max = Integer.parseInt(input[i]);
            }
        }
        int[] count = new int[max];

    }
}