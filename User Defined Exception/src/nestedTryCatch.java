public class nestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                throw new Exception("Inner Exception");
            } catch (Exception e) {
                System.out.println("Inner catch block");
                System.out.println(e);
            }
//            throw new Exception("Outer Exception");
        } catch (Exception e) {
            System.out.println("Outer catch block");
            System.out.println(e);
        }
    }
}
