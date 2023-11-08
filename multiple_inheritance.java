interface I1 {
    default void print() {
        System.out.println("This is interface 1 implemented");
    }
}

interface I2 {
    default void print() {
        System.out.println("This is interface 2 implemented");
    }
}

class multiple_inheritance implements I1, I2 {
    public void print() {
        I1.super.print(); // this will invoke the print method of I1 interface
        I2.super.print(); // this will invoke the print method of I2 interface
    }

    public void show() {
        print();
    }

    public static void main(String[] args) {
        multiple_inheritance ob1 = new multiple_inheritance();
        ob1.show();
    }
}
