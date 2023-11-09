interface In1 {
//    Interfaces cannot have a constructor like classes
    /*
    In1() {
        System.out.println("This is the constructor of interface In1");
    }
     */
     void myMethod();

    default void print() {
        System.out.println("This is the print method in the interface In1");
    }
}

class interfaceExe implements In1 {
    interfaceExe() {
        In1.super.print();
    }
    public void myMethod() {
        System.out.println("This is class method");
    }
}
public class interfaces {
    public static void main(String[] args) {
//        In1 myOb1 = new In1() ;  Interfaces cannot be instanced by object like class
        interfaceExe myOb = new interfaceExe();
        myOb.myMethod();
    }
}

// interfaces are different from class in many forms
