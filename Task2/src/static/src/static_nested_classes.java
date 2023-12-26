public class static_nested_classes {
    int numberOfClasses = 10;
    public static class first_inner_class {
        int newClasses = 20;
        void display() {
            System.out.printf("This method has run correctly \ncongrats "); // this cannot access the outer class variables
        }
    }

    public class second_inner_class {
        void display() {
            System.out.printf("Second method had also run correcly %d",numberOfClasses); // this can access the outer class variables
        }
    }
}

class snc {
    public static void main(String[] args) {
        static_nested_classes.first_inner_class ob =new static_nested_classes.first_inner_class(); // if the inner class is static then we need to create object like this
        static_nested_classes.second_inner_class newob = new static_nested_classes().new second_inner_class(); // if the inner class is not static then we need to create object like this
        ob.display();
        newob.display();
        System.out.println(ob.newClasses);
    }
}

// Use a static inner class when you want a nested class with no direct access to the outer class's instance-specific data, and use a non-static inner class when you need access to both static and instance-specific data of the outer class.