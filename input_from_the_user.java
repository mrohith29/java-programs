//To accept the input from the user we need to import Scanner class, it is present in the util package
import java.util.*;

public class input_from_the_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);

        float y = sc.nextFloat();
        System.out.println(y);

        sc.nextLine(); // this will eat up the new line character

        String str = sc.nextLine();
        System.out.println(str);

        boolean a = sc.hasNextInt(); //check weather the input is an integer or not and returns a boolean value
        System.out.println(a);
    }
}
