class Animal {
    String name;
    int age;
    String sound;

    void makesound() {
        System.out.println(name + " " + sound);
    }
}

class Lion extends Animal {
    String nameColor;
    void makesound() {
        System.out.println("Roar!");
    }
}

class Elephant extends Animal {
    double tuskLength;
    void makesound() {
        System.out.println("Trumpet!");
    }
}
public class Zoo_management_system {
    public static void main(String[] args) {
        Lion L1 = new Lion();
        L1.makesound();
        Elephant E1 = new Elephant();
        E1.makesound();
    }
}
