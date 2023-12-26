package moodle_programs;//package moodle_programs;
//import java.util.Scanner;
//
//public class bidDigitSum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine().trim() ;
////        input = input.strip();
//        if (input.matches("\\d+")) {
//            int num = Integer.parseInt(input);
//            int sum = 0;
//            while(num != 0) {
//                int rem = num % 10;
//                sum += rem;
//                num /= 10;
//            }
//            System.out.println(sum);
//        }
//        else {
//            if (input.matches("[a-zA-Z]+[^//s]")) {
//                System.out.println("Only digits are allowed");
//            }
//            else {
//                System.out.println("Special characters are not allowed");
//            }
//        }
//    }
//}


import java.util.*;
class bidDigitSum
{
    static boolean app;
    public static void main(String[] args)
    {
        Scanner f=new Scanner(System.in);
        String str=f.nextLine().trim();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            int a=str.charAt(i);
            if(a>=97 && a<=122 || a>=65 && a<=90)
            {
                app=false;
                System.out.println("Only digits are allowed");
                break;
            }
            else if(a>=48 && a<=57)
            {
                app=true;
                int y=str.charAt(i)-48;
                sum=sum+y;
            }
            else
            {
                app=false;
                System.out.println("Special characters are not allowed");
                break;
            }
        }
        if((app))
            System.out.println(sum);

    }
}