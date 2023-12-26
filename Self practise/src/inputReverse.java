//import java.util.Scanner;
//public class inputReverse {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] input = sc.nextLine().trim().split("");
//        String[] output = new String[input.length];
//        for (int i = 0; i<input.length; i++) {
//            output[i] = input[input.length - 1 - i];
//        }
//        for (String i : output) {
//            System.out.print(i);
//        }
//    }
//}


import java.util.Scanner;
import java.util.regex.Pattern;

public class inputReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            char[] chars = word.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                reversed.append(chars[i]);
            }
            reversed.append(" ");
        }

        System.out.println(reversed.toString().trim());
    }
}
