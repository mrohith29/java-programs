import java.io.*;
public class task5C {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filePath = br.readLine();
        int s,cc =0, ln =0, wd = 0;
        FileInputStream fis = new FileInputStream(filePath);
        do {
            s = fis.read();
            if ((char) s != 1) {
                cc++;
            }
            if ((char) s == ' ' || (char) s == '\n') {
                wd++;
            }
            if ((char) s == '\n') {
                ln++;
            }
        } while (s != -1);

        System.out.println(cc+" "+wd+ " "+ln);
    }
}
