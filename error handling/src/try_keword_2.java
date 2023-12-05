import java.util.Scanner;
public class try_keword_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int a = sc.nextInt();
        int ind = sc.nextInt();
        try {
//            System.out.println(10/0);
//            System.out.println("stmt 1");
            System.out.println(arr[ind] / a);
        }
        catch (ArithmeticException e)
        {
            System.out.println("division by zero");
            System.out.println(e);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Indexoutofrange error");
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println("null pointer exception");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("exception handling");
            System.out.println(e);
        }
    }
}
