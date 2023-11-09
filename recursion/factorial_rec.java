package recursion;
import java.util.Scanner;
public class factorial_rec {
//    int fact = 1;
    public int factorial(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
                return n*factorial(n-1);
        }
    }
}

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial_rec f = new factorial_rec();
        System.out.println("Factorial of " + n + " : "+f.factorial(n));
    }
}