// This is a simple Java program that uses access specifiers

// Public class can be accessed from anywhere
class AccessSpecifiersDemo {
    // Public field can be accessed from anywhere
    public int publicField = 10;
    
    // Private field can only be accessed within the class
    private int privateField = 20;
    
    // Protected field can be accessed within the same package and subclasses
    protected int protectedField = 30;
    
    // Package-private (default) field can be accessed within the same package
    int packagePrivateField = 40;

    // Public method can be accessed from anywhere
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
    
    // Private method can only be accessed within the class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
    
    // Protected method can be accessed within the same package and subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }
    
    // Package-private (default) method can be accessed within the same package
    void packagePrivateMethod() {
        System.out.println("This is a package-private method.");
    }
}

// Another class to demonstrate access to the members of AccessSpecifiersDemo
class AccessDemo {
    public static void main(String[] args) {
        AccessSpecifiersDemo demo = new AccessSpecifiersDemo();
        
        // Access public members from another class
        System.out.println("Public field: " + demo.publicField);
        demo.publicMethod();
        
        // Private members cannot be accessed from another class
        // System.out.println("Private field: " + demo.privateField); // This will result in a compilation error
        // demo.privateMethod(); // This will result in a compilation error
        
        // Access protected and package-private members from another class in the same package
        System.out.println("Protected field: " + demo.protectedField);
        demo.protectedMethod();
        
        System.out.println("Package-Private field: " + demo.packagePrivateField);
        demo.packagePrivateMethod();
    }
}
