import java.util.Vector;
public class temp1 {
    public static void main(String[] args) {
Vector<Integer> v = new Vector<Integer>();
        v.add(12);
        v.add(1, 15);
        Vector<Integer> v2 = new Vector<Integer>();
        v2.add(1);
        v2.add(2);
        v2.add(3);
        v.addAll(v2);

        v.removeFirst();
        v.set(0, null);

        System.out.println(v.size());
        System.out.println(v.elements());
        System.out.println(v);
    }
}
