abstract class shape {
    abstract double area(); // created an abstract method
//    shape() {
//        System.out.println("The area of the shape is = ");
//    }
}

class circle extends shape {
    int radius;
    circle(int radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI*radius;
    }
}

class rectangle extends shape {
    int length, breadth;
    rectangle(int i, int j) {
        length = i;
        breadth = j;
    }
    double area() {
        return length*breadth;
    }
}
public class first_code {
    public static void main(String[] args) {
        shape s1; // making a reference object to maintain abstraction
        rectangle r1 = new rectangle(10, 20);
        circle c1 = new circle(12);
        s1 = r1;
        System.out.println(s1.area());
        s1 = c1;
        System.out.println(s1.area());
    }
}
