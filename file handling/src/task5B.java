import java.io.*;
import java.util.*;
public class task5B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filepath = br.readLine();
        File f = new File(filepath);
        try {
            boolean created = f.createNewFile();
            if (created) {
                System.out.println("file created successfully");
            } else {
                System.out.println("file already exists");
//                f.delete();
//                System.out.println("File deleted successfully");
            }
        } catch (IOException exception) {
            System.out.println(exception);
        }

        System.out.println(f.length());
//        FileInputStream fis = new FileInputStream(filepath);
        BufferedWriter bw = null;
        try {
//           FileOutputStream fos = new FileOutputStream(filepath);
            FileWriter fw = new FileWriter(filepath, true);
            bw = new BufferedWriter(fw);
//            bw.write(12);
            bw.write("class task5B {\n public static void main(String[] args) {\n System.out.println(\"Hello world\";\n}\n}");
            bw.newLine();
        } catch (IOException exception) {
            System.out.println(exception);
        }

        bw.close();
    }
}
