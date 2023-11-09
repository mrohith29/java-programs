class person {
    String name;
    int age;
    void details(String yourName, int yourAge) {
        name = yourName;
        age = yourAge;
    }

    void display() {
        System.out.println("Your name is "+name+" your age is "+age);
    }
}
public class classAndObject {
    public static void main(String[] args) {
        person person1 = new person();
        person1.details("Rohith", 19);
        person1.display();
    }
}
