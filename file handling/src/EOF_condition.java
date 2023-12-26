import java.util.Scanner;
import java.io.*;
public class EOF_condition {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        File f = new File("C:\\Users\\mariy\\OneDrive\\Desktop\\github repository\\java-programs\\file handling\\src\\EOF.txt");
            File f = new File("C:\\Users\\mariy\\OneDrive\\Desktop\\github repository\\java-programs\\file handling\\src\\EOF.txt");
//        System.out.println("File created successfully");
          FileWriter fw = new FileWriter("EOF.txt", true);
          BufferedWriter bw = new BufferedWriter(fw);
          String str = sc.nextLine();
          bw.write(str);
          bw.close();
        System.out.println("Data entering successfull");
    }
}
