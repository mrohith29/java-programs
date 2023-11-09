// Generally we use method overloading technique for passing different number arguments to a method, but using this thing called varargs we can pass as many arguments of same datatype to it
public class varargs {

static String print(String ...arg)
    {
        String x = "";
        for (String i : arg)
        {
            x += i;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(print("hello ", "my ", "name ", "is ", "rohith "));
    }
}
