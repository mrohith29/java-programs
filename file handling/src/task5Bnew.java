import java.io.*;
public class task5Bnew {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filePath = br.readLine();
        File f = new File(filePath);
        if (f.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(f));
            String line;
            int lineCount = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(++lineCount + line);
            }
            reader.close();
        }
        br.close();
        FileInputStream fis = new FileInputStream(filePath);
        System.out.println(fis.read());
        System.out.println(f.length());

    }
}
