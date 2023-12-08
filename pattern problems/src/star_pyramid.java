import java.util.Scanner;
public class star_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
