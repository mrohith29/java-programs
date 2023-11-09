import static java.lang.Math.PI;

public class static_import {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

// static is used to import static members of the class and allows to use them without using the class name
