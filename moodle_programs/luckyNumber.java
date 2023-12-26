//package moodle_programs;
//
//import java.util.Scanner;
//
//public class luckyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        sc.nextInt();
//        int[][] mat = new int[size][size];
//        for (int i = 0; i < size; i++) {
//            String[] in = sc.nextLine().trim().split("\\s+");
//            for (int j = 0; j < size; j++) {
//                mat[i][j] = Integer.parseInt(in[j]);
//            }
//        }
//
//        int smallcol = 0;
//        int largerow=0;
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 1; j < size; j++) {
//                if (mat[i][j-1] < mat[i][j]) {
//                    smallcol = j-1;
//                }
//            }
//        }
//
//        for (int i = 1; i < size; i++) {
//            if (mat[i - 1][smallcol] > mat[i][smallcol]) {
//                largerow = i-1;
//            }
//        }
//
//        System.out.println("Lucky Number: " + mat[largerow][smallcol]);
//    }
//}


package moodle_programs;

import java.util.Scanner;

public class luckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        int[][] mat = new int[size][size];
        for (int i = 0; i < size; i++) {
            String[] in = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < size; j++) {
                mat[i][j] = Integer.parseInt(in[j]);
            }
        }

        int smallcol = 0;
        int largerow=0;

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (mat[i][j] < mat[i][smallcol]) {
                    smallcol = j;
                }
            }
        }

        for (int i = 1; i < size; i++) {
            if (mat[i][smallcol] > mat[largerow][smallcol]) {
                largerow = i;
            }
        }

        System.out.println("Lucky Number: " + mat[largerow][smallcol]);
        sc.close();
    }
}