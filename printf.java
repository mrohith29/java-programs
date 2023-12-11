public class printf {
    public static void main(String[] args) {
        System.out.printf("%d", 10);
        System.out.printf("%f", 10.5);
        System.out.printf("%c", 'a');
        System.out.printf("%s", "Hello");
        System.out.printf("%n");
        System.out.printf("%d %f %c %s", 10, 10.5, 'a', "Hello");

        int roll = 101;
        String name = "Rohith";
        float marks = 99.99f;
        System.out.printf("Roll no = %d, Name = %s, Marks = %f", roll, name, marks);

        System.out.printf("%n");

//        System.out.println("%s",name);
        double d = 10.5;
        System.out.printf("%.3e", d);
        System.out.println();
    }
}
