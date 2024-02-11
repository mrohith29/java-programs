public class BreakClass {
    public static void main(String[] args) {
        boolean cond = true;
        first : {
            second : {
                third : {
                    if (cond) {
                        System.out.println("This is third loop");
//                        continue second;
                    }
                }
                System.out.println("this is second loop");
            }
            System.out.println("This is first loop");
        }
    }
}
