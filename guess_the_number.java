import java.util.Scanner;
public class guess_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Make a guess");
            int num  = sc.nextInt();
            if (num > 45){
                System.out.println("The guessed number is more than the actual number");
            } else if (num < 45) {
                System.out.println("The guessed number is less than the actual number");
            }
            else {
                break;
            }
        }
        System.out.println("Yes you have made the correct guess 🎆🎇🎇");
    }
}
