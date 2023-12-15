import java.util.*;
import java.io.IOException;

class pc2 {
    void pm1() throws Exception {
        System.out.println("success");
        throw new ArithmeticException("ArithmaticException");
    }

    void pm2() throws Exception {
        pm1();
        throw new IOException("IOException");
    }

    void pm3() {
        try {
            pm2();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class p2 {
    public static void main(String[] args) {
        pc2 o1 = new pc2();
        o1.pm3();
    }
}
