import java.util.Scanner;

class throwing_errors extends Exception {
//    @Override
//    public String toString() {
//            return "this is an error made by you";
//    }

    @Override
    public String getMessage() {
        return "this is an error made by you only";
    }
}
public class custom_exception_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 10) {
            try {
                throw new throwing_errors();
            } catch (throwing_errors e) {
                throw new RuntimeException(e);
            }
        }
    }
}
