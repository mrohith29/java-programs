interface vehicle {
    void engine_sound();
}

class bugatti implements vehicle {
    public void engine_sound() {
        System.out.println("wroom wroom");
    }
}
public class abstraction_new {
    public static void main(String[] args) {
        bugatti c1 = new bugatti();
        c1.engine_sound();
    }
}
