package moodle_programs;
import java.util.Scanner;
public class jack_getting_dicy {
    static void Met(int i1, int i2, boolean bool) {
        if (bool) {
            if ((i1 == i2) && (i1 != 6)) {
                System.out.println(i1+i2+1);
            }
            else  if (i1 == i2){
                System.out.println(7);
            }
            else {
                System.out.println(i1+i2+1);
            }
        }
        else {
            System.out.println(i1+i2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
//        String s = sc.nextLine();
        boolean bool = sc.nextBoolean();
        Met(i1,i2, bool);
    }
}
