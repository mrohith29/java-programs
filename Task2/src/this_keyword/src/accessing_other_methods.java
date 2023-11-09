class class1 {
    int num = 10;
    class1() {
        this.num = 30;
        this.show(); // we can call other method of this class using 'this'
        show(); // or we can directly access like this also
    }
    void show() {
        System.out.println("the updated value of num is : " + num);
        this.display();
    }

    void display() {
        System.out.println("Yes i am able to access this display() method from the show() method using this.show()");
    }
}

public class accessing_other_methods {
    public static void main(String[] args) {
        class1 thing = new class1();
    }
}
