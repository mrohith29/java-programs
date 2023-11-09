class MyStaticBlock {
    static {
        System.out.println("Static block executed.");
    }
    static {
        System.out.println("This is also executed");
    }
    MyStaticBlock()
    {
        System.out.println("Constructor executed");
    }
}

public class static_block extends MyStaticBlock{
    static {
        System.out.println("This is Main class static");
    }
    public static void main(String[] args) {
        // The static block will be executed when the class is loaded.
        MyStaticBlock obj = new MyStaticBlock();
//        static_block ob = new static_block();
    }
}

// Static blocks are executed when the class is loaded, while constructors are executed when an object is created.
// Static blocks are used for class-level initialization or one-time setup, whereas constructors are used to initialize object-specific properties.
// Static blocks do not take parameters, but constructors can take parameters to customize object initialization.
// Static blocks are not called explicitly by the programmer and are automatically executed, whereas constructors are called explicitly using the new keyword.
