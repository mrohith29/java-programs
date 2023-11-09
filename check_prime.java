import java.util.*;
public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int check = 0;
        for(int i =1;i<=n;i++)
        {
            if(n%i == 0)
            {
                check++;
            }
        }
        if (check == 2)
        {
            System.out.println("number is prime");
        }
        else {
            System.out.println("not a prime number");
        }
    }
}
