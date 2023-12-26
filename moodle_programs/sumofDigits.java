import java.util.Scanner;

class sumofDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] newstr = str.split("");
        int sum = 0;
        for (String i : newstr) {
            if (Character.isDigit(i.charAt(0))) {
                int x = Integer.parseInt(i);
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
