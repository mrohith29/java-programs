//package moodle_programs;
//import java.util.List;
//import java.util.Scanner;
//import java.util.ArrayList;
//public class multipyStringBase {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        String[] inputs = input.split(" ");
//        String str = inputs[0];
//        int num = Integer.parseInt(inputs[1]);
//
//        String[] output = str.split("[\\s]");
//        int count = 0;
//        for (String x : output) {
//            count++;
//        }
//
//        if (count == 2) {
//            String out = "";
//            String newOut = "";
//            for (int i = str.length() - 1 - num; i < str.length() - 1; i++) {
//                out += str.charAt(i);
//            }
//            for (int i = 0; i < num; i++) {
//                newOut += out;
//            }
//            System.out.println(newOut);
//        } else {
//            System.out.println("length should be less than 2");
//        }
//    }
//}


package moodle_programs;

import java.util.Scanner;

public class multipyStringBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int count = 0;
        for (String st :
                inputs) {
            count ++;
        }

        if (count == 3) {
            int num = Integer.parseInt(inputs[2]);
            String out = input.substring(input.length() - num-2, input.length()-2);
            String newOut = out.repeat(num);
            System.out.println(newOut);
        } else {
            System.out.println("length " );
        }
    }
}
