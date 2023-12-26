package moodle_programs;
import java.util.Scanner;
public class stringConcatTwist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n2+1>str1.length() || n2+1>str2.length()) {
            System.out.println("Oops ");
            System.exit(0);
        }
        String newStr1 = str1.substring(n1, n2);
        String newStr2 = str2.substring(0,n3);
        String newStr3 = str2.substring(n3+newStr1.length(),str2.length());
        System.out.println(newStr2.concat(newStr1.concat(newStr3)));
    }
}
