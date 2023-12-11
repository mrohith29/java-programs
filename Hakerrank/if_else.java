package Hakerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class if_else {
    public static void main(String[] args)  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int N = 3;
        System.out.println(N);
//        bufferedReader.close();
       if (N % 2 != 0) {
    System.out.println("Weird");
} else {
    if (N >= 2 && N <= 5) {
        System.out.println("Not Weird");
    } else if (N >= 6 && N <= 20) {
        System.out.println("Weird");
    } else {
        System.out.println("Not Weird");
    }
}
    }
}
