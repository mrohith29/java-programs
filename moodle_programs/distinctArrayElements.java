package moodle_programs;//package moodle_programs;// package moodle_programs;//package moodle_programs;
//// //import java.util.Scanner;
//// //public class distinctArrayElements {
//// //    public static void main(String[] args) {
//// //        Scanner sc = new Scanner(System.in);
//// //        int size = sc.nextInt();
//// //        int[] arr = new int[size];
//// //        int [] out = new int[size];
//// //        for (int i = 0; i < size; i++) {
//// //            arr[i] = sc.nextInt();
//// //        }
//// //        for (int i=0;i<size;i++) {
//// //            for (int j = 0; j < size; j++) {
//// //
//// //            }
//// //        }
//// //    }
//// //}
//
//
//// import java.util.*;
//
//// public class distinctArrayElements {
////     public static void main(String[] args) {
////         Scanner scanner = new Scanner(System.in);
////         int n = scanner.nextInt();
////         scanner.nextLine(); // consume newline left-over
////         String[] inputs = scanner.nextLine().split(" ");
////         int[] arr = new int[n];
////         for (int i = 0; i < n; i++) {
////             arr[i] = Integer.parseInt(inputs[i]);
////         }
//
////         LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
////         for (int i : arr) {
////             set.add(i);
////         }
//
////         for (int i : set) {
////             System.out.print(i + " ");
////         }
////     }
//// }
//
//import java.util.*;
//
//public class distinctArrayElements {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine(); // consume newline left-over
//        String[] inputs = scanner.nextLine().split(" ");
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = Integer.parseInt(inputs[i]);
//        }
//
//        ArrayList<Integer> arr1 = new ArrayList<Integer>();
//        for (int i : arr) {
//            if (!arr1.contains(i)) {
//                arr1.add(i);
//            }
//        }
//
//        for (int i : arr1) {
//            System.out.print(i + " ");
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class distinctArrayElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        int[] arr1 = new int[n];
        int length = 0;
        outer: for (int i : arr) {
            for (int j = 0; j < length; j++) {
                if (arr1[j] == i) {
                    continue outer;
                }
            }
            arr1[length++] = i;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}