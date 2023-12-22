import java.util.Scanner;
class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] string = str.split("");
        for (String i :
                string) {
            System.out.println(i);
        }
    }
}