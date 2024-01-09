import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
//import java.sql.Date;
//import java.sql.SQLOutput;

public class task5A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        File f = new File(filename);
        if (f.exists()) {
            System.out.println("file "+filename+" exists");
        }
        if (f.canRead()) {
            System.out.println("it can be readable");
        }
        if (f.canWrite()) {
            System.out.println("it is writable");
        }
        if (f.isDirectory()) {
            System.out.println("it is a directory");
        }

        System.out.println("The size of file is "+f.length()+" bytes");
        System.out.println("Path : "+f.getAbsolutePath());
        long l = f.lastModified();
        Date d = new Date(l);
        int year = d.getYear();
        int month = d.getMonth();
        int day = d.getDate();
        System.out.println(day+"/"+(month+1)+"/"+(1900+year));
//        System.out.println(day+" "+month+" "+year);
        }

}
