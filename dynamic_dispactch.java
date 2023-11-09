//It is also a code for abstraction
class dD {
    void printd() {
        System.out.println("You are in dD class");
    }
}

class dD1 extends dD {
    void printd() {
        System.out.println("You are in dD1 class");
    }
}

class dD2 extends dD {
    void printd() {
        System.out.println("You are in dD2 class");
    }
}

public class dynamic_dispactch {
    public static void main(String[] args) {
        dD o1 ;//= new dD();
        dD1 o2 = new dD1();
        dD2 o3 = new dD2();
//        o1.printd();
        o1 = o2;
        o1.printd();
        o1 = o3;
        o1.printd();
    }
}
