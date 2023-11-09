package final_keyword;

class method_class {
    final void print() {
        System.out.println("This method cannot be override");
    }
}

class method2_class extends method_class{
//    void print() {  // Trying to do override can lead to error
//        System.out.println("success");
//    }
}
public class final_method {
    public static void main(String[] args) {
        method2_class ob = new method2_class();
        ob.print();
    }
}

//A final method in a class cannot be overridden by its subclasses.
// This is useful when you want to prevent a specific behavior from being changed in a subclass.
