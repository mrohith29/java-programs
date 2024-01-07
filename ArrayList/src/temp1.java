import java.util.ArrayList;

public class temp1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(1, 15);
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al.addAll(al2);

        al.removeFirst();
        al.set(0, null);

        System.out.println(al.size());
        System.out.println(al);

    }
}
