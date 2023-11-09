class parent1 {
    int x;
    void display1() {
        System.out.println(x);
    }
    void kk(int x) {
        this.x = x;
//        System.out.println(this.x);
    }
}

class child1 extends parent1 {
    int x = 100;
//    child1() {
//        System.out.println("zshdjkhasoi");
//    }
    void display1() {
        System.out.println("child class 1");
        System.out.println(x);
    }
    void kk() {
        System.out.println("kjgeufig");
    }
}

class child2 extends parent1 {
    void newPrint() {
        System.out.println("child class 2");
    }
}
public class references {
    public static void main(String[] args) {
        parent1 p1 = new child1();
//        p1.display1();
        p1.kk(10);
        parent1 p2;
//        p1.display1();
//        p2 = p1;
        System.out.println(p1);
//        System.out.println(p2);
//        p2.display1();
//        child1 c1 = new child1();
//        c1.display();
    }
}
