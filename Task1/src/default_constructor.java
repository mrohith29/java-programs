class newClass1 {
    int a = 10, b = 20;
    newClass1() {
        System.out.println("The sum of 'a' and 'b' is "+(a+b));
    }
}
public class default_constructor {
    public static void main(String[] args) {
        newClass1 ob = new newClass1();
    }
}
