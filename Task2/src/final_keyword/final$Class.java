package final_keyword;

final class class1 {
    void display() {
        System.out.println("This class cannot inherit its properties and truing to inherit can cause error");
    }
}

//class class2 extends class1 { // trying to access can lead to error
//
//}
public class final$Class {
    public static void main(String[] args) {
        class1 ob = new class1();
        ob.display();
    }
}

// A final class cannot be extended (subclassed).
// This is useful when you want to prevent the creation of subclasses for a specific class, such as when you've designed a class for a specific purpose and don't want it to be extended.