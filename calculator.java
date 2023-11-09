import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Calculator application");
        System.out.println("In this calculator, we perform basic operations like:");
        System.out.println("(1) Addition\n(2) Subtraction\n(3) Multiplication\n(4) Division");
        String opinion;

        do {
            System.out.println("Enter two integer numbers to perform any operation:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Enter the operation you want to perform:");
            String op = sc.next();

            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    if (b != 0) {
                        System.out.println(a / b);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Please enter a correct operation.");
                    break;
            }

            System.out.println("Thank you for using our service. Do you want to perform one more operation? (Enter Y or N)");
            opinion = sc.next();
        } while (opinion.equalsIgnoreCase("Y"));

        System.out.println("THANK YOU");
    }
}
