public class try_keword_2 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println("stmt 1");
        }
        catch (ArithmeticException ae)
        {
            System.out.println("division by zero");
        }
        catch (Exception e)
        {
            System.out.println("exception handling");
        }
        catch (NullPointerException npe)
        {
            System.out.println("null pointer exception");
        }
    }
}
