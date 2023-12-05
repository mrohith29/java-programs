import java.util.Scanner;
public class custom_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<10) {
            try {
//                System.out.println();

                throw new RuntimeException("Runtime error occured");

            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        }
    }
}
