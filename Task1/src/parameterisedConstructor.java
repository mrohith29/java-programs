class paraconst {
    String name;
    int age;
    paraconst(String yourName, int yourAge) {
        name = yourName;
        age = yourAge;
    }

    void display() {
        System.out.println("Your name is "+name+" and your age is "+age);
    }
}
public class parameterisedConstructor {
    public static void main(String[] args) {
        paraconst p1 = new paraconst("Rohith", 19);
        p1.display();
    }
}
