public class try_keyword {
    public static void main(String[] args) {
        try {
//            System.out.println(10/0);
            String x = null;
            System.out.println(x.length());
        }
        catch (NullPointerException npe) {
            System.out.println("npe error");
        }
        catch (Exception e)
        {
            System.out.println("this is exception statement");
        }
        finally {
            System.out.println("This is the final keyword sout");
        }
    }
}
