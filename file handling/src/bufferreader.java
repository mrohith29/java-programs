import java.util.*;
import java.io.*;


public class bufferreader {
    public static void main(String[] args) throws IOException {
//        String file = "EOF.txt";
        BufferedReader reader = new BufferedReader(new FileReader("EOF.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
