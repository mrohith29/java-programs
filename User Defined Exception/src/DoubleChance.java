class chance {
    void check() {
        try {
            throw new Exception("Inner Exception");
        } catch (Exception e) {
            System.out.println("Inner catch block");
            System.out.println(e);
        }
    }
}
public class DoubleChance {
    public static void main(String[] args) {
        try {
            chance c = new chance();
            c.check();
//            throw new Exception("Outer Exception");
        } catch (Exception e) {
            System.out.println("Outer catch block");
            System.out.println(e);
        }
    }
}
