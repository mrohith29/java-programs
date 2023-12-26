package moodle_programs;////package moodle_programs;
////
////import java.util.Scanner;
////
////public class luckyNumber {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int size = sc.nextInt();
////        sc.nextInt();
////        int[][] mat = new int[size][size];
////        for (int i = 0; i < size; i++) {
////            String[] in = sc.nextLine().trim().split("\\s+");
////            for (int j = 0; j < size; j++) {
////                mat[i][j] = Integer.parseInt(in[j]);
////            }
////        }
////
////        int smallcol = 0;
////        int largerow=0;
////
////        for (int i = 0; i < size; i++) {
////            for (int j = 1; j < size; j++) {
////                if (mat[i][j-1] < mat[i][j]) {
////                    smallcol = j-1;
////                }
////            }
////        }
////
////        for (int i = 1; i < size; i++) {
////            if (mat[i - 1][smallcol] > mat[i][smallcol]) {
////                largerow = i-1;
////            }
////        }
////
////        System.out.println("Lucky Number: " + mat[largerow][smallcol]);
////    }
////}
//
//
//package moodle_programs;
//
//import java.util.Scanner;
//
//public class luckyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        sc.nextLine();
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
//                if (mat[i][j] < mat[i][smallcol]) {
//                    smallcol = j;
//                }
//            }
//        }
//
//        for (int i = 1; i < size; i++) {
//            if (mat[i][smallcol] > mat[largerow][smallcol]) {
//                largerow = i;
//            }
//        }
//
//        System.out.println("Lucky Number: " + mat[largerow][smallcol]);
//        sc.close();
//    }
//}

import java.util.*;

public class luckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            int minRow = mat[i][0];
            int minColIndex = 0;
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] < minRow) {
                    minRow = mat[i][j];
                    minColIndex = j;
                }
            }

            boolean isLucky = true;
            for (int k = 0; k < rows; k++) {
                if (mat[k][minColIndex] > minRow) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                luckyNumbers.add(minRow);
            }
        }

        System.out.println("Lucky Numbers: " + luckyNumbers);
    }
}