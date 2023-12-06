import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class testing {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\mariy\\OneDrive\\Desktop\\github repository\\java-programs\\file handling\\src\\myfile.txt");
//        f.createNewFile("testing.txt");
//        System.out.println("file created");
//        System.out.println(f.length());
//        System.out.println(f.setWritable);
//        System.out.println(f.canWrite());
//        System.out.println(f.getName());
        File ob = new File("C:\\Users\\mariy\\OneDrive\\Desktop\\github repository\\java-programs\\file handling\\src\\text.txt");

//        try {
//            if (ob.createNewFile()) {
//                System.out.println("file created : " + ob.getName());
//            } else {
//                System.out.println("file already exists");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            FileWriter writer = new FileWriter("text.txt");
            writer.write("hi this is rohith");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
