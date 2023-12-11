package Hakerrank;
import java.util.Scanner;
public class data_types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        System.out.println(-(Math.pow(2,3)));
        for (int i = 0; i< T; i++) {
            try {
                long x = sc.nextLong();
                if (x < -Math.pow(2, 64) || x > Math.pow(2, 64) - 1) {
                    System.out.println(x+" can't be fitted anywhere.");
                }
                else {
                    System.out.println(x +" can be fitted in:");
                    if (x > -128 && x < 127) {
                        System.out.println("* short");
                    }
                    if (x > -(Math.pow(2, 32)) && x < Math.pow(2, 32) - 1) {
                        System.out.println("* int");
                    }
                    if (x > -(Math.pow(2, 64)) && x < Math.pow(2, 64) - 1) {
                        System.out.println("* long");
                    }
                }
            }
            catch (Exception e) {
                System.out.println(sc.next() + " cannot be fitted anywhere");
            }
        }
    }
}
