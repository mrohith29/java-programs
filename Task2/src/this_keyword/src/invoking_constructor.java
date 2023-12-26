public class invoking_constructor {
    int x = 10;
    String name = "rohith";
    invoking_constructor() { // This will invoke the constructor with int parameter
        this(0);
    }

    invoking_constructor(int x) { // this will invoke the constructor with int and string parameter
        this(x, "string_value");
    }

    invoking_constructor(int x, String name) {
        this.x = x;
        this.name = name;
    }

    void display() {
//        this(100, "yellow"); we cannot call constructor from other methods of the same class
        System.out.printf("%d %s",x,name);
    }
}

class ic {
    public static void main(String[] args) {
        invoking_constructor ob1 = new invoking_constructor();
        ob1.display();
    }
}
