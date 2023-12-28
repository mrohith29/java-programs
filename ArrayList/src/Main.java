import java.util.ArrayList;
import java.util.*;

class Main  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Al = new ArrayList<>();
        Al.add(1);
        Al.add(2);
        Al.add(9);
        Al.add(4);
        Al.add(4);
        Al.add(6);
        ArrayList arr = null;// new ArrayList(Al);
        arr.addAll(Al);


        ArrayList arr1 = new ArrayList();
        arr1.addAll(Al);
//        arr1.clear();
//        arr1.clone();
//
//        System.out.println(arr);
//        System.out.println(arr1.containsAll(Al));
//        System.out.println(arr1.indexOf(50));
//        System.out.println(arr1.lastIndexOf(4));
//        System.out.println(arr1.retainAll(1,4));
//        System.out.println(arr1);
//        int size = sc.nextInt();
//        for (int i = 0; i < size; i++) {
//            Al.add(sc.nextInt());
//        }
//        System.out.println(Al.get(2));
//        Al.add(2,10);
//        System.out.println(Al);
//        Al.removeFirst();
//       Al.removeAll();
//        System.out.println(Al);
//        for (int i = 0; i < arr1.size(); i++) {
//            System.out.println(arr1.get(i));
//        }
//        arr1.add(1, 10);
//        Collections.sort(Al);
//        System.out.println(Al);
        int x = 100;
        Integer y = Integer.valueOf(x);
//        System.out.println(y + " "+ x);
        int z = y.intValue();
        System.out.println(z);


        System.out.println(Collections.addAll(Al));
        System.out.println(Collections.frequency(Al, 4));
        Collections.reverseOrder();
//        Collector.of()
    }
}