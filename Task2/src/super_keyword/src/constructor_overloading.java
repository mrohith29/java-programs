import java.util.Scanner;
class sum {

    int a,b;

    sum(int i, int j)
    {
        a = i;
        b = j;
    }
    sum()
    {
        System.out.println("The sum of provided numbers is " + (a+b));
    }
}

class access extends sum{

    access(int i, int j)
    {
//        super();
        super(i,j);
//        super();
//        System.out.println(a+b);
    }
    access()
    {
        super();
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        access nums = new access();
    }
}
