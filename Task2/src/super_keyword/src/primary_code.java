class one {
//    int a = 10;
//    int b;
    one() {
//        b = 20;
        System.out.println("Hello from the super class");
        System.out.println(20);
    }

    one(int x)
    {
        System.out.println("This is the constructor overloading");
    }

    void print()
    {
        System.out.println("This is the print method you have accessed ");
    }
}

class two extends one {
    two()
    {
//        super(20);
        super(20);

        System.out.println("Hello from the sub class");
        super.print();
    }

}

public class primary_code {
    public static void main(String[] args) {
        two ob = new two();
//        ob . print();

    }
}
