class demonstration {
    public void method()
    {
        System.out.println("method 1 has executed ");
    }

    public void method(int a)
    {
        System.out.println("method 2 has executed");
    }

    public void method(int a, int b)
    {
        System.out.println("method 3 has executed");
    }

    public void method(double a, int b)
    {
        System.out.println("method 4 has executed");
    }
}
class overloading
{
    public static void main(String[] args)
    {
        int a = 10,b = 10;
        double c = 10.0;
        demonstration demo1 = new demonstration();
        demo1.method();
        demo1.method(a);
        demo1.method(a,b);
        demo1.method(c,a);
    }
}

