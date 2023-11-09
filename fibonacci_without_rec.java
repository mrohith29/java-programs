import java.util.*;
public class fibonacci_without_rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first_num = 0;
        int second_num = 1;
        int next_num = 0;
        System.out.println("Fibonacci series (without recursion)");
        for (int i = 0; i<n;i++)
        {
            System.out.print(first_num+" ");
            next_num = first_num + second_num;
            first_num = second_num;
            second_num = next_num;
        }
    }
}
