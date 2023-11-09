import java.util.Scanner;

class staticMethod {
    static int printSum(int a, int b) {
        return a+b;
    }
}
public class Static_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = staticMethod.printSum(sc.nextInt(), sc.nextInt()); // Since the method is static we can directly access the method from the class without any object creation
        System.out.println("The sum of given numbers is " + answer);
    }
}

// Static methods are methods that belong to the class rather than an instance.