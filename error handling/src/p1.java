import java.util.InputMismatchException;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        try {
            System.out.println(10 / divisor);
            throw new InputMismatchException();
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
