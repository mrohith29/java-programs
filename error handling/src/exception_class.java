import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;
class MyException extends Exception {
    @Override
    public String toString() {
        return "i am tostring";
    }

    @Override
    public String getMessage() {
        return "i am getmessage";
    }
}

public class exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<9) {
            try {
                System.out.println("hello");
                throw new MyException();
            }
            catch (Exception e) {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
