import javax.management.StandardEmitterMBean;
import java.util.Scanner;

//class
public class throws_1 {
    static int temp() {//throws ArithmeticException {
        return 10/0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        try {
            System.out.println(temp());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
